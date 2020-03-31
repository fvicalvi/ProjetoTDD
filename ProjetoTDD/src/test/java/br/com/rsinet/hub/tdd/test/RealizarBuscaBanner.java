package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub.tdd.pageObjects.Produtos;
import br.com.rsinet.hub.tdd.utils.ConfiguraReport;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;

public class RealizarBuscaBanner {
	
	
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

//	@Test
//	public void clicarBanner() {
//		
//		inicial.clicarImgBanner();
//		produtos.buscarProdutoBanner();
//		
//		WebElement txtProduto = driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']"));
//		String produtoNome = txtProduto.getText();
//		assertEquals(produtoNome, "BOSE SOUNDLINK BLUETOOTH SPEAKER III");
//		
//	}
	
	@Test
	public void clicarBannerInexistente() {
	inicial.clicarProdutoInexistente();
	}
	
}
