package _1_abstractClassPack;

//Inheriting the AbstractSuperClass class
public class AbstractChildOneClass extends AbstractSuperClass {

	public static void main(String[] args) {
		// https://www.softwaretestingmaterial.com/abstraction-in-java/
		
		// Here we cannot instantiate the AbstractSuperClass class but we can
		// instantiate the AbstractChildClass class
		// Using the instance of AbstractChildClass we can access methods and data
		// members of AbstractSuperClass class
		
		// https://www.javatpoint.com/abstract-class-in-java
		// https://www.javatpoint.com/encapsulation
		// 
		// 

		AbstractSuperClass obj = new AbstractChildOneClass();

		System.out.println("I am a data member from Super class and my value is: " + obj.a);
		obj.myMethod();
		obj.myMethod1(20);
	}

	@Override
	void myMethod() {
		System.out.println("I am in child class");
	}
}