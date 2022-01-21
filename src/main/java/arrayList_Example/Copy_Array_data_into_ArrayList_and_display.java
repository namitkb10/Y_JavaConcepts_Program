package arrayList_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Copy_Array_data_into_ArrayList_and_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Copy Array data into ArrayList and display
	      String[] array = {"a", "b", "c", "d", "e"};

	      //Method 1
	      List<String> list1 = Arrays.asList(array);          
	      System.out.println("Convert Array into ArrayList Method-1:  " + list1);
	      System.out.println("=========================================================");
	      
	      //Method 2
	      ArrayList<String> list2 = new ArrayList<String>();
	      list2.addAll(Arrays.asList(array));          
	      System.out.println("Convert Array into ArrayList Method-2:  " + list2);
	      System.out.println("=========================================================");

	      //Method 3
	      List<String> list3 = new ArrayList<String>();
	      Collections.addAll(list3, array);
	      System.out.println("Convert Array into ArrayList Method-3:  " + list3);
	      System.out.println("=========================================================");

	      //Method 4
	      List<String> list4 = new ArrayList<String>();
	      for(String text:array) {
	         list4.add(text);
	      }
	      
	      System.out.println("Convert Array into ArrayList Method-4:  " + list4);
	      System.out.println("=========================================================");
	}
}
