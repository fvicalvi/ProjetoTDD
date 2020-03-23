package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Novo_Cadastro;
import pageObjects.Pagina_Inicial;

public class Realizar_Cadastro {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String driverExecutablePath = "C:\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.advantageonlineshopping.com/#/");

		Pagina_Inicial.Usuario(driver).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Pagina_Inicial.Cadastro(driver));

		Novo_Cadastro.txtUsername(driver).sendKeys("Usuario");
		Novo_Cadastro.txtEmail(driver).sendKeys("usuario@teste.com.br");
		Novo_Cadastro.txtPassword(driver).sendKeys("Ab123456");
		Novo_Cadastro.txtConfirmaPassword(driver).sendKeys("Ab123456");
		Novo_Cadastro.txtNome(driver).sendKeys("Teste");
		Novo_Cadastro.txtSobrenome(driver).sendKeys("QA");
		Novo_Cadastro.txtTelefone(driver).sendKeys("95275460");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Select listbox_Pais = new Select(Novo_Cadastro.boxPais(driver));
		listbox_Pais.selectByValue("object:139");

		Novo_Cadastro.txtEstado(driver).sendKeys("SP");
		Novo_Cadastro.txtCidade(driver).sendKeys("São Paulo");
		Novo_Cadastro.txtEndereco(driver).sendKeys("Rua teste");
		Novo_Cadastro.txtCep(driver).sendKeys("01203-001");
		Novo_Cadastro.checkAceitar(driver).click();
		Novo_Cadastro.btnRegistrar(driver).click();
		

	}

}