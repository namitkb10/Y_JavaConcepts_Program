package java_Basic_Program_Most;

public class Swapping_Without_Third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; int b=20;
		System.out.println("Before Swapping Value Of A: " + a);
		System.out.println("Before Swapping Value Of B: " + b);
		
		// Swap two number without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("After Swapping Value Of A: " + a);
		System.out.println("After Swapping Value Of B: " + b);
	}
}
