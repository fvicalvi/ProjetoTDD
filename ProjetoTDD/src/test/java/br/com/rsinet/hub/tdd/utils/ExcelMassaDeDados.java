package br.com.rsinet.hub.tdd.utils;

public class ExcelMassaDeDados {
	
	public String getUserName() throws Exception {
		return ExcelUtils.getCellData(0, 0);
	}
	

	public String getEmail() throws Exception {
		return ExcelUtils.getCellData(0, 1);
	}

	public String getSenha() throws Exception {
		return ExcelUtils.getCellData(0, 2);
	}

	public String getConfirmarSenha() throws Exception {
		return ExcelUtils.getCellData(0, 3);
	}

	public String getNome() throws Exception {
		return ExcelUtils.getCellData(0, 4);
	}

	public String getSobrenome() throws Exception {
		return ExcelUtils.getCellData(0, 5);
	}

	public String getTelefone() throws Exception {
		return ExcelUtils.getCellData(0, 6);
	}

	public String getPais() throws Exception {
		return ExcelUtils.getCellData(0, 7);
	}

	public String getCidade() throws Exception {
		return ExcelUtils.getCellData(0, 8);
	}

	public String getEndereco() throws Exception {
		return ExcelUtils.getCellData(0, 9);
	}

	public String getEstado() throws Exception {
		return ExcelUtils.getCellData(0, 10);
	}

	public String getCEP() throws Exception {
		return ExcelUtils.getCellData(0, 11);
	}

	
	

}
