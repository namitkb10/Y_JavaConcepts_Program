package java_Oops_Concepts;

public class ChildClass extends ParentClass {
	
	static int i=11;
	int j=21;
	int k=31;

	public static void main11() {
		// TODO Auto-generated method stub
		//ParentClass pc = new ChildClass();
		System.out.println("Child Class Expected - 11" + i);
		// System.out.println("Child Class Expected - 11"  + this.i);
		// System.out.println("Parent Class Expected - 10" + super.i);
	}
	
	public static void main(String[] args) {
		main11();
	}
}
