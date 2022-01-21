package _2_encapsulationClassPack;

public class EncapsulationClassOne {
	
	// Variables declared as private
    // These private variables can only be accessed by public methods of class
    // https://www.softwaretestingmaterial.com/encapsulation-in-java/
	
	// Encapsulation in java is a process of wrapping code and data
	// together into a single unit. It's an abstraction.
	
	private String name;
	private int age;
	
	// getter method to access private variable
	public String getName() {
		System.out.println("getName method - 3");
		return name;
	}
	// setter method to access private variable
	public void setName(String name) {
		System.out.println("setName method - 1");
		this.name = name;
	}
	
	public int getAge() {
		System.out.println("getAge method - 4");
		return age;
	}
	public void setAge(int age) {
		System.out.println("setAge method - 2");
		this.age = age;
	}
}
