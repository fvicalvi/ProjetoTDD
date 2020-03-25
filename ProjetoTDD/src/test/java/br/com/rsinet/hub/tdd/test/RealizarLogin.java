package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import br.com.rsinet.hub.tdd.pageObjects.NovoLogin;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;
import br.com.rsinet.hub.tdd.utils.InicializaDriver;

public class RealizarLogin {

	private WebDriver driver;

	@BeforeMethod
	public void Inicializar() {
		driver = InicializaDriver.criarDriver();

		}

	@Test
	public void realizarLoginSucesso() {

		PaginaInicial.menuUsuario(driver).click();
		NovoLogin.txtUsuario(driver).sendKeys("Usuario012");
		NovoLogin.txtSenha(driver).sendKeys("Ab123456");
		NovoLogin.btnLogar(driver).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		WebElement hiUser = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String textoNome = hiUser.getText();
		assertEquals(textoNome, "Usuario012");
		
		
		}

	
	@Test
	public void realizarLoginFalha() {
		
		PaginaInicial.menuUsuario(driver).click();
		NovoLogin.txtUsuario(driver).sendKeys("Usuario012");
		NovoLogin.txtSenha(driver).sendKeys("senhaerrada");
		NovoLogin.btnLogar(driver).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement validar = driver.findElement(By.id("signInResultMessage"));
		String validacao = validar.getText();
		assertEquals(validacao, "OR");
		
	}
	
	

	@AfterMethod
	public void Fechar() {
		driver.quit();
	}

}
