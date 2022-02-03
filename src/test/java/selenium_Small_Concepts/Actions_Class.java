
package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Class {
	static WebDriver driver;
	static WebElement we;
	static Actions act;
	static String str;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		//driver.get("https://www.spicejet.com/");
		
		// we= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		we= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(we).perform();
		System.out.println("Button Double Clicked");

		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		str = alt.getText();
		System.out.println("Double click Alert Message: " + str);
		alt.accept();
		
		Thread.sleep(2000);
		
		we= driver.findElement(By.xpath("//span[text()='right click me']"));
		act.moveToElement(we).contextClick().build().perform();
		System.out.println("Right Clicked");
		
		we= driver.findElement(By.xpath("//span[text()='Copy']"));
		act.moveToElement(we).click().build().perform();
		System.out.println("Text Copied");
		// act.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(2000);
		alt = driver.switchTo().alert();
		str = alt.getText();
		System.out.println("Copy Alert Message: " + str);
		alt.accept();
//		we.click();
//		we.sendKeys("Gay");
	}
}
