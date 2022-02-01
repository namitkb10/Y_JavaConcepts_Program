package _5_oops_Examples;

public class Overloading_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingConcepts.floatBigExample(11);
	}
}

class overloadingConcepts
{
	static void floatBigExample(double a) {
		System.out.println("Displaying Double");
	}
	
	static void floatBigExample(short a) {
		System.out.println("Displaying Float");
	}
	
	static void floatBigExample(int a) {
		System.out.println("Displaying Double");
	}
	
	static void floatBigExample(long a) {
		System.out.println("Displaying Float");
	}
	
	static void floatBigExample(float a) {
		System.out.println("Displaying Float");
	}
}
