package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Horizontal_Vertical {

	static WebDriver driver;
	static WebElement we;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=DeNjIFAaqRc
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://artelus.com/");
		
		// Scenario-1: To scroll down the web page by pixel
		// Scenario-2: To scroll down the web page by the visibility of the web element
		// Scenario-3: To scroll down the web page at the bottom of the page
				
		// JavascriptExecutor is an Interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Scenario-1: To scroll down the web page by pixel
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,3300)", "");
		System.out.println("Scroll till bottom");
		
		Thread.sleep(1000);
		jse.executeScript("scroll(0,-3300)");
		System.out.println("Scroll up");
		
		Thread.sleep(1000);
		jse.executeScript("scroll(0,3300)");
		System.out.println("Scroll down");
		
		System.out.println("Scroll till bottom");
		System.out.println("Above Both Scroll are working");
		
		// Scenario-2: To scroll down the web page by the visibility of the web element
		// WebElement we = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/artelusai/']"));
		we = driver.findElement(By.xpath("//a[text()='English']"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();", we);
		System.out.println("Scroll till top");
		// Scenario-3: To scroll down the web page at the bottom of the page
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("Scroll till bottom again");
		
		Thread.sleep(2000);
		// we = driver.findElement(By.xpath("//a[text()='Mckinsey']"));
		WebElement we_11 = driver.findElement(By.xpath("//h4[text()='Preparing for the next normal after COVID-19']"));
		we = driver.findElement(By.xpath("//a[@href='products.php#hansanet' and contains(text(),'Read More')]"));
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(we_11).perform();
		Thread.sleep(5000);
		//we.click();
		// driver.findElement(By.xpath("//a[@href='products.php#hansanet' and contains(text(),'Read More')]")).click();
		Thread.sleep(5000);
		System.out.println("Scroll till top page again");
		System.out.println("Click not working");
		
	}
}
