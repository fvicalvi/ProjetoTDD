package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Novo_Cadastro {

	private static WebElement element = null;

	public static WebElement txt_Username(WebDriver driver) {

		element = driver.findElement(By.name("usernameRegisterPage"));

		return element;
	}

	public static WebElement txt_Email(WebDriver driver) {

		element = driver.findElement(By.name("emailRegisterPage"));

		return element;
	}

	public static WebElement txt_Password(WebDriver driver) {

		element = driver.findElement(By.name("passwordRegisterPage"));

		return element;
	}

	public static WebElement txt_ConfirmaPassword(WebDriver driver) {

		element = driver.findElement(By.name("confirm_passwordRegisterPage"));

		return element;
	}

	public static WebElement txt_Nome(WebDriver driver) {

		element = driver.findElement(By.name("first_nameRegisterPage"));

		return element;

	}

	public static WebElement txt_Sobrenome(WebDriver driver) {

		element = driver.findElement(By.name("last_nameRegisterPage"));

		return element;

	}

	public static WebElement txt_Telefone(WebDriver driver) {

		element = driver.findElement(By.name("phone_numberRegisterPage"));

		return element;
	}

	public static WebElement box_Pais(WebDriver driver) {

		element = driver.findElement(By.name("countryListboxRegisterPage"));

		return element;

	}

	public static WebElement txt_Cidade(WebDriver driver) {

		element = driver.findElement(By.name("cityRegisterPage"));

		return element;
	}

	public static WebElement txt_Endereco(WebDriver driver) {

		element = driver.findElement(By.name("addressRegisterPage"));

		return element;

	}

	public static WebElement txt_Estado(WebDriver driver) {

		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));

		return element;

	}

	public static WebElement txt_Cep(WebDriver driver) {

		element = driver.findElement(By.name("postal_codeRegisterPage"));

		return element;

	}

	public static WebElement check_Aceitar(WebDriver driver) {

		element = driver.findElement(By.name("i_agree"));

		return element;

	}

	public static WebElement btn_Registrar(WebDriver driver) {

		element = driver.findElement(By.id("register_btnundefined"));

		return element;
	}

}
