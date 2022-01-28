package java_Basic_String_Program;

public class Lowercase_To_Uppercase_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://www.includehelp.com/java-programs/lowercase-to-uppercase-conversion-without-using-any-library-function-in-java.aspx
		// https://www.includehelp.com/java-programs/uppercase-to-lowercase-conversion-without-using-any-library-function-in-java.aspx
		// Java code for lowercase to uppercase conversion
		
		String str = "NamitKB10";
		
		String converseStr = "";
		
		String[] strArr = str.split("");
		
		for (int i = 0; i < strArr.length; i++) {
			if(Character.isUpperCase(str.charAt(i)))
			{
				converseStr = converseStr + strArr[i].toLowerCase();
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				converseStr = converseStr + strArr[i].toUpperCase();
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				converseStr = converseStr + strArr[i];
			}
		}
		System.out.println("Converse String is: " + converseStr);
	}
}
