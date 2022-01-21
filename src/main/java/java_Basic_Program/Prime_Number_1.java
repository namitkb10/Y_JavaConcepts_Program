package java_Basic_Program;

import java.util.Scanner;

public class Prime_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		double num = scn.nextInt();
		scn.close();
		int flag = 0;

		int temp = (int) Math.sqrt(num);
		int newNum = (int) (num);

		if (num == 0 || num == 1) {
			System.out.println("Entered No " + newNum + " is not a Prime no");
		} else {
			for (int i = 2; i <= temp; i++) {
				if (num % i == 0) {
					System.out.println("Entered No " + newNum + " is not a Prime no");
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Entered No " + newNum + " is a Prime no");
			}
		}
	}
}