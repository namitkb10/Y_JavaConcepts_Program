package java_Pattern_Program;

public class Display_1_to_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			num = 1;
			for (int j = num; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

//Expectation

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5
