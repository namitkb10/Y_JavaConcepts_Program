package com.Sorting_And_Searching;

public class Bubble_Sort_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to sort array elements using bubble sort
		int[] intArr = new int[] {10, 5 , 18, 22, 14, 17, 12, 8, 16, 11, 20, 17, 23, 13, 17, 28};
		
		System.out.print("Array Before Bubble Sort: ");
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		System.out.print("====================================");
		
		bubbleSort(intArr);
		
		System.out.println();
		System.out.print("Array After Bubble Sort:  ");
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
	}

	static void bubbleSort(int[] intArr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length-1; j++) {
				if(intArr[i] > intArr[j])
				{
					//Swap elements using third variable 
					temp = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = temp;
				}
			}
		}
	}
}
