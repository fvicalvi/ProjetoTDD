package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NovoCadastro {

	final WebDriver driver;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtUsername;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtPassword;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtConfirmaPassword;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtSobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement boxPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtCep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement checkAceitar;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegistrar;

	public void inserirUsuario(String nomeUsuario) throws Exception {

		txtUsername.sendKeys(nomeUsuario);
	}

	public void inserirEmail(String email) throws Exception {

		txtEmail.sendKeys(email);
	}

	public void inserirSenha(String senha) throws Exception {

		txtPassword.sendKeys(senha);
	}

	public void inserirConfirmaSenha(String confirmaSenha) throws Exception {

		txtConfirmaPassword.sendKeys(confirmaSenha);
	}

	public void inserirNome(String nome) throws Exception {

		txtNome.sendKeys(nome);
	}

	public void inserirSobrenome(String sobrenome) throws Exception {

		txtSobrenome.sendKeys(sobrenome);
	}

	public void inserirTelefone(String telefone) throws Exception {

		txtTelefone.sendKeys(telefone);
	}

	public void inserirPais(String pais) throws Exception, InterruptedException {

		Select select = new Select(boxPais);
		select.selectByVisibleText(pais);
	}

	public void inserirCidade(String cidade) throws Exception {

		txtCidade.sendKeys(cidade);
	}

	public void inserirEndereco(String endereco) throws Exception {

		txtEndereco.sendKeys(endereco);
	}

	public void inserirEstado(String estado) throws Exception {

		txtEstado.sendKeys(estado);
	}

	public void inserirCep(String cep) throws Exception {

		txtCep.sendKeys(cep);
	}

	public void clicarAceitar() {

		checkAceitar.click();
	}

	public void clicarRegistrar() {

		btnRegistrar.click();
	}

	public NovoCadastro(WebDriver driver) {

		this.driver = driver;
	}

}
