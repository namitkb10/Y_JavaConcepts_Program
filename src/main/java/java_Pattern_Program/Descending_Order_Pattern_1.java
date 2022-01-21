package java_Pattern_Program;

public class Descending_Order_Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for (int i = num; i > 0; i--) {
			for (int j = num; j > 0; j--) {
				System.out.print(num + " ");
			}
			System.out.println();
			num--;
		}
	}
}

// Expectation

//5 5 5 5 5 
//4 4 4 4 
//3 3 3 
//2 2 
//1
