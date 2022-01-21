package selenium_Small_Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data_Dataprovider {

	@Test(dataProvider = "setData")
	public void getData(String username, String password)
	{
		System.out.println(username + " " + password);
		System.out.println();
	}

	@DataProvider
	public Object[][] setData()
	{
		Object[][] obj = new Object[3][2];
		
		// 1st row
		obj[0][0] = "Namit";
		obj[0][1] = "Pass1";
		
		// 2nd row
		obj[1][0] = "Sumit";
		obj[1][1] = "Pass2";
		
		// 3rd row
		obj[2][0] = "Divya";
		obj[2][1] = "Pass3";
		
		return obj;
	}
}