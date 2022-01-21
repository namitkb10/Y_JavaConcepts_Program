package selenium_Small_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_Demo {

	static WebDriver driver;
	static WebElement webElement;
	public static void main(String[] args) {
		
		// https://www.guru99.com/execute-javascript-selenium-webdriver.html
		// https://www.lambdatest.com/blog/how-to-use-javascriptexecutor-in-selenium-webdriver/
		// 
		
		// To use this download WebDriverManager jar into pom.xml
		WebDriverManager.chromedriver().setup();
					
		// Required chrome driver to launched
		//System.setProperty("webdriver.chrome.driver", "../Selenium_Small_Concepts/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		WebElement weMove = driver.findElement(By.className("userlink"));
		Actions act = new Actions(driver);
		act.moveToElement(weMove).build().perform();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		// TODO Auto-generated method stub
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		

		webElement = driver.findElement(By.id("Username"));
		jse.executeScript("arguments[0].value='namitkb10';", webElement);
		
		// driver.findElement(By.xpath("//a[text()='Log in']")).click();
		webElement = driver.findElement(By.xpath("//input[@value='Log in']"));
		jse.executeScript("arguments[0].click();", webElement); // button webElement
		
		
		// jse.executeScript("Scroll(0,-3000)");
		// jse.executeScript("scroll(0, 3300)");
		
		// Declare and set the start time		
        // long start_time = System.currentTimeMillis();
		
		// Call executeAsyncScript() method to wait for 5 seconds		
        // js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		
		// Perform Click on LOGIN button using JavascriptExecutor		
        // js.executeScript("arguments[0].click();", button);
                                
        // To generate Alert window using JavascriptExecutor. Display the alert message 			
        // js.executeScript("alert('Welcome to Guru99');");
		
	    // Navigate to new Page i.e to generate access page. (launch new url)		
	    // js.executeScript("window.location = 'http://demo.guru99.com/'");

        // Vertical scroll down by 600  pixels		
        // js.executeScript("window.scrollBy(0,600)");		
		
		
		// Scenarios To Use JavaScriptExecutor in Selenium
		// Let’s examine some scenarios we could handle using JavaScriptExecutor Interface for Selenium test automation.

		// 1. To Click on a Button

		// js.executeScript("document.getElementById('enter element id').click();");

		//or
//		js.executeScript("arguments[0].click();", okButton);
//		1
//		2
//		3
//		4
//		js.executeScript("document.getElementById('enter element id').click();");
//		 
//		//or
//		js.executeScript("arguments[0].click();", okButton);
//		2. To Type Text in a Text Box without using sendKeys() method
//
//		js.executeScript("document.getElementById(id').value='someValue';");
//		js.executeScript("document.getElementById('Email').value='SeleniumTesting.com';");
//		1
//		2
//		js.executeScript("document.getElementById(id').value='someValue';");
//		js.executeScript("document.getElementById('Email').value='SeleniumTesting.com';");
//		3. To Handle Checkbox by passing the value as true or false
//
//		js.executeScript("document.getElementById('enter element id').checked=false;");
//		1
//		js.executeScript("document.getElementById('enter element id').checked=false;");
//		4. To generate Alert Pop window in Selenium Webdriver
//
//		js.executeScript("alert('Welcome To Selenium Testing');");
//		1
//		js.executeScript("alert('Welcome To Selenium Testing');");
//		5. To refresh browser window using Javascript
//
//		js.executeScript("history.go(0)");
//		1
//		js.executeScript("history.go(0)");
//		6. To get the innertext of the entire webpage in Selenium
//
//		String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
//		System.out.println(innerText);
//		1
//		2
//		String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
//		System.out.println(innerText);
//		7. To get the Title of our webpage
//
//		String titleText =  js.executeScript("return document.title;").toString();
//		System.out.println(titleText);
//		1
//		2
//		String titleText =  js.executeScript("return document.title;").toString();
//		System.out.println(titleText);
//		8. To get the domain name
//
//		String domainName=  js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		1
//		2
//		String domainName=  js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		9. To get the URL of a webpage
//
//		String url=  js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		1
//		2
//		String url=  js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		10. To get the Height and Width of a web page
//
//		js.executeScript(“return window.innerHeight;”).toString();
//		js.executeScript(“return window.innerWidth;”).toString();
//		1
//		2
//		js.executeScript(“return window.innerHeight;”).toString();
//		js.executeScript(“return window.innerWidth;”).toString();
//		11. To find a hidden element in selenium using JavaScriptExecutor
//
//		js.executeScript("arguments[0].click();", element);
//		1
//		js.executeScript("arguments[0].click();", element);
//		12. To navigate to a different page using Javascript
//
//		js.executeScript("window.location = 'https://www.lambdatest.com");
//		1
//		js.executeScript("window.location = 'https://www.lambdatest.com");
//		13. To perform Scroll on an application using Selenium
//
//		a) To scroll the page vertically for 500px
//
//		js.executeScript(“window.scrollBy(0,500)”);
//		1
//		js.executeScript(“window.scrollBy(0,500)”);
//		b) To scroll the page vertically till the end
//
//		js.executeScript(“window.scrollBy(0,document.body.scrollHeight)”);
//		1
//		js.executeScript(“window.scrollBy(0,document.body.scrollHeight)”);
//		14. Adding an element in DOM
//
//		We can also add an element in DOM if required. However, as are only concerned with mimicking user interactions in the browser, this option may not be used.
//
//		js.executeScript("var btn=document.createElement('newButton');"
//		 
//		                     + "document.body.appendChild(btn);");
//		1
//		2
//		3
//		js.executeScript("var btn=document.createElement('newButton');"
//		 
//		                     + "document.body.appendChild(btn);");
//		On similar lines, we can practically execute any JavaScript command using Selenium.
		
	}
}
