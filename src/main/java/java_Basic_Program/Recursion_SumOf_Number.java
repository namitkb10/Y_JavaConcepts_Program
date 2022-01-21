package java_Basic_Program;

public class Recursion_SumOf_Number {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10; // 55
		sumOfNumber(num);
		
		System.out.println("Sum of a Number using recursion: " + sumOfNumber(num));
	}
	
	public static int sumOfNumber(int num)
	{
		if(num>0)
		{
			sum = sum + num;
			sumOfNumber(num-1);
			//sumOfNumber(num/10);
		}
		return sum;
	}
}
