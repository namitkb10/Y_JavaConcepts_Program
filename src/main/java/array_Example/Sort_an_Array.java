package array_Example;

import java.util.Arrays;
import java.util.Collections;

public class Sort_an_Array {

	public static void main(String[] args) {
		int temp;
		// TODO Auto-generated method stub
		int[] numArr1 = { 10, 30, 50, 80, 20, 40, 20, 10, 50, 70, 60 };
		System.out.println("=====================================================");
		System.out.println("Method-1");
		// System.out.print("Sorted Array: ");
		Arrays.sort(numArr1);
		System.out.println("Sorted Array: " + Arrays.toString(numArr1));
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("Method-2");
		System.out.print("Sorted Array: ");
		int[] numArr2 = { 10, 30, 50, 80, 20, 40, 20, 10, 50, 70, 60 };
		for (int j = 0; j < numArr2.length; j++) {
			for (int j2 = j + 1; j2 < numArr2.length; j2++) {
				// if (numArr2[j] < numArr2[j2]) { // reverse order
				if (numArr2[j] > numArr2[j2]) {
					temp = numArr2[j];
					numArr2[j] = numArr2[j2];
					numArr2[j2] = temp;
				}
			}
		}
		for (int k = 0; k < numArr2.length; k++) {
			System.out.print(numArr2[k] + " ");
		}
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("Method-3");
		System.out.print("Sorted Array: ");
		int[] numArr3 = { 10, 30, 50, 80, 20, 40, 20, 10, 50, 70, 60 };
		//Arrays.sort
		System.out.println("Need to implement");  
		System.out.println("Array elements in descending order: " +Arrays.toString(numArr3));  
		System.out.println();
		System.out.println("=====================================================");
	}
}
