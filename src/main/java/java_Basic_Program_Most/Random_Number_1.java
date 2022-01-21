package java_Basic_Program_Most;

import java.util.Random;

public class Random_Number_1 {

	public static void main(String[] args) {
		double min=1.00, max=100.00;
		// TODO Auto-generated method stub
		Random random = new Random();   
		double randomInt = (double)(Math.random()*(max-min+1)+min);
		
		System.out.println(randomInt);
		double randomDouble = random.nextDouble();
		System.out.println(randomDouble);
		int x = random.nextInt(500);
		System.out.println(x);
		
	}
}
