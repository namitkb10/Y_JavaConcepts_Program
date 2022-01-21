package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Authentication_Popup {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// URL: https://the-internet.herokuapp.com/
		// Find out username & Password
		// Add admin:admin in the URL, means actual username & Password here admin & admin
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Actions
	}
}