package selenium_Small_Concepts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT_File_Upload {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.file.io/");
		// driver.get("https://www.transfernow.net/en");
		// driver.get("https://www.filemail.com/share/upload-file");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='upload-button']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\namit\\eclipse-workspace\\AutoIT\\Upload_File.exe");
		
		String downloadURL = driver.findElement(By.id("download-url")).getText();
		
		System.out.println("Share this URL to download the file: " + downloadURL);
		
	}
}
