package selenium_Small_Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_New_Tab_SalesForce {

	static WebDriver driver;
	static String str;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/");
		System.out.println("Parent Window Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(), 'Start my free trial')]")).click();
		Thread.sleep(5000);
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title: " + driver.getTitle());
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Namit");
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title: " + driver.getTitle());
		
		WebElement moveToTab = driver.findElement(By.xpath("//span[text()='Products']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(moveToTab).build().perform();
	}
}
