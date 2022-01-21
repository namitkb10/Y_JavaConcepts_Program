package java_Pattern_Program;

public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop for rows
		System.out.println("Right Triangle Star");
		int starLength = 5;
		for (int i = 0; i < starLength; i++) {
			//inner loop for rows  
			for (int j = 0; j <= i; j++) {
				//Print Stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Left Triangle Star");
		int i, j;
		for (i=0; i<starLength; i++) {
			//inner loop for rows  
			for (j=2*(starLength-i); j>=0; j--) {
				//Print Stars
				System.out.print(" ");
			}
			for (j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
