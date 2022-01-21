package selenium_Small_Concepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
// import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_All_Concepts {
	static WebDriver driver;
	static String strDashboard = "Dashboard";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Pageload Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// Implicitly Wait
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		// Explicit Wait
		// WebDriverWait wdWait = new WebDriverWait(driver, 10);
		// wdWait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin"))).click();
		// wdWait.until(ExpectedConditions.alertIsPresent()
		// wdWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		// wdWait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		// driver.findElement(By.id("btnLogin"))
		
		// Fluent Wait in Selenium
				// In Fluent Wait, We can Provide the time-out & polling time like every 1 or 2 second till the time-out is over.
				
				
				/* The Fluent Wait in Selenium is used to define maximum time for the web driver
				   to wait for a condition, as well as the frequency with which we want to check
				   the condition before throwing an "ElementNotVisibleException" exception.
				   It checks for the web element at regular intervals until the object is found or timeout happens.*/

				/* Frequency: Setting up a repeat cycle with the time frame to verify/check
				   the condition at the regular interval of time */
				
				/* Let's consider a scenario where an element is loaded at different intervals of time.
				 * The element might load within 10 seconds, 20 seconds or even more then that
				 * if we declare an explicit wait of 20 seconds. It will wait till the specified time
				 * before throwing an exception. In such scenarios, the fluent wait is the ideal wait
				 * to use as this will try to find the element at different frequency until it
				 * finds it or the final timer runs out.*/
		
				// https://www.youtube.com/watch?v=WyheLWhk6QE
		
				Wait<WebDriver> wdWait = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofSeconds(5))
						.withMessage("Fluent Wait Message")
						.ignoring(NoSuchElementException.class);
				
				wdWait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin"))).click();
		
		String strText = driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		
		Assert.assertEquals(strDashboard, strText);
		System.out.println("Dashboard displaying and test case passed");
	
	}
}
