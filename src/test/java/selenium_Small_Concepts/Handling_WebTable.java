package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_WebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		Thread.sleep(5000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='sectoral_indices']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		
		int rowSize = driver.findElements(By.xpath("/html/body/section[6]/div/div/div[1]/div[2]/table/tbody/tr")).size();
		int colSize = driver.findElements(By.xpath("/html/body/section[6]/div/div/div[1]/div[2]/table/tbody/tr[1]/td")).size();
		System.out.println("Total No Of Row Size: " + rowSize);
		System.out.println("Total No Of Column Size: " + colSize);
		
		System.out.println("=========================================");
		
		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j < colSize; j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/section[6]/div/div/div[1]/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText() + " -- ");
				Thread.sleep(500);
			}
			System.out.println();
		}
	}
}
