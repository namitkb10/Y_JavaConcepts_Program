package selenium_Small_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Class_Example1 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How To Handle Chrome and Firefox Notification in Selenium using Java
		// https://www.youtube.com/watch?v=EVSECAbTTls
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/");

	}
}
