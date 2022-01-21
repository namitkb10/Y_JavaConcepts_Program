package java_Basic_Program;

public class Swapping_Without_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println();
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}
}
