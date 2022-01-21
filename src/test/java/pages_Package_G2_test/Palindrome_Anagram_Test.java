package pages_Package_G2_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages_Package_G1.Palindrome_Anagram_Validation;

public class Palindrome_Anagram_Test {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String pVar = "12231";
		String pStr = "Yes! 1221 reversed is 1221";
		
		String aVar = "SILENT";
		String aStr = "5 potential anagrams";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://xndev.com/palindrome");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Palindrome_Anagram_Validation.palindromeValue(driver).sendKeys(pVar);
		Palindrome_Anagram_Validation.palindromeButton(driver).click();
		String pStrMsg = Palindrome_Anagram_Validation.palindromeResult(driver).getText();
		if(pStr.equalsIgnoreCase(pStrMsg))
		{
			System.out.println("Palindrome Messages Matched");
		}
		else
		{
			System.out.println("Palindrome Messages Not Matched");
		}
		
		Thread.sleep(2000);
		Palindrome_Anagram_Validation.anagramValue(driver).sendKeys(aVar);
		Palindrome_Anagram_Validation.anagramButton(driver).click();
		String aStrMsg = Palindrome_Anagram_Validation.anagramResult(driver).getText();
		if(aStrMsg.contains(aStr))
		{
			System.out.println("Anagram Messages Matched");
		}
		else
		{
			System.out.println("Anagram Messages Not Matched");
		}	
	}
}
