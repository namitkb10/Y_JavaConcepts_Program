package java_Basic_Program;

import java.util.Scanner;

public class Armstrong_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; int sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scn.nextInt();
		int duplicateNumber = num;
		int temp=num;
		scn.close();
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
		num=temp;
		//sum = sum + armStrong(num, count);
		
		int intSum=1; int newNum=0;
		for (int i = 0; i < count; i++) {
			while (num >= 1) {
				intSum = intSum * newNum;
				
			} 
		}

		/*if(duplicateNumber == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");*/
	}
	
	/*public static int armStrong(int num, int count)
	{
		
		int intSum=1; int newNum=0;
		for (int i = 0; i < count; i++) {
			while (num >= 1) {
				intSum = intSum * newNum;
				
			} 
		}
		return intSum;
	}*/
}

/*
 * //int intNum = count; newNum=num/10; for (int i = 0; i < count; i++) {
 * 
 * } num=num/10; //intNum--;
 */