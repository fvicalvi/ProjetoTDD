package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub.tdd.pageObjects.NovoCadastro;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub.tdd.utils.ConfiguraReport;
import br.com.rsinet.hub.tdd.utils.ConfiguraScreenShot;
import br.com.rsinet.hub.tdd.utils.ExcelMassaDeDados;
import br.com.rsinet.hub.tdd.utils.ExcelUtils;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;

public class RealizarCadastro {

	static WebDriver driver;
	private WebDriverWait wait;
	private ExtentTest test;
	private String nomeTeste;
	private String nomeDoPrint;

	PaginaInicial inicial;
	NovoCadastro cadastro;
	ExcelMassaDeDados excel;

	@BeforeTest
	public void iniciaReport() {

		ConfiguraReport.criaReport("fazer cadastro");

	}

	@BeforeMethod
	public void Inicializar() throws Exception {

		// inicializa o driver e abre o navegador
		driver = InicializaDriver.criarDriver();

		// Inicializa as paginas inicial e cadastro
		inicial = PageFactory.initElements(driver, PaginaInicial.class);
		cadastro = PageFactory.initElements(driver, NovoCadastro.class);

		ExcelUtils.setarArquivoExcel("C:\\Users\\felipe.oliveira\\eclipse-workspace\\ProjetoTDD\\src\\test\\resources\\massa\\teste.xlsx", "Planilha1");
		excel = new ExcelMassaDeDados();

		new WebDriverWait(driver, 10);
	}

	@Test
	public void cadastroComSucesso() throws Exception {

		nomeTeste = "cadastro com sucesso";
		nomeDoPrint = "cadastro com sucesso";

		inicial.clicarMenuUsuario();
		inicial.criarNovoCadastro();

		cadastro.inserirUsuario(excel.getUserName());
		cadastro.inserirEmail(excel.getEmail());
		cadastro.inserirSenha(excel.getSenha());
		cadastro.inserirConfirmaSenha(excel.getConfirmarSenha());
		cadastro.inserirNome(excel.getNome());
		cadastro.inserirSobrenome(excel.getSobrenome());
//		cadastro.inserirTelefone(excel.getTelefone());
//		cadastro.inserirPais(excel.getPais());
//		cadastro.inserirCidade(excel.getCidade());
//		cadastro.inserirEndereco(excel.getEndereco());
//		cadastro.inserirEstado(excel.getEstado());
//		cadastro.inserirCep(excel.getCEP());
		cadastro.clicarAceitar();
		cadastro.clicarRegistrar();
		
		
		WebElement hiUser = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String textoNome = hiUser.getText();
		wait.until(ExpectedConditions.visibilityOf(hiUser));
		assertEquals(textoNome, excel.getUserName());
		
		
		
	}
	
	
	
	@Test
	public void cadastroFalhou() throws Exception {
		
		nomeTeste = "cadastro falhou";
		nomeDoPrint = "cadastro falhou";

		inicial.clicarMenuUsuario();
		inicial.criarNovoCadastro();
		cadastro.clicarAceitar();
		cadastro.clicarRegistrar();
	}
	

	@AfterMethod
	public void finalizaTest(ITestResult result) throws IOException {

		test = ConfiguraReport.criaTest(nomeTeste);
		ConfiguraReport.reportStatus(test, result, driver);
		ConfiguraScreenShot.tiraPrint(driver, nomeDoPrint);

		//driver.quit();
	}

	@AfterTest
	public void finalizaExtent() {
		ConfiguraReport.fechaExtent();

	}

}
