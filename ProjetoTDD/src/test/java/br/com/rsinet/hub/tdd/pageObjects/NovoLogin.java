package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoLogin {

	private static WebElement element = null;

	public static WebElement txtUsuario(WebDriver driver) {

		element = driver.findElement(By.name("username"));

		return element;

	}

	public static WebElement txtSenha(WebDriver driver) {

		element = driver.findElement(By.name("password"));

		return element;

	}

	public static WebElement btnLogar(WebDriver driver) {

		element = driver.findElement(By.id("sign_in_btnundefined"));

		return element;

	}


}


