package java_Basic_Program_Most;

import java.util.Scanner;

public class Print_Entered_ASCII_Value_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter First charater: ");
		char charEntered1 = scn1.next().charAt(0);
		int intEntered1 = charEntered1;
		//or
		Scanner scn2 = new Scanner(System.in);
		System.out.println("Enter Second charater: ");
		char charEntered2 = scn1.next().charAt(0);
		int intEntered2 = (int)charEntered2;
		System.out.println("ASCII value of " + charEntered1 + " is: " + intEntered1);
		System.out.println("ASCII value of " + charEntered2 + " is: " + intEntered2);
	}
}
