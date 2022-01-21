package java_Basic_Program;

import java.util.Scanner;

public class Print_1_to_Max_N_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = ""; 
	      Scanner scn = new Scanner(System.in);   
	      System.out.print("Enter a number: ");  
	      int num = scn.nextInt();
	      scn.close();
	      
	      for (int i = 0; i < num; i++) {
			str = str + "9";
	      }
	      
	      System.out.print("Max No is: " + str);  
	}
}
