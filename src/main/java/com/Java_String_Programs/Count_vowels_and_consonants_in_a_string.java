package com.Java_String_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Count_vowels_and_consonants_in_a_string {

	private static final String Chars = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowelCount=0, consonantCount=0, intCount=0;
		/*
		 * //String[] strArr = {"a", "e", "i", "o", "u"}; List valid =
		 * Arrays.asList("a", "e", "i", "o", "u"); int[] intArr = {0,1,2,3,4,5,6,7,8,9};
		 */
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scn.nextLine().toLowerCase();
		scn.close();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowelCount++;
			}
			else if(str.charAt(i) >='a' && str.charAt(i) <='z')
			{
				consonantCount++;
			}
			else if(str.charAt(i) >='0' && str.charAt(i) <='9')
			{
				intCount++;
			}
		}
		System.out.println("Total No Of Vowels in Entered String: " + vowelCount);
		System.out.println("Total No Of Consonants in Entered String: " + consonantCount);
		System.out.println("Total No Of Vowels in Entered String: " + intCount);
	}
}
