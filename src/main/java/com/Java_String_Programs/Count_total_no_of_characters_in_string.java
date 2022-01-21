package com.Java_String_Programs;

import java.util.Scanner;

public class Count_total_no_of_characters_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any String: ");
		
		String str = scn.nextLine();
		scn.close();
		System.out.println("================================================");
		int len = str.length();
		int count=0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters in a string 1st Method: " + count);
		System.out.println("================================================");
		
		int size = str.replace(" ", "").length();
		

		System.out.println("Total number of characters in a string 2nd Method: " + size);
		System.out.println("================================================");
	}
}
