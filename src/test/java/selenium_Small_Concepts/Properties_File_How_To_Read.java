package selenium_Small_Concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_File_How_To_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./Configs/Configuration.properties");
		FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        
        prop.load(fis);
        
        String url_1 = prop.getProperty("url");
        String username_1 = prop.getProperty("username");
        String pass_1 = prop.getProperty("password");
        
        System.out.println(url_1);
        System.out.println(username_1);
        System.out.println(pass_1);
	}
}
