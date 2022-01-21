package com.Java_String_Programs;

import java.util.Scanner;

public class Change_Upper_Lower_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scn.nextLine();
		StringBuffer sbf = new StringBuffer(str);
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
			{
				sbf.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				sbf.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println("String After Case Conversion: " + sbf);
	}
}
