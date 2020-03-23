package br.com.rsinet.hub.tdd.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub.tdd.pageObjects.NovoLogin;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;

public class RealizarLogin {

	private static WebDriver driver = null;

	@Test
	public void realizarLogin() {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");

		PaginaInicial.Usuario(driver).click();
		NovoLogin.txt_Usuario(driver).sendKeys("Usuario");
		NovoLogin.txt_Senha(driver).sendKeys("Ab123456");
		NovoLogin.btn_Logar(driver).click();
		
		
		
		driver.quit();
	
	
	}
	
	
	
}
