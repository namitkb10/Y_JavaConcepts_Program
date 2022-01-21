package maven_Demo_Partially_Done;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Demo {
	
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		
	}
}
