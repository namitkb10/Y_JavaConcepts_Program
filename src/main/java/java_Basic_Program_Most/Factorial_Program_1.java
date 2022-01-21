package java_Basic_Program_Most;

import java.util.Scanner;

public class Factorial_Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int numOriginal = scn.nextInt();
		scn.close();
		int factNum=1;
		for (int i = 1; i <= numOriginal; i++) {
			factNum = factNum * i;
		}
		System.out.println("Factorial Of Entered Number " + numOriginal + " is: " + factNum);
	}
}
