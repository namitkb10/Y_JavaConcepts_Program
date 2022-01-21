package java_Basic_String_Program;

import java.util.Iterator;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdedcba";
		
		String[] strArr = str.split("");
		String revStr = ""; 
		for (int i = strArr.length-1; i >=0 ; i--) {
			revStr = revStr + strArr[i];
		}
		
		if(str.equalsIgnoreCase(revStr))
		{
			System.out.println("Enter String: " + str + " is palindrome of " + revStr);
		}
	}
}
