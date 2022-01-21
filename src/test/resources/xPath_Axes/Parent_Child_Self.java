package xPath_Axes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent_Child_Self {
	
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Self Axes Method
		element = driver.findElement(By.xpath("//select[@name='user[country]']//self::select"));
		System.out.println(element.getText());
		
		//Parent Axes Method
		System.out.println();
		System.out.println();
		String idAttribute = driver.findElement(By.xpath("//select[@name='user[country]']//parent::form")).getAttribute("id");
		System.out.println("Parent Axes Method Attribute: " + idAttribute);
		
		//Child Axes Method
		System.out.println();
		System.out.println();
		List<WebElement> lst = driver.findElements(By.xpath("//select[@name='user[job_role]']//child::option"));
		System.out.println("Size: " + lst.size());

		System.out.println();
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
		}
	}
}
