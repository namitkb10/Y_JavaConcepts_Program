package z_recycle;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_New_Tab_and_Perform2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// https://stqatools.com/selenium-tab/
		// https://www.tutorialspoint.com/switch-tabs-using-selenium-webdriver-with-java
		// 1. Switch between two tabs using switchTo():

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();
		
		// Launch URL
		// driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.get("https://demoqa.com/browser-windows");

		// Wait of 10 seconds
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on link to open in new tab
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);

		// Store all currently open tabs in tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		// Switch newly open Tab
		driver.switchTo().window(tabs.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		Thread.sleep(3000);

		// Perform some operation on Newly open tab
		// Close newly open tab after performing some operations.
		driver.close();

		// Switch to old(Parent) tab.
		driver.switchTo().window(tabs.get(0));
		System.out.println("Page title of new tab: " + driver.getTitle());
		
		// driver.close();
	}
}

//		// Keys.Chord string
//		String clickl = Keys.chord(Keys.CONTROL, Keys.ENTER);
//
//		// open the link in new tab, Keys.Chord string passed to sendKeys
//		driver.findElement(By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
//		Thread.sleep(3000);
//
//		// hold all window handles in array list
//		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
//
//		// switch to new tab
//		driver.switchTo().window(newTb.get(1));
//		System.out.println("Page title of new tab: " + driver.getTitle());
//		Thread.sleep(5000);
//
//		// driver.findElement(By.xpath("//a[text()='Refund Policy']")).sendKeys(clickl);
//
//		// switch to parent window
//		driver.switchTo().window(newTb.get(0));
//		System.out.println("Page title of parent window: " + driver.getTitle());
//
//		// driver.quit();
//	}
//}
