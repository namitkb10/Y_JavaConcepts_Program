package selenium_Small_Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Window {

	static WebDriver driver;
	static String str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Parent Window Title: " + driver.getTitle());
		
		System.out.println("Click on tab button");
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);

		System.out.println("Tab Window Title: " + driver.getTitle());
		
		System.out.println("Now in tab page");
		str = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println("Text in Tab/Child Window: " + str);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);

		System.out.println("Click on Window button");
		driver.findElement(By.id("windowButton")).click();
		
		
		System.out.println("Child Window Title: " + driver.getTitle());
		
		set = driver.getWindowHandles();
		it = set.iterator();
		
		parentWindow = it.next();
		childWindow = it.next();
		
		driver.switchTo().window(childWindow);

		System.out.println("Tab Window Title: " + driver.getTitle());
		
		System.out.println("Now in tab page");
		str = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println("Text in pop-up Child Window: " + str);
		
		driver.close();
		
		System.out.println("Now in main page");
	}
}
