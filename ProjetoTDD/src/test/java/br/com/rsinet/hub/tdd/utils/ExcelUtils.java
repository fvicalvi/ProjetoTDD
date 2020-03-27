package br.com.rsinet.hub.tdd.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	public static void setarArquivoExcel(String Caminho, String SheetNome) throws Exception {

		try {

			FileInputStream ArquivoExcel = new FileInputStream(Caminho);
			ExcelWBook = new XSSFWorkbook(ArquivoExcel);
			ExcelWSheet = ExcelWBook.getSheet(SheetNome);

		} catch (Exception e) {

			throw (e);

		}
	}

	public static String getCellData(int RowNum, int ColNum) {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

}
