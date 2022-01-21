package locators;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText_PartialLinkText {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		int size = allLinks.size();
		
		System.out.println("Total Number Of link Found: " + size);
		
		Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext()) {
		    System.out.println(itr.next().getText());
		}
		driver.close();
	}
}