package java_Basic_Program;

public class Dispaly_1_to_10_Without_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		display_1_to_10(n);
	}

	private static void display_1_to_10(int num) {
		// TODO Auto-generated method stub
		if(num <= 10)
		{
			System.out.print(num + " ");
			display_1_to_10(num+1);
		}
	}
}
