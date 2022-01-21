package java_Basic_Program_Most;

public class Biggest_Of_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=19; int b=23; int c=18;
		
		if(a>b && a>c)
		{
			System.out.println("Biggest No is A: " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Biggest No is B: " + b);
		}
		else
		{
			System.out.println("Biggest No is C: " + c);
		}
	}
}
