package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip_Verify {

	static WebDriver driver;
	static WebElement weFacebook;
	static String expectedTooltip = "Facebook";
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/social-icon.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("The page title is : " +driver.getTitle());
		
		weFacebook = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[5]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(weFacebook).build().perform();
		String actualTooltip = weFacebook.getAttribute("title");
		Assert.assertEquals(actualTooltip, expectedTooltip);
		
		//driver.quit();
	}
}
