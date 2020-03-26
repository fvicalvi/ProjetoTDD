package br.com.rsinet.hub.tdd.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.rsinet.hub.tdd.pageObjects.NovoCadastro;
import br.com.rsinet.hub.tdd.pageObjects.PaginaInicial;

public class RealizarCadastro {

//	private static WebDriver driver = null;
//
//	public static void main(String[] args) {
//
//		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";
//
//		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		driver.get("https://www.advantageonlineshopping.com/#/");
//
//		PaginaInicial.menuUsuario(driver).click();
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", PaginaInicial.clicarCadastro(driver));
//
//		NovoCadastro.txtUsername(driver).sendKeys("Usuario12345");
//		NovoCadastro.txtEmail(driver).sendKeys("usuario@teste.com.br");
//		NovoCadastro.txtPassword(driver).sendKeys("Ab123456");
//		NovoCadastro.txtConfirmaPassword(driver).sendKeys("Ab123456");
//		NovoCadastro.txtNome(driver).sendKeys("Teste");
//		NovoCadastro.txtSobrenome(driver).sendKeys("QA");
//		NovoCadastro.txtTelefone(driver).sendKeys("95275460");
//
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		Select listbox_Pais = new Select(NovoCadastro.boxPais(driver));
//		listbox_Pais.selectByValue("object:139");
//
//		NovoCadastro.txtEstado(driver).sendKeys("SP");
//		NovoCadastro.txtCidade(driver).sendKeys("São Paulo");
//		NovoCadastro.txtEndereco(driver).sendKeys("Rua teste");
//		NovoCadastro.txtCep(driver).sendKeys("01203-001");
//		NovoCadastro.checkAceitar(driver).click();
//		NovoCadastro.btnRegistrar(driver).click();
//
//	}

}