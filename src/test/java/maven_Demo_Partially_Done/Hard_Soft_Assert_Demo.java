package maven_Demo_Partially_Done;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assert_Demo {

	@Test
	public void hard_Soft_Assert()
	{
		SoftAssert sa = new SoftAssert();
		
		String strExpected="Hi";
		String strActual = "Hello";
		
		System.out.println("Hard Assert Starts --- 1");
		
		Assert.assertEquals(strExpected, strActual);
		
		System.out.println("Hard Assert Starts --- 2");
		
		System.out.println("Hard Assert Starts --- 3");
		
		System.out.println("Hard Assert Starts --- 4");
		
		System.out.println("Hard Assert Starts --- 5");
		
		System.out.println("Hard Assert Starts --- 6");
		
		sa.assertAll();
	}
}
