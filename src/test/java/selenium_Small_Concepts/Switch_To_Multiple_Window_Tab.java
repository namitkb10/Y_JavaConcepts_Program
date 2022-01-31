package selenium_Small_Concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Multiple_Window_Tab {

	static WebDriver driver;
	static String str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// yet to finish will not work
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Yet to finish will not work");
		System.out.println("Parent Window Title: " + driver.getTitle());
		
		System.out.println("Click on Open New Window button");
		driver.findElement(By.xpath("//button[@id='newWindowBtn' and contains(text(),'Open New Window')]")).click();
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);

		System.out.println("New Window Title: " + driver.getTitle());
		
		System.out.println("Now in New Window page");
		str = driver.findElement(By.xpath("//h1[contains(text(),'Basic Controls') and @class='post-title entry-title']")).getText();
		
		System.out.println("Text in Newly Open Child Window: " + str);
		
		driver.close();
		
		System.out.println("=======================================================");
		
		driver.switchTo().window(parentWindow);

		System.out.println("Click on Open New Tab button");
		driver.findElement(By.xpath("//button[@id='newTabBtn' and contains(text(),'Open New Tab')]")).click();
				
		System.out.println("Child Page Tab Title: " + driver.getTitle());
		
		set = driver.getWindowHandles();
		it = set.iterator();
		
		parentWindow = it.next();
		childWindow = it.next();
		
		driver.switchTo().window(childWindow);

		System.out.println("Tab Window Title: " + driver.getTitle());
		
		System.out.println("Now in tab page");
		// str = driver.findElement(By.id("sampleHeading")).getText();
		str = driver.findElement(By.xpath("//h1[contains(text(),'AlertsDemo') and @class='post-title entry-title']")).getText();
		
		System.out.println("Text in pop-up Child Tab: " + str);
		
		driver.close();
		
		System.out.println("=======================================================");
		
		System.out.println("Now Again in main page");
		
		System.out.println("Again Parent Window Title: " + driver.getTitle());
		
		System.out.println("Click on Open New Window button");
		driver.findElement(By.xpath("//button[@id='newWindowBtn' and contains(text(),'Open Multiple Windows')]")).click();
		
		set = driver.getWindowHandles();
		it = set.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}
}
