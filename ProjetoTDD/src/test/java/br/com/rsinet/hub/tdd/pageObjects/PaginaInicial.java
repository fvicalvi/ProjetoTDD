package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaginaInicial {
	
	final WebDriver driver;
	private JavascriptExecutor js;
	
	
	@FindBy(how = How.ID, using = "menuUserLink")
	
	public WebElement menuUsuario;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	
	public WebElement clicarCadastro;
	
	@FindBy(how = How.ID, using = "menuSearch")
	
	public WebElement clicarBuscar;
	
	
	public void clicarMenuUsuario() {
		
		menuUsuario.click();
	}
	
	public void criarNovoCadastro() {
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clicarCadastro);
	}
	
	
	public void buscarLupa() {
		
		clicarBuscar.click();
		
	}
	
	
	
	public PaginaInicial(WebDriver driver) {
	 
	 this.driver = driver;

}
	
	
}







