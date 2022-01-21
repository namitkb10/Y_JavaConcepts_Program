package java_Pattern_Program;

public class Descending_Order_Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = num; i > 0; i--) {
			for (int j = 1; j <= num; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			num--;
		}
	}
}

//Expectation

//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1