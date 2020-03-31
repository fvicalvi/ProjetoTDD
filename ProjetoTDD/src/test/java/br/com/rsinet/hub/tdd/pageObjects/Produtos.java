package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Produtos {

	final WebDriver driver;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement txtBuscarProduto;

	@FindBy(how = How.ID, using = "16")
	private WebElement imgProduto;

	@FindBy(how = How.ID, using = "20")
	private WebElement imgProdutoBanner;

	public void buscarProdutoLupa(String nomeDoProduto) {
		txtBuscarProduto.sendKeys(nomeDoProduto);
		txtBuscarProduto.sendKeys(Keys.ENTER);

	}

	public void produtoEscolhido() {
		imgProduto.click();

	}

	public void buscarProdutoBanner() {
		imgProdutoBanner.click();

	}

	public Produtos(WebDriver driver) {
		this.driver = driver;
	}

}
