package Utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {

	public static ExtentReports extent = new ExtentReports();
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test, featureTest, moduleTest;
	
	
	public static ExtentReports configReport(String executionEnv)
	
	{
		String reportName = String.format("ExecutionReport_%s_%s.html", executionEnv,CommonFunctions.getdate());
		File dir = new File(System.getProperty("user.dir")+ "/Reports");
		
		if(!dir.exists())
		{
			dir.mkdir();
		}
		
		String reportingpath = dir + "/" +reportName;
		htmlReporter = new ExtentHtmlReporter(reportingpath);
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("title1");
		htmlReporter.config().setReportName("report1");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		return extent;
		
		
	}
}
