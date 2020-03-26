package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NovoLogin {
	
	final WebDriver driver;
	
	@FindBy(how = How.NAME, using = "username")
	
	public WebElement txtUsuario;
	
	@FindBy (how = How.NAME, using = "password")
	
	public WebElement txtSenha;
	
	@FindBy (how = How.ID, using = "sign_in_btnundefined")
	
	public WebElement btnLogar;
	
	public NovoLogin(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void fazerLogin(String sUsuario, String sSenha) {
		
		txtUsuario.sendKeys(sUsuario);
		txtSenha.sendKeys(sSenha);
		btnLogar.click();
	}
}



