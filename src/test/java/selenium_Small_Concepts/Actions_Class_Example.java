package selenium_Small_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Class_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser == "chrome")
		{
			// To use this download WebDriverManager jar into pom.xml
			WebDriverManager.chromedriver().setup();
			
			// Required chrome driver to launched
			// System.setProperty("webdriver.chrome.driver", "../Selenium_Small_Concepts/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			// driver.get("https://www.saucedemo.com/");
			driver.navigate().to("https://www.nopcommerce.com/en");
			// driver.manage().window().maximize();
			
			// Set Window Size
			Dimension setWindowSize = new Dimension(1200, 800);
			driver.manage().window().setSize(setWindowSize);
			
			WebElement weMove = driver.findElement(By.className("userlink"));
			Actions act = new Actions(driver);
			act.moveToElement(weMove).build().perform();
			
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			WebElement weDD_Role = driver.findElement(By.id("TimeZoneId"));
			Select ddRole = new Select(weDD_Role);
			ddRole.selectByValue("Aleutian Standard Time");
			Thread.sleep(2000);
			
			//Different Way of Click
			driver.findElement(By.id("check-availability-button")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).submit();
		}
	}
}
