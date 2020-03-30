package br.com.rsinet.hub.tdd.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub.tdd.pageObjects.Produtos;
import br.com.rsinet.hub.tdd.utils.ConfiguraReport;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;
import br.com.rsinet.hub.tdd.pageObjects.NovoLogin;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;

public class RealizarBuscaLupa {
	
	static WebDriver driver;
	private ExtentTest test;
	private String nomeTeste;
	

	PaginaInicial inicial;
	Produtos produtos;
	private String nomeDoPrint;
	
	
	@BeforeTest
	public void iniciaReport () {
		
	ConfiguraReport.criaReport("buscar produto lupa");
	
	}
	
	
	@BeforeMethod
	public void Inicializar() {

		// inicializa o driver e abre o navegador
		driver = InicializaDriver.criarDriver();

		// Inicializa as paginas inicial e produtos
		inicial = PageFactory.initElements(driver, PaginaInicial.class);
		produtos = PageFactory.initElements(driver, Produtos.class);

	}


	@Test
	public void pesquisarLupa() {
		
		nomeTeste =  "buscar lupa sucesso";
		nomeDoPrint = "buscar lupa sucesso";
		
		inicial.buscarLupa();
		produtos.SelecionarProdutoDoCampo();
		
	}
//		PaginaInicial.clicarBuscar(driver).click();
//		BuscarLupa.Lupa(driver).sendKeys("tablets");
//		BuscarLupa.Lupa(driver).sendKeys(Keys.ENTER);
//		BuscarLupa.Produto(driver).click();
//
//	}

}
