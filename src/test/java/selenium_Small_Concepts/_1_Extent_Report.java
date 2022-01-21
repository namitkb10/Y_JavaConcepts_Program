package selenium_Small_Concepts;

import java.io.File;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class _1_Extent_Report {

	ExtentHtmlReporter htmlReport;
	ExtentReports extentReporter;
	static ExtentTest test;
	// File file = new File(OutputType.FILE);
	
	@BeforeTest
	public void setExtent()
	{
		// htmlReport = new ExtentHtmlReporter("../Extent_Report_Folder/ExtentReport.html");
		// htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir") + "\\MyExtentReport.html");
		
		htmlReport = new ExtentHtmlReporter(new File("./Extent_Report_Folder/MyExtentReport.html"));
		
		
		// htmlReport = new ExtentHtmlReporter(new File("E:/Selenium-Project-workspace/ZSelenium_All_Automation/Extent_Report_Folder/MyExtentReport.html"));
		System.out.println("Path-1: " + System.getProperty("user.dir") + "/Extent_Report_Folder/MyExtentReport.html");
		
		htmlReport.config().setDocumentTitle("Extent Report");
		htmlReport.config().setReportName("Combined Extent Report");
		htmlReport.config().setTheme(Theme.DARK);
		
		extentReporter = new ExtentReports();
		extentReporter.attachReporter(htmlReport);
		
		extentReporter.setSystemInfo("HostName", "LocalHost");
		extentReporter.setSystemInfo("OS", "Window10");
		extentReporter.setSystemInfo("TesterName", "Namit");
		extentReporter.setSystemInfo("Browser", "Chrome");
	}
	
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		
//	}
	
	@Test //(dependsOnGroups = "")
	public void test_1()
	{
		Assert.assertEquals(10,11);
	}
	
	@Test
	public void test_2()
	{
		Assert.assertEquals(10,10);
	}
	
	@Test
	public void test_3()
	{
		Assert.assertEquals('A','A');
	}
	
	@Test
	public void test_4()
	{
		Assert.assertEquals(10,9);
	}
	
	@Test
	public void test_5()
	{
		Assert.assertTrue(false);
	}
	
//	@AfterMethod
//	public void afterMethod()
//	{
//		extentReporter.flush();
//	}
	
	@AfterTest
	public void afterTest()
	{
		extentReporter.flush();
	}
}
