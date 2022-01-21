package java_Pattern_Program;

public class Descending_Order_Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

// Expectation

//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1


// Below Sample

//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1 
