package selenium_Small_Concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handing_Windows {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")).click();
		Thread.sleep(2000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windows = windowHandles.iterator();
		
		String parentWindow = windows.next();
		String childWindow = windows.next();
		Thread.sleep(2000);
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='UserFirstName']")).sendKeys("Namit");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='UserLastName']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
	}
}
