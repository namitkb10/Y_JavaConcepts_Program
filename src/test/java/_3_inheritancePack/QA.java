package _3_inheritancePack;

public class QA extends Employee{

	String fullName = "Namit KB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.softwaretestingmaterial.com/inheritance-in-java/
		
		QA objName = new QA();
		
		System.out.println(objName.name);
		System.out.println(objName.fullName);
	}
}
