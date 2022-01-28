package array_Example;

import java.util.ArrayList;

public class Frequency_Of_Each_Element_In_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to find the frequency of each element in the array
		
		//Logic/Program not yet completed
		int[] intArr = new int[] {1,2,1,2,1,3,4,4,5,2,4,3,1,6,3,5,7,2,3,2,8,9,8,3,3,1};
		ArrayList<Integer> arrLstInt = new ArrayList<Integer>();
		int count=0;
		
		for (int i = 0; i < intArr.length; i++) {
			count=1;
			if(!arrLstInt.contains(intArr[i])) {
				arrLstInt.add(intArr[i]);
				for (int j = i+1; j < intArr.length; j++) {
					
					if(intArr[i]==intArr[j]) {
						count++;
					}
				}
				System.out.println(intArr[i]+" || " + count + " times in the array");
			}
		}
	}
}