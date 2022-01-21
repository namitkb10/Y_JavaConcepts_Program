package xPath_Axes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preceding_and_Preceding_Sibling {
	
	static WebDriver driver;
	static WebElement element;
	static int count;
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=qtUkI3Jjods&list=PLL34mf651faO1vJWlSoYYBJejN9U_rwy-&index=12
//		
//		Preceding: It selects all the nodes that appear before the context(current) node
//		XPath Format(Preceding):
//
//		//tagname[@Attribute='Value']//Preceding::tagname
//
//
//		Preceding-sibling: It selects all the nodes that have the same parent as the
//		context(Current) node and appear before the context(Current) node
//
//		XPath Format(Preceding-sibling):
//		//tagname[@Attribute='Value']//(Preceding-sibling)::tagname
			
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		count = driver.findElements(By.xpath("//option[@value='AM']//preceding::option")).size();
		System.out.println("Option Elements Overall Before this (Same parent Not Mandatory): " + count);
		
		System.out.println();
		
		List<WebElement> lstWeb = driver.findElements(By.xpath("//option[@value='AM']//preceding-sibling::option"));
		
		System.out.println("Option Elements Before this (Same parent Mandatory): " + lstWeb.size());
		
		for (int i = 0; i < lstWeb.size(); i++) {
			System.out.println(lstWeb.get(i).getText());
		}
	}
}
