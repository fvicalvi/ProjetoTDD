package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub.tdd.pageObjects.Produtos;
import br.com.rsinet.hub.tdd.utils.ConfiguraReport;
import br.com.rsinet.hub.tdd.utils.ConfiguraScreenShot;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;
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
		
		inicial.clicarLupa();
		produtos.buscarProdutoLupa("tablets");
		produtos.produtoEscolhido();
		
		WebElement txtProduto = driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']"));
		String produtoNome = txtProduto.getText();
		assertEquals(produtoNome, "HP ELITEPAD 1000 G2 TABLET");
	}

	
	@Test
	public void pesquisarInexistenteLupa() {
		
		nomeTeste = "buscar inexistente";
		nomeDoPrint = "buscar inexistente";
		
		inicial.clicarLupa();
		produtos.buscarProdutoLupa("playstation");
		
		WebElement txtProduto = driver.findElement(By.xpath("//div[@class='textAlignCenter ng-scope']"));
		String produtoNome = txtProduto.getText();
		assertEquals(produtoNome, "No results for \"playstation\"");
		
		
	}
	
	
	@AfterMethod
	public void finalizaTest(ITestResult result ) throws IOException {
		
			test = ConfiguraReport.criaTest(nomeTeste);
			ConfiguraReport.reportStatus(test, result, driver);
			ConfiguraScreenShot.tiraPrint(driver, nomeDoPrint);
			
			driver.quit();
	}
		
	
		
	@AfterTest
	public void finalizaExtent () {
		ConfiguraReport.fechaExtent();
		
	}
	
}
