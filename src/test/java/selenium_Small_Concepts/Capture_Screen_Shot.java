package selenium_Small_Concepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Capture_Screen_Shot {

	static WebDriver driver;
	ITestResult result;
	static String screenShot2;
	//static File src;

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//TakesScreenshot tss = ((TakesScreenshot));
		TakesScreenshot tss = ((TakesScreenshot)driver);
		
		File src = tss.getScreenshotAs(OutputType.FILE);
		
		//src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//SFile dst = new File("screenShot1.png");
		
		//File dst = new File("E:/Selenium-Project-workspace/ZSelenium_All_Automation/ScreenShot" + screenShot1 +".jpg");
		
		FileUtils.copyFile(src, new File("E:/Selenium-Project-workspace/ZSelenium_All_Automation/ScreenShot/screenShot2.png"));
		// file
		
		System.out.println("Screen Shot Captured");
		
	}
}
