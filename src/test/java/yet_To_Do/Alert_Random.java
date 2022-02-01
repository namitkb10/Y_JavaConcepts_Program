package yet_To_Do;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Random {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.get("https://optinmonster.com/");
		driver.get("https://intellipaat.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for (int i = 0; i < 100; i++) {
			jse.executeScript("window.scrollBy(0,50)", "");
			Thread.sleep(50);
		}
		
		Set<String> windows = driver.getWindowHandles();
		
		if(windows.size()>1)
		{
			Iterator<String> it = windows.iterator();
			
			String parentWindow = it.next();
			String childWindow = it.next();
			
			driver.switchTo().window(childWindow);
			try {
				WebElement we = driver.findElement(By.className("CloseButton__ButtonElement-sc-79mh24-0 dqLNNr orlando-CloseButton orlando-close orlando-ClosePosition--top-right"));
				if(we.isDisplayed())
				{
					we.click();
				}
			} catch (NoSuchElementException ne) {
				// TODO Auto-generated catch block
				System.out.println("Alert Window is displayed but unable to click on that window");
			}
		}
	}
}
