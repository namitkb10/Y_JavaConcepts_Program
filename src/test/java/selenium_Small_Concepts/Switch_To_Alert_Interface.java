package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Alert_Interface {
	
	static WebDriver driver;
	static Alert alert;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		System.out.println("Alert Accepted");
		
		driver.findElement(By.id("confirmButton")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		System.out.println("Confirm Button Accepted");
		
		driver.findElement(By.id("promtButton")).click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Happy");
		System.out.println("Keys Send");
		String str = alert.getText();
		System.out.println("String Read");
		System.out.println("Enter String is: " + str);
		Thread.sleep(3000);
		System.out.println("Promt Button Accepted");
		alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		System.out.println("Timer Alert Displayed Clicked");
		Thread.sleep(10000);
		alert = driver.switchTo().alert();
		System.out.println("Timer Alert Displayed");
		System.out.println("Waited for 10 Sec");
		alert.accept();
		System.out.println("Timer Alert Accepted");
	}
}
