package array_Example;

public class Copy_One_Array_Data_Into_Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[5];
		
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		intArr[4]=50;
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("");
		System.out.println("===========================================");
		int[] newIntArr = new int[intArr.length];
		
		for (int i = 0; i < intArr.length; i++) {
			newIntArr[i]=intArr[i];
		}
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(newIntArr[i] + " ");
		}
		System.out.println("");
		System.out.println("===========================================");
		// Copy elements of num[] to c[]
        int c[] = intArr.clone();
        
     // Display New Array
     	for (int l = 0; l < intArr.length; l++) {
     		System.out.print(c[l] + " ");
     	}
		
	}
}
