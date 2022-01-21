package java_Basic_Program;

import java.util.Scanner;

public class PalindromeNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Please Enter the Number: ");
		int number =scn.nextInt();
		int newNumber = number;
		int temp;
		int revNum = 0;
		scn.close();
		
		while(number>0)
		{
			temp = number%10;
			revNum = revNum * 10 + temp;
			number =number/10;
		}
		
		if(revNum==newNumber)
		{
			System.out.println("Entered number is Palindrome");
		}
		else
		{
			System.out.println("Entered number is not Palindrome");
		}
	}
}
