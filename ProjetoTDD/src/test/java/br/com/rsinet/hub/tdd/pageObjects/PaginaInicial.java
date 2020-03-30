package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaginaInicial {
	
	final WebDriver driver;
	
	
	@FindBy(how = How.ID, using = "menuUserLink")
	
	public WebElement menuUsuario;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	
	public WebElement clicarCadastro;
	
	@FindBy(how = How.ID, using = "menuSearch")
	
	public WebElement clicarBuscar;
	
	@FindBy(how = How.ID, using = "headphonesImg")
	
	public WebElement clicarBanner;
	
	@FindBy(how = How.ID, using = "15")
	
	public WebElement produtoBanner;
	
	
	public void clicarMenuUsuario() {
		
		menuUsuario.click();
	}
	
	public void criarNovoCadastro() {
		
		clicarCadastro.click();
	}
	
	
	
	
	public PaginaInicial(WebDriver driver) {
	 
	 this.driver = driver;

}
	
	
}







