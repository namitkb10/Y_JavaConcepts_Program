
package selenium_Small_Concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Connection_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver Loaded");
		System.out.println();
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "Imqa@123");
					
		System.out.println("Connected to My-SQL database");
		System.out.println();
		
		Statement smt = conn.createStatement();
		
		ResultSet rs = smt.executeQuery("Select * from employee");
		System.out.println();
		
		while (rs.next()) {
			String firstName = rs.getString("FirstName");
			String age = rs.getString("Age");
			String email = rs.getString("Email");
			
			System.out.println(" <b> First Name is </b> " + firstName + " Age is "  + age + " Email is " + email);
		}
	}
}