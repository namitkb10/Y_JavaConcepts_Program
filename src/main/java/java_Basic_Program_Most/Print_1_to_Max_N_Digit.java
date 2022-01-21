package java_Basic_Program_Most;

import java.util.Scanner;

public class Print_1_to_Max_N_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();
		sc.close();
		String s="";
		
		for (int i = 0; i < a; i++) {
			s=s+"9";
		}
		int iNumber = Integer.parseInt(s);
		for (int j = 1; j <= iNumber; j++) {
			System.out.print(j + " ");
		}
	}
}
