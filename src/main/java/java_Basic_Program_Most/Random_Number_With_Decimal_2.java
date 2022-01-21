package java_Basic_Program_Most;

import java.util.Random;

public class Random_Number_With_Decimal_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random rand = new Random();
//		System.out.printf("%.2f%n", rand.nextInt(100) / 10.0);
		
		Random random = new Random();  // Only one instance needed.
		int total=5;
		for (int n = 0; n < total; n++) {
			
		   double digits_2 = random.nextInt(1000) / 100.0;
		   System.out.println("Random Number Upto 2 digits: " + digits_2); // System.out.println("== Because Above Divided By 100 ==");

		   
		   double digits_3 = random.nextInt(10000) / 1000.0;
		   System.out.println("Random Number Upto 3 digits: " + digits_3); // System.out.println("== Because Above Divided By 1000 ==");
		   

		   double digits_4 = random.nextInt(100000) / 10000.0;
		   System.out.println("Random Number Upto 4 digits: " + digits_4); // System.out.println("== Because Above Divided By 10000 ==");
		   
		   System.out.println();
		}
	}
}
