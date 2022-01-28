package maven_Demo_Partially_Done;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.ie.InternetExplorerDriver;
// import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.iedriver().setup();
		// WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new InternetExplorerDriver();
		// WebDriver driver = new EdgeDriver();

		// driver.navigate().to("https://www.saucedemo.com/");
		// driver.navigate().forward();
		// driver.navigate().back();
		// driver.navigate().refresh();
		
		// driver.get("https://www.tatacliq.com/login");
		// driver.get(("https://www.wix.com/"));
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		// driver.get
//		driver.findElement(By.xpath("//a[normalize-space(text())='Sign In' and @class='_1-OXP pGfA3 _2cqiD']")).click();
//		driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.name("email")).sendKeys("namitkb12@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Wix@123");
//		driver.findElement(By.xpath("//button[text()='Log In']")).click();
	}
}
