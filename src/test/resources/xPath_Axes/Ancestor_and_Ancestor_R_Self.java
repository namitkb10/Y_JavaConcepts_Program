package xPath_Axes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor_and_Ancestor_R_Self {
	
	static WebDriver driver;
	static WebElement element;
	static int count;
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=1_TGzj5X2QU&list=PLL34mf651faO1vJWlSoYYBJejN9U_rwy-&index=10
		
//		ancestor: It selects all of the ancestor(parent, grandparent, etc.) of context(current) node
//		XPath Format(ancestor):
//
//		//tagname[@Attribute='Value']//ancestor::tagname
//
//
//		ancestor-or-self: It selects context(Current) node and all of it's ancestors like (parent, grandparent, etc.) 
//		if tagname for ancestors and self are same
//
//		XPath Format(ancestor-or-self):
//		//tagname[@Attribute='Value']//ancestor-or-self::tagname
			
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		count = driver.findElements(By.xpath("//div[@id='errorbox']//ancestor::div")).size();
		System.out.println("All Parent/GrandParent Before current node: " + count);
		
		System.out.println();
		
		count = driver.findElements(By.xpath("//div[@id='errorbox']//ancestor-or-self::div")).size();
		
		System.out.println("All Parent/GrandParent including current node: " + count);
		
	}
}
