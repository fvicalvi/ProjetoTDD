package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Novo_Login;
import pageObjects.Pagina_Inicial;

public class Realizar_Login {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");

		Pagina_Inicial.Usuario(driver).click();
		Novo_Login.txt_Usuario(driver).sendKeys("Usuario");
		Novo_Login.txt_Senha(driver).sendKeys("Ab123456");
		Novo_Login.btn_Logar(driver).click();
	
	
	}
	
	
	
}
