package br.com.rsinet.hub.tdd.test;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import br.com.rsinet.hub.tdd.pageObjects.NovoLogin;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;

public class RealizarLogin {

	private static WebDriver driver = null;

	@BeforeMethod
	public void Inicializar() {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");

	}

	@Test
	public void realizarLoginSucesso() {

		PaginaInicial.Usuario(driver).click();
		NovoLogin.txt_Usuario(driver).sendKeys("Usuario");
		NovoLogin.txt_Senha(driver).sendKeys("Ab123456");
		NovoLogin.btn_Logar(driver).click();

		WebElement hiUser = driver.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String textoNome = hiUser.getText();
		assertEquals(textoNome, "Usuario");

	}

//	public void realizarLoginFalha() {
//
//		PaginaInicial.Usuario(driver).click();
//		NovoLogin.txt_Usuario(driver).sendKeys("Usuario");
//		NovoLogin.txt_Senha(driver).sendKeys("senhaerrada");
//		NovoLogin.btn_Logar(driver).click();
//
//	}

	@AfterMethod
	public void Fechar() {
		driver.quit();
	}

}
