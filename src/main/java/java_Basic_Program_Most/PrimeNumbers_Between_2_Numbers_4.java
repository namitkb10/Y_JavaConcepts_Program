package java_Basic_Program_Most;

import java.util.Scanner;

public class PrimeNumbers_Between_2_Numbers_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the first number: ");  
	       int start = s.nextInt();  
	       System.out.print("Enter the second number: ");  
	       int end = s.nextInt();
	       s.close();
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       for (int i = start; i <= end; i++) {  
	           if (isPrime(i)) {  
	               System.out.print(i + " ");  
	           }  
	       }  
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(num); i++) {  
	           if (num % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
}
