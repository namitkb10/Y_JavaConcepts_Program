package selenium_Small_Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link_Verify {

	static WebDriver driver;
	static String str;
	static URL url;
	static HttpURLConnection huc; 
	static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> lstWeb = driver.findElements(By.tagName("a"));
		int size = lstWeb.size();
		System.out.println("Total Number Of link Found: " + size);
		
		for (int i = 0; i < size; i++) {
			count++;
			
			str = lstWeb.get(i).getAttribute("href");
			URL url = new URL(str);
			huc = (HttpURLConnection)url.openConnection();
			
			huc.setConnectTimeout(2000);
			huc.connect();
			
			// if(huc.getResponseCode()== HttpURLConnection.HTTP_OK)
			if(huc.getResponseCode()== 200)
			{
				System.out.println(count + " --- " + str + " " + huc.getResponseMessage());
			}
			// else if(huc.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			else if(huc.getResponseCode()== 404)
			{
				System.out.println(count + " --- " + str + " " + huc.getResponseMessage() + " " + HttpURLConnection.HTTP_NOT_FOUND);
			}
		}
	}
}