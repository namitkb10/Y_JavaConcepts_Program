package java_Basic_Program_Most;

import java.util.Scanner;

public class Armstrong_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Armstrong Number in Java
		int newNumber, count=0, armNumber=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scn.nextInt();
		int duplicateNumber = number;
		int temp = number;
		scn.close();
		while (number>0) {
			number=number%10;
			number=number/10;
			count++;
		}
		for (int i = 0; i < count; i++) {
			while (number>0) {
				temp=temp%10;
				//armNumber=armNumber 
				number=number/10;
				count++;
			}
		}
	}

}
