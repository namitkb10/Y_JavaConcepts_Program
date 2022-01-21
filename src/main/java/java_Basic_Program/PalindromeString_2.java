package java_Basic_Program;

import java.util.Scanner;

public class PalindromeString_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="", reverse="";
		Scanner scn = new Scanner(System.in);
		System.out.print("Please Enter a String: ");
		original = scn.nextLine();
		
		for (int i = original.length()-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println();
		
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("Entered String is Palindrome");
		}
		else
		{
			System.out.println("Entered String is not a Palindrome");
		}
	}
}
