package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoCadastro {

	private static WebElement element = null;

	public static WebElement txtUsername(WebDriver driver) {

		element = driver.findElement(By.name("usernameRegisterPage"));

		return element;
	}

	public static WebElement txtEmail(WebDriver driver) {

		element = driver.findElement(By.name("emailRegisterPage"));

		return element;
	}

	public static WebElement txtPassword(WebDriver driver) {

		element = driver.findElement(By.name("passwordRegisterPage"));

		return element;
	}

	public static WebElement txtConfirmaPassword(WebDriver driver) {

		element = driver.findElement(By.name("confirm_passwordRegisterPage"));

		return element;
	}

	public static WebElement txtNome(WebDriver driver) {

		element = driver.findElement(By.name("first_nameRegisterPage"));

		return element;

	}

	public static WebElement txtSobrenome(WebDriver driver) {

		element = driver.findElement(By.name("last_nameRegisterPage"));

		return element;

	}

	public static WebElement txtTelefone(WebDriver driver) {

		element = driver.findElement(By.name("phone_numberRegisterPage"));

		return element;
	}

	public static WebElement boxPais(WebDriver driver) {

		element = driver.findElement(By.name("countryListboxRegisterPage"));

		return element;

	}

	public static WebElement txtCidade(WebDriver driver) {

		element = driver.findElement(By.name("cityRegisterPage"));

		return element;
	}

	public static WebElement txtEndereco(WebDriver driver) {

		element = driver.findElement(By.name("addressRegisterPage"));

		return element;

	}

	public static WebElement txtEstado(WebDriver driver) {

		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));

		return element;

	}

	public static WebElement txtCep(WebDriver driver) {

		element = driver.findElement(By.name("postal_codeRegisterPage"));

		return element;

	}

	public static WebElement checkAceitar(WebDriver driver) {

		element = driver.findElement(By.name("i_agree"));

		return element;

	}

	public static WebElement btnRegistrar(WebDriver driver) {

		element = driver.findElement(By.id("register_btnundefined"));

		return element;
	}

}
