package selenium_Scenario_Based_Question;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Using_SendKeys {

	static WebDriver driver;
	static String UploadfilePath = "Downloads\\9_Years_Of_Exp_in_Manual_JavaSelenium_API_Automation_SQL Testing.docx";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(UploadfilePath);
		
		String UploadedFile = driver.findElement(By.xpath("//input[@id='file-upload']")).getAttribute("value");
		
		if(UploadedFile.equalsIgnoreCase(UploadfilePath))
		{
			System.out.println("File Uploaded Successfully");
		}
	}
}
