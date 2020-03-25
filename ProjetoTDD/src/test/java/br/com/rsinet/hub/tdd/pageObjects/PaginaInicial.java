package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial {

	private static WebElement element = null;

	public static WebElement menuUsuario(WebDriver driver) {

		element = driver.findElement(By.id("menuUserLink"));

		return element;

	}

	public static WebElement clicarCadastro(WebDriver driver) {

		element = driver.findElement(By.linkText("CREATE NEW ACCOUNT"));

		return element;
	}

	public static WebElement clicarBuscar(WebDriver driver) {

		element = driver.findElement(By.id("menuSearch"));

		return element;
	}

	public static WebElement clicarBanner(WebDriver driver) {

		element = driver.findElement(By.id("headphonesImg"));

		return element;
	}

	public static WebElement produtoBanner(WebDriver driver) {

		element = driver.findElement(By.id("15"));

		return element;
	}

}
