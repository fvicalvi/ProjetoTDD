package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import br.com.rsinet.hub.tdd.pageObjects.NovoLogin;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub.tdd.utils.ConfiguraReport;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;

public class RealizarLogin {

	static WebDriver driver;
	

	PaginaInicial Inicial;
	NovoLogin Login;

	@BeforeTest
	public void iniciaReport () {
		
	ConfiguraReport.criaReport();
	
	}
	
	
	@BeforeMethod
	public void Inicializar() {

		// inicializa o driver e abre o navegador
		driver = InicializaDriver.criarDriver();

		// Inicializa as paginas inicial e login
		Inicial = PageFactory.initElements(driver, PaginaInicial.class);
		Login = PageFactory.initElements(driver, NovoLogin.class);

	}

	@Test
	public void realizarLoginSucesso() {

		Inicial.menuUsuario.click();
		Login.fazerLogin("Usuario2020", "Ab123456");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement hiUser = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String textoNome = hiUser.getText();
		assertEquals(textoNome, "Usuario2020");

	}

	@Test
	public void realizarLoginFalha() {

		Inicial.menuUsuario.click();
		Login.fazerLogin("Usuario2020", "senhaerrada");

		WebDriverWait aguardar = new WebDriverWait(driver, 10);
		WebElement validar = driver.findElement(By.id("signInResultMessage"));
		aguardar.until(ExpectedConditions.textToBePresentInElement(validar, "Incorrect user name or password."));

		String validacao = validar.getText();
		assertEquals(validacao, "Incorrect user name or password.");

	}

	@AfterMethod
	public void finalizaTest() {
		ConfiguraReport.reportStatus();
		
		driver.quit();
	}
	
		
	
	
}
