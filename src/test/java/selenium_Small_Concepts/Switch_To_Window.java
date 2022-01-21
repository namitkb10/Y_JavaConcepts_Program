package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Window {

	static WebDriver driver;
	static String str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("1st Window Title: " + driver.getTitle());
		
		System.out.println("Click on tab button");
		driver.findElement(By.id("tabButton")).click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://demoqa.com/sample");
//		Actions act = new Actions(driver);
		System.out.println("Clicking Tab");
//		act.sendKeys(Keys.TAB);

		System.out.println("2nd Window Title: " + driver.getTitle());
		
		System.out.println("Now in tab page");
		str = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println("Text in New Window: " + str);
		
		driver.close();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.get("https://demoqa.com/browser-windows");
//		Actions act = new Actions(driver);
		System.out.println("Clicking Tab");
		
		System.out.println("1st Window Title: " + driver.getTitle());
		
		System.out.println("Now in main page");
	}
}
