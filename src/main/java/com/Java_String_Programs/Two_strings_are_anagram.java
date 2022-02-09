package com.Java_String_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Two_strings_are_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LISTEN == SILENT
		Scanner scn1 = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String str1 = scn1.nextLine().toLowerCase().trim();
		
		Scanner scn2 = new Scanner(System.in);
		System.out.print("Enter String 2: ");
		String str2 = scn1.nextLine().toLowerCase().trim();
		scn1.close();
		scn2.close();
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println();
		
		if(Arrays.equals(charArr1, charArr2))
		{
			System.out.println("Enter Strings are anagram");
		}
		else
		{
			System.out.print("Enter Strings are not anagram");
		}
	}

}
