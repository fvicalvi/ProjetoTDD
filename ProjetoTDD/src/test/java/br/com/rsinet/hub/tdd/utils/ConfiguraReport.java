package br.com.rsinet.hub.tdd.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ConfiguraReport {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;

	
	public static void criaReport() {
		if(reports == null) {
			
			reports = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			reports.attachReporter(htmlReporter);
			
			}
		}
	
	public static ExtentTest criaTest(String nomeTeste) {
		
		test = reports.createTest(nomeTeste);
		
		return test;
		
	}
	
	public static void reportStatus() {
		
		test.log(Status.PASS, "teste com sucesso");
		reports.flush();
	}
	
	
	

}
