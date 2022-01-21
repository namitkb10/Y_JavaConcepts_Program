package java_Pattern_Program;

public class Display_1_to_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

// Expectation

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5