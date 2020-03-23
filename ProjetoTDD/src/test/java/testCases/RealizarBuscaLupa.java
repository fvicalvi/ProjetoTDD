package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.BuscarLupa;
import pageObjects.PaginaInicial;

public class RealizarBuscaLupa {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");

		PaginaInicial.Buscar(driver).click();
		BuscarLupa.Lupa(driver).sendKeys("tablets");
		BuscarLupa.Lupa(driver).sendKeys(Keys.ENTER);
		BuscarLupa.Produto(driver).click();

	}

}
