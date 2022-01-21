package pages_Package_G1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Palindrome_Anagram_Validation {
	
	public static WebElement element = null;
	
	public static WebElement palindromeValue(WebDriver wd)
	{
		element = wd.findElement(By.id("originalWord"));
		return element;
	}
	
	public static WebElement palindromeButton(WebDriver wd)
	{
		element = wd.findElement(By.id("button1"));
		return element;
	}
	
	public static WebElement palindromeResult(WebDriver wd)
	{
		element = wd.findElement(By.id("palindromeResult"));
		return element;
	}
	
	public static WebElement anagramValue(WebDriver wd)
	{
		element = wd.findElement(By.id("anagramWord"));
		return element;
	}
	
	public static WebElement anagramButton(WebDriver wd)
	{
		element = wd.findElement(By.id("button2"));
		return element;
	}
	
	public static WebElement anagramResult(WebDriver wd)
	{
		element = wd.findElement(By.id("anagramResult"));
		return element;
	}
}
