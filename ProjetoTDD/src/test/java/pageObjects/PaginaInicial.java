package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial {

	private static WebElement element = null;

	public static WebElement Usuario(WebDriver driver) {

		element = driver.findElement(By.id("menuUserLink"));

		return element;

	}

	public static WebElement Cadastro(WebDriver driver) {

		element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));

		return element;
	}

	public static WebElement Buscar(WebDriver driver) {

		element = driver.findElement(By.id("menuSearch"));

		return element;
	}

	public static WebElement Banner(WebDriver driver) {

		element = driver.findElement(By.id("headphonesImg"));

		return element;
	}

	public static WebElement produtoBanner(WebDriver driver) {

		element = driver.findElement(By.id("15"));

		return element;
	}

}
