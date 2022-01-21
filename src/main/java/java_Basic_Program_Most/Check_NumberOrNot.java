package java_Basic_Program_Most;

import java.util.Scanner;

public class Check_NumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Provide some input value: ");
		String input = scn.next();
		scn.close();
		if(numberOrNot(input))
		{
			System.out.println("Entered input is a valid Number");
		}
		else
		{
			System.out.println("Entered input is not a valid Number");
		}
	}

	static boolean numberOrNot(String input) {
		// TODO Auto-generated method stub
		try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
	}
}
