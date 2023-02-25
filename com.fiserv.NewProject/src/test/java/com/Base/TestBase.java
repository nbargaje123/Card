package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import Utility.ExtentReport;

public class TestBase {

	public static WebDriver dr; 
	public static ExtentReports extent;
	
	@BeforeMethod
	public void inilizebrowser()
	{
		extent = ExtentReport.configReport("QA");
		
		System.setProperty("webdriver.msedge.driver","C:\\EclipseWorkspace\\NewMavenProject\\com.fiserv.NewProject\\Drivers\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get("https://www.google.com");
		
	}
	
}
