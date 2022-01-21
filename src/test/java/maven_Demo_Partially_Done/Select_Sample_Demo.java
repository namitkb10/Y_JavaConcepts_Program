package maven_Demo_Partially_Done;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.ie.InternetExplorerDriver;
// import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Sample_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new EdgeDriver();
		
		//driver.get("https://www.tatacliq.com/login");
		//driver.get(("https://www.wix.com/"));
		
		driver.get(("https://www.sugarcrm.com/request-demo/"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.name("employees_c")));
		
		List<WebElement> lstWe = sel.getOptions();
		System.out.println(lstWe.size());
		for (int i = 0; i < lstWe.size(); i++) {
			System.out.println(lstWe.get(i).getText());
		}
		
		sel.selectByValue("level1");
		Thread.sleep(2000);
		sel.selectByVisibleText("51 - 100 employees");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		//driver.close();
		
//		driver.findElement(By.xpath("//a[normalize-space(text())='Sign In' and @class='_1-OXP pGfA3 _2cqiD']")).click();
//		driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.name("email")).sendKeys("namitkb12@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Wix@123");
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	}
}
