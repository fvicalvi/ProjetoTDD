package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Pagina_Inicial;

public class Realizar_Busca_Banner {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");
		
		Pagina_Inicial.Banner(driver).click();
		Pagina_Inicial.produtoBanner(driver).click();
		

	}

}
