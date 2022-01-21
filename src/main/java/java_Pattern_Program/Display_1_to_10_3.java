package java_Pattern_Program;

import java.util.Scanner;

public class Display_1_to_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scn = new Scanner(System.in);
		 * System.out.println("Please Enter a Number: " );
		 * int num = scn.nextInt();
		 * scn.close();
		 */
		
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
