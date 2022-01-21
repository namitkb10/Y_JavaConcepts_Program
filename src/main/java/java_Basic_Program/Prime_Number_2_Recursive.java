package java_Basic_Program;

import java.util.Scanner;

public class Prime_Number_2_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, m=0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		int num = scn.nextInt();
		scn.close();
		if(numIsPrime(num))
		{
			System.out.println("Entered Number " + num + " is a Prime Number");
		}
		else
		{
			System.out.println("Entered Number " + num + " is not a Prime Number");
		}
	}
	
	public static boolean numIsPrime(int num)
	{
		if(num <= 1)
		{
			//System.out.println("Entered Number" + num + " is a Prime Number");
			return false;
		}
		else
		{
			for(int i=2; i<=Math.sqrt(num); num++)
			{
				if(num%i==0)
				{
					//System.out.println("Entered Number" + num + " is a Prime Number");
					return false;
				}
			}
		}
		return true;
	}
}
