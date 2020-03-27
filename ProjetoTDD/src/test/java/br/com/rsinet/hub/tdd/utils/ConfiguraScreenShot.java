package br.com.rsinet.hub.tdd.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ConfiguraScreenShot {
	
	public static String tiraPrint(WebDriver driver, String nomeDoPrint) {
		TakesScreenshot print = (TakesScreenshot) driver;
		File src = print.getScreenshotAs(OutputType.FILE);
		String caminhoDoPrint = System.getProperty("user.dir") + "/Screenshots/" + nomeDoPrint + ".png";
		
	
		File destino = new File(caminhoDoPrint);

		try {
			FileUtils.copyFile(src, destino);
		} catch (IOException e) {
			System.out.println(" O print falhou " + e.getMessage());
		}

		return caminhoDoPrint;
		
		
		
		
	}

}
