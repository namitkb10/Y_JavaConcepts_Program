package _4_polymorphismClassPack;

public class CompileTimePolymorphismClass {
	
	// https://www.softwaretestingmaterial.com/polymorphism-in-java/
	
	void myMethod (int a){
		System.out.println("1. - value of a is: " + a);
	}
	
	void myMethod (int a, int b){
		System.out.println("2. - value of a is: " + a + " and value of b is: " + b);
	}
	
	void myMethod (String a, int b){
		System.out.println("3. - value of a is: " + a + " and value of b is: " + b);
	}
	
	void myMethod (int a, String b){
		System.out.println("4. - value of a is: " + a + " and value of b is: " + b);
	}
	
	void myMethod (String a){
		System.out.println(a);
	}
	
	public static void main (String [] args){
		CompileTimePolymorphismClass obj = new CompileTimePolymorphismClass();
		obj.myMethod(10);
		obj.myMethod(20, 21);
		obj.myMethod("Namit", 30);
		obj.myMethod(40, "KB");
		obj.myMethod("5. - I am a String");
	}
}