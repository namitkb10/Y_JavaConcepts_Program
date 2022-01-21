package java_Basic_Program_Most;

import java.util.Scanner;

public class Factorial_Program_Using_Recursive_Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int factorialNumber=1;  
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int numOriginal = scn.nextInt();
		scn.close();
		factorialNumber = factorial(numOriginal);   
		System.out.println("Factorial of "+numOriginal+" is: "+ factorialNumber);		
	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n * factorial(n-1));
		}	
	}    
}
