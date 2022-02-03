package _5_oops_Examples;

public class Overloading_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingConcepts.floatBigExample(1.1);
	}
}

class overloadingConcepts
{
	
	static void floatBigExample(short a) {
		System.out.println("Displaying Short");
	}
	
	static void floatBigExample(int a) {
		System.out.println("Displaying Integer");
	}
	
	static void floatBigExample(long a) {
		System.out.println("Displaying Long");
	}
	
	static void floatBigExample(float a) {
		System.out.println("Displaying Float");
	}
	
	static void floatBigExample(double a) {
		System.out.println("Displaying Double");
	}
}
