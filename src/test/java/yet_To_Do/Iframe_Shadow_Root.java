package yet_To_Do;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Shadow_Root {

	static WebDriver driver;
	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=0R0erfuJ76g&list=RDCMUCXJKOPxx4O1f63nnfsoiEug&index=22
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
