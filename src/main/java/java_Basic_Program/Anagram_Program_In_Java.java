package java_Basic_Program;

import java.util.Arrays;

public class Anagram_Program_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Mother in Law";
		String str2 = "Hitler Woman";
		
//		String str1 = "Hitler Women";
//		String str2 = "Mother in law";
		
		String[] arrStr1 = str1.trim().toLowerCase().replace(" ", "").split("");
		String[] arrStr2 = str2.trim().toLowerCase().replace(" ", "").split("");
		
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
		
		if(Arrays.equals(arrStr1, arrStr2))
		{
			System.out.println("String 1 is anagram of String 2");
		}
		else
		{
			System.out.println("String 1 is not anagram of String 2");
		}
	}
}