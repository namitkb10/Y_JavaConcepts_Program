package array_Example;

public class Frequency_Of_Each_Element_In_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to find the frequency of each element in the array
		
		
		//Logic/Program not yet completed
		int[] arr1 = new int[] {1,2,2,3,4,4,5,2,4,3,1,6,3,5,2,3,2,8,9,8,3,3,1};
		int[] dArr =new int[arr1.length];  
		int count=1;
		for (int i = 0; i < arr1.length; i++) {
			
			if(dArr.toString().contains(arr1.toString())) {
				dArr[i]=arr1[i];
				for (int j = i+1; j < arr1.length; j++) {
					
					if(arr1[i]==arr1[j]) {
						count++;
					}
				}
				System.out.println(arr1[i]+" || " + count + " times in the array");
				count=0;
			}
		}
	}
}
