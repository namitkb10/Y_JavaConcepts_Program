package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ID_Name {
	
	static WebDriver driver;
	static WebElement element;
	static int count;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		element = driver.findElement(By.id("username"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		// set the text
		jsExecutor.executeScript("arguments[0].value='namitkb10'", element);  
		// get the text
		String text = (String) jsExecutor.executeScript("return arguments[0].value", element);  
		System.out.println("User Name: " + text);
		
		driver.close();
	}
}
