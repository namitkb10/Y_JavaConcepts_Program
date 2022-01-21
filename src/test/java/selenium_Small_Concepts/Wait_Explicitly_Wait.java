package selenium_Small_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Explicitly_Wait {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Please Select Motors");
		WebElement tabMotors = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
		System.out.println("Motors Selected");
		Actions actions = new Actions(driver);
		actions.moveToElement(tabMotors).perform();
		
		System.out.println("Please Select Ford");
		WebDriverWait wait = new WebDriverWait(driver,10);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		// driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click();
		System.out.println("Ford Selected");
	}
}
