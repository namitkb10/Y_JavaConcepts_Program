package yet_To_Do;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Random {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://optinmonster.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for (int i = 0; i < 10; i++) {
			jse.executeScript("scroll(0,150)");
			Thread.sleep(500);
		}
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> it = set.iterator();
				
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			//driver.close();
		}
	}
}
