package com.Java_String_Programs;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oStr, rStr = "";
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String: ");
		oStr = scn.nextLine();
		scn.close();
		for (int i = oStr.length()-1; i >=0 ; i--) {
			rStr = rStr + oStr.charAt(i);
		}
		System.out.println("Reverse String is: " + rStr);
	}
}
