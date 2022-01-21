package com.Java_String_Programs;

import java.util.Scanner;

public class Reverse_Each_Word_In_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rStr ="";
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String oStr = scn.nextLine().toLowerCase().trim();
		scn.close();
		String[] strArr = oStr.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = strArr[i].length()-1; j>=0; j--) {
				rStr = rStr + strArr[i].charAt(j);
			}
			rStr = rStr + " ";
		}
		System.out.println("Each Word Reverse String: " + rStr);
		if(rStr.trim().equals(oStr))
		{
			System.out.println("Enter String is Palindrome");
		}
		else
		{
			System.out.println("Enter String is not Palindrome");
		}
	}
}
