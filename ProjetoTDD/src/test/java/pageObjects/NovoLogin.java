package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NovoLogin {

	private static WebElement element = null;

	public static WebElement txt_Usuario(WebDriver driver) {

		element = driver.findElement(By.name("username"));

		return element;

	}

	public static WebElement txt_Senha(WebDriver driver) {

		element = driver.findElement(By.name("password"));

		return element;

	}

	public static WebElement btn_Logar(WebDriver driver) {

		element = driver.findElement(By.id("sign_in_btnundefined"));

		return element;

	}

}
