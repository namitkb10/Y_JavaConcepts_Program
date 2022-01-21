package selenium_Small_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_ExcelSheet_POI {

	static WebDriver driver;
	static WebElement we;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		File file = new File("./Excel_Data/Login_Credentials.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rowIndex = sh.getLastRowNum();
		
		System.out.println("Total Number Of Row: " + rowIndex);
		System.out.println();
		
		for (int i = 1; i <= rowIndex; i++) {
			Row row = sh.getRow(i);
			
			String userName = row.getCell(0).getStringCellValue();
			String pass = row.getCell(1).getStringCellValue();
			
			System.out.println(userName + "  &&  " + pass);
		}
	}
}
