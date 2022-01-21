package _1_abstractClassPack;

public abstract class AbstractSuperClass {
	// data members cant be abstract
	// https://www.softwaretestingmaterial.com/abstraction-in-java/
	
	 public int a = 10;
	 
	 // myMethod() is an abstract method
	 abstract void myMethod();
	 
	 // myMethod(int x) is not an abstract method. Its a concrete method
	 void myMethod1(int x){
	 System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
	 }
}
