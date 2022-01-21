package _2_encapsulationClassPack;

public class EncapsulationClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.softwaretestingmaterial.com/encapsulation-in-java/
		
		// Encapsulation in java is a process of wrapping code and data
		// together into a single unit. It's an abstraction.
		
		EncapsulationClassOne obj = new EncapsulationClassOne();
		obj.setName("Namit");
		obj.setAge(32);
		
		System.out.println("Set Name is: " + obj.getName());
		System.out.println("Set Age is: " + obj.getAge());
	}
}