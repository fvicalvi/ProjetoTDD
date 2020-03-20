package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Buscar_Lupa;
import pageObjects.Pagina_Inicial;

public class Realizar_Busca_Lupa {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");

		Pagina_Inicial.Buscar(driver).click();
		Buscar_Lupa.Lupa(driver).sendKeys("tablets");
		Buscar_Lupa.Lupa(driver).sendKeys(Keys.ENTER);
		Buscar_Lupa.Produto(driver).click();

	}

}
