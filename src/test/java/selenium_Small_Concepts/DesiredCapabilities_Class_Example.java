package selenium_Small_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Class_Example {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("ignoreProtectedModeSettings", true);
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.merge(dc);
		driver = new ChromeDriver(options);
		driver.get("https://www.cacert.com");
	}
}
