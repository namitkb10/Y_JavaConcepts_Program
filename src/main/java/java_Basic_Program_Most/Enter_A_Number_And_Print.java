package java_Basic_Program_Most;

public class Enter_A_Number_And_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter a number like 3 and print, 1 to maximum of that digit
		// Like, If entered 3 display 1 to 999(Max of 3 digit)
		
		int number = 2;
		int num=0;
		
		for (int i = 0; i < number; i++) {
			num = num * 10 + 9;
		}
		System.out.println(num);
		System.out.println();
		for (int j = 1; j <= num; j++) {
			System.out.println(j);
		}
	}
}
