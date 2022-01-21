package java_Basic_Program;

public class Biggest_Of_Three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50, b=40, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("Biggest No is: " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Biggest No is: " + b);
		}
		else
		{
			System.out.println("Biggest No is: " + c);
		}
	}
}
