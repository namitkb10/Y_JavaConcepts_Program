package selenium_Small_Concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Executions {

	@Test
	public void test_1() {
		// TODO Auto-generated method stub
		System.out.println("@Test Annotation - 5");
		System.out.println();
	}
	
	@Test
	public void test_2() {
		// TODO Auto-generated method stub
		System.out.println("@Test Annotation - 8");
		System.out.println();
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		// TODO Auto-generated method stub
		System.out.println("After Suite Annotation - 12");
		System.out.println("After Suite Annotation - Is used to run some statement");
		System.out.println();
	}
	
	@AfterClass
	public void afterClass() {
		// TODO Auto-generated method stub
		System.out.println("After Class Annotation - 10");
		System.out.println("After Class Annotation - Is used to close/quit the browser");
		System.out.println();
		
	}
	
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Before Suite Annotation - 1");
		System.out.println("After Suite Annotation - Is used to write some report code");
		System.out.println();
	}
	
	@BeforeClass
	public void beforeClass() {
		// TODO Auto-generated method stub
		System.out.println("Before Class Annotation - 3");
		System.out.println("Before Class Annotation - Is used to lauch browser");
		System.out.println();
	}
	
	@AfterMethod
	public void afterMethod() {
		// TODO Auto-generated method stub
		System.out.println("After Method Annotation - 6-9");
		System.out.println("After Method Annotation - Is used to log-out from the applications");
		System.out.println("Capture Screen Shot code for failed test cases");
	}
	
	@AfterTest
	public void afterTest() {
		// TODO Auto-generated method stub
		System.out.println("After Test Annotation - 11");
		System.out.println();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("Before Method Annotation - 4-7");
		System.out.println("After Method Annotation - Is used to login into the applications");
		System.out.println();
	}
	
	@BeforeTest
	public void beforeTest() {
		// TODO Auto-generated method stub
		System.out.println("Before Test Annotation - 2");
		System.out.println();
	}
}
