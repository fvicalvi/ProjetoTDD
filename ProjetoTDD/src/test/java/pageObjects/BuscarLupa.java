package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarLupa {

	private static WebElement element = null;

	public static WebElement Lupa(WebDriver driver) {

		element = driver.findElement(By.id("autoComplete"));

		return element;

	}
	
	public static WebElement Produto(WebDriver driver) {
		
		element = driver.findElement(By.id("16"));
		
		return element;
		
	}

}
