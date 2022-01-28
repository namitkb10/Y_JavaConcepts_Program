package com.Java_String_Programs;

import java.util.Scanner;

public class Remove_All_Blank_Space_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Method-1");
		System.out.print("Enter a String: ");
		String str = scn.nextLine();
		str = str.replaceAll("\\s+", "");
		System.out.println("String after removing all the white/blank spaces: " + str);
		System.out.println("==================================================");
		System.out.println("Method-2");
		String str1 = "Divya Jyoti";
		str1 = str1.replaceAll(" ", "");
		System.out.println("String after removing all the white space: " + str1);
		System.out.println("==================================================");
	}
}
