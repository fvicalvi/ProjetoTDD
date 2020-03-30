package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Produtos {
	
	final WebDriver driver;

	@FindBy(how = How.ID, using = "16")
	private  WebElement txtProdutoDaTela;

	@FindBy(how = How.ID, using = "11")
	private WebElement txtProdutoDoCampo;

	

	public void SelecionarProdutoDaTela() {
		txtProdutoDaTela.click();
	}

	public void SelecionarProdutoDoCampo() {
		txtProdutoDoCampo.click();
	}
	
		
	public Produtos(WebDriver driver) {
		this.driver = driver;
	}

}

