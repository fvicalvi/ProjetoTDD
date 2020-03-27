package br.com.rsinet.hub.tdd.utils;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ConfiguraReport {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;

	
	public static void criaReport(String nomeReport) {
		
			htmlReporter = new ExtentHtmlReporter("src/test/resources/" + nomeReport + ".html");
			htmlReporter.config().setDocumentTitle("Report");
			htmlReporter.config().setReportName("Report");
			reports = new ExtentReports();
			reports.attachReporter(htmlReporter);
			
			
		}
	
	public static ExtentTest criaTest(String nomeTeste) {
		
		test = reports.createTest(nomeTeste);
		
		return test;
		
	}
	
	public static void reportStatus(ExtentTest teste, ITestResult result, WebDriver driver) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Caso de teste FALHOU: " + result.getName());
			test.log(Status.FAIL, "Caso de teste FALHOU: " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Caso de teste SKIPPED: " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Caso de teste PASSOU: " + result.getName());
		}
		
	}
	
	public static void fechaExtent () {
		
		reports.flush();
		
	}
	

}
