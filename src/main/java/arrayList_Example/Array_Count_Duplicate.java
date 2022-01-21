package arrayList_Example;

import java.util.ArrayList;

public class Array_Count_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {10, 20, 10, 30, 40, 20, 10, 50, 40, 60, 40, 70, 80};
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		int count=0;
		for (int i = 0; i < intArr.length; i++) {
			count=0;
			if(!intArrList.contains(intArr[i]))
			{
				intArrList.add(intArr[i]);
				for (int j = 0; j < intArr.length; j++) {
					if(intArr[i]==intArr[j])
					{
						count++;
					}
				}
				System.out.println(intArr[i] + " repeats " + count + " times ");
			}
		}
	}
}