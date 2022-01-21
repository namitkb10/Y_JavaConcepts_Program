package selenium_Small_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Text_Compare {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement srcTextArea = driver.findElement(By.xpath("//*[@id='dropZone']//div[5]/pre/span"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(srcTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement dstTextArea = driver.findElement(By.xpath("//*[@id='dropZone2']//div[5]/pre/span"));
		act.keyDown(dstTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}
}