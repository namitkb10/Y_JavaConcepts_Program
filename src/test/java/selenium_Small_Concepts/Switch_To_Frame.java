package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Frame {

	static WebDriver driver;
	static String str1, str2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		str1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Frame-1 Text: " + str1);
		
		driver.switchTo().defaultContent();
		System.out.println("Focus back to main page");
		driver.switchTo().frame("frame2");
		str2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Frame-2 Text: " + str2);
	}
}
