package java_Oops_Concepts;

//create Animal class which is base class of Animal   
class Animal {
	// data member of Animal class
	String color = "white";

}

//create child class of Animal  
class Cat extends Animal {
	// default constructor
	Cat() {
		// data members of the Cat class
		String color = "Brown";
		System.out.println("The cat is of color " + super.color); // calling parent class data member
		System.out.println("The cat is of color " + color);
	}
}

//create child class for Car  
class SuperExample1 extends Cat {
	// default constructor
	SuperExample1() {
		// calling base class constructor
		super();
		System.out.println("The eyes of the cat is blue.");
	}

	// main() method start
	public static void main(String[] args) {
		// call default constructor of the SuperExample1
		new SuperExample1();
		System.out.println("Inside Main");
	}
}
