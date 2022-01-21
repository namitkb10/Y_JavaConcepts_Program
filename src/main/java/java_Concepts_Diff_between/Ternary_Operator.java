package java_Concepts_Diff_between;

public class Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The ternary operator is a part of Java’s conditional statements.
		// As the name ternary suggests,
		// it is the only operator in Java consisting of three operands.
		
		int x=10;  
		int y=30;  
		int z=20;  
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  " + largestNumber);  
	}
}
