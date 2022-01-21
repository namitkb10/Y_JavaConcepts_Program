package array_Example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Array_2nd_Highest_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========================================================");
		System.out.println("Method-1");
		int[] intArr1 = {10,20,50,30,60,40,80,90,70};
		int temp1=0;
	
		for (int i = 0; i < intArr1.length; i++) {
			for (int j = i+1; j < intArr1.length; j++) {
				if(intArr1[i] > intArr1[j])
				{
					temp1 = intArr1[i];
					intArr1[i] = intArr1[j];
					intArr1[j] = temp1;
				}
			}
		}
		System.out.println("2nd smallest no is: " + intArr1[1]);
		System.out.println("2nd highest no is: " + intArr1[intArr1.length-2]);
		System.out.println("==========================================================");
		System.out.println("Method-2");
		int[] intArr2 = {10,15,50,30,60,40,75,90,70};
		Arrays.sort(intArr2);
		

		System.out.println("Array is: " + Arrays.toString(intArr2));

		System.out.println("2nd smallest no is: " + intArr2[1]);
		System.out.println("2nd highest no is: " + intArr2[intArr2.length-2]);
		

		System.out.println("==========================================================");
		System.out.println("Method-3");
		int[] intArr3 = {10,25,50,30,60,40,85,90,70};
		int max=0; int max_2nd=0;
		for (int k = 0; k < intArr3.length; k++) {
			if(intArr3[k]>max)
			{
				max_2nd = max;
				max = intArr3[k];
			}
			if(intArr3[k]<max && intArr3[k]>=max_2nd)
			{
				max_2nd = intArr3[k];
			}
		}
		
		System.out.println("Max no is: " + max);
		System.out.println("2nd highest no is: " + max_2nd);
		
		System.out.println("==========================================================");
	}
}
