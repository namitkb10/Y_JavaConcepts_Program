package java_Basic_Program_Most;

import java.util.Scanner;

public class PalindromeNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newNum=0, reverseNum=0, addNum=0;
		Scanner scn = new Scanner(System.in);   
		System.out.println("Please Enter a Number: ");
		
		int num = scn.nextInt();
		scn.close();
		newNum = num;
		while(num>0)
		{
			addNum=num%10; //getting remainder 
			reverseNum = (reverseNum * 10) + addNum;
			num=num/10;
		}
		if(reverseNum==newNum)
		{
			System.out.println("Enter Number " + newNum + " is a palidrome number");
		}
		else
		{
			System.out.println("Enter Number " + newNum + " is not a palidrome number");
		}
	}
}
