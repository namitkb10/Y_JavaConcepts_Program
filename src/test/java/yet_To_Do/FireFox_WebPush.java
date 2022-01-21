package yet_To_Do;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFox_WebPush {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		driver = new FirefoxDriver(opt);
		
		driver.get("https://timesofindia.indiatimes.com/");
	}
}
