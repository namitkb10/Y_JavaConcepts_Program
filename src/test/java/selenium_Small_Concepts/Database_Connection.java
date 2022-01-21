package selenium_Small_Concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Connection {
	
	static String emp_firstName;
	static String emp_lastName;
	static String emp_department;
	static String emp_salary;
	static String emp_age;
	static int flag=0;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// https://www.youtube.com/watch?v=97Qh1AH9mtw
		
		// Database Validation
		Connection con = DriverManager.getConnection("jdbc:mysql://http:localhost:3030/employee", "username", "password");
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Statement smt = con.createStatement();
		
		String query = "Select FirstName, LastName, Department, Salary, Age from tbl_Employee";
		
		ResultSet rs = smt.executeQuery(query);
		
		while(rs.next())
		{
			String firstName = rs.getString("FirstName");
			String lastName = rs.getString("LastName");
			String department = rs.getString("Department");
			String salary = rs.getString("Salary");
			String age = rs.getString("Age");
			
			if(emp_firstName.equalsIgnoreCase(firstName) && emp_lastName.equalsIgnoreCase(lastName) &&
					emp_department.equalsIgnoreCase(department) && emp_salary.equalsIgnoreCase(salary) &&
					emp_age.equalsIgnoreCase(age))
			{
				System.out.println("Record found in the table || Testcase Passed");
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("Record not found in the table || Testcase FAiled");
		}
	}
}
