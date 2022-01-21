package java_Basic_Program;

import java.util.Scanner;

public class Factorial_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		int num = scn.nextInt();
		scn.close();
		int fact=1, tempNum;
		tempNum=num;
		if(num<0)
		{
			System.out.println("Cannot Generate Factorial of Entered No: " + num);
		}
		else if(num==0 || num==1)
		{
			System.out.println("Factorial of Entered No: " + num + " is 1");
		}
		else
		{
			while(num>1)
			{
				fact = fact * num;
				num--;
			}
			System.out.println("Factorial of Entered No: " + tempNum + " is " + fact);
		}
	}
}
