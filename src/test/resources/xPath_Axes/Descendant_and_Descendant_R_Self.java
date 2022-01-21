package xPath_Axes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Descendant_and_Descendant_R_Self {
	
	static WebDriver driver;
	static WebElement element;
	static int count;
	
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=Qg-hW_xiVSM&list=PLL34mf651faO1vJWlSoYYBJejN9U_rwy-&index=9
		
//		descendant: It selects all of the ancestor(children, grandchildren, etc.) of context(current) node
//		XPath Format(descendant):
//
//		//tagname[@Attribute='Value']//descendant::tagname
//
//
//		descendant-or-self: It selects context(Current) node and all of it's descendant like (children, grandchildren, etc.) 
//		if tagname for descendant and self are same
//
//		XPath Format(descendant-or-self):
//		//tagname[@Attribute='Value']//descendant-or-self::tagname
			
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		count = driver.findElements(By.xpath("//div[@id='errorbox']//descendant::div")).size();
		System.out.println("All Parent/Grand-Parent Before current node: " + count);
		
		System.out.println();
		
		count = driver.findElements(By.xpath("//div[@id='errorbox']//descendant-or-self::div")).size();
		
		System.out.println("All Children/Grand-Children including current node: " + count);
		
		
	}
}
