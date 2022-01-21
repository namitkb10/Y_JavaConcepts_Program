package java_Basic_Program_Most;

import java.util.Scanner;

public class PrimeNumber_UsingBoolean_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int number = scn.nextInt();
		scn.close();
		if(isPrime(number))
		{
			System.out.println(number + " is a prime number");
		}
		else
		{
			System.out.println(number + " is not a prime number");
		}
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		if(number <=1)
		{
			System.out.println(number + " is not a Prime Number");
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
