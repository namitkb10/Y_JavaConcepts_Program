package arrayList_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num_1 = new ArrayList<Integer>();
		// ArrayList<String> str = new ArrayList<String>();
		// Arrays obj = new Arrays();
		
		num_1.add(10);
		num_1.add(20);
		num_1.add(30);
		num_1.add(40);
		num_1.add(50);
		
		System.out.println(num_1);
		System.out.println();
		System.out.println("Size of the Arrays: " + num_1.size());

		//==================================================================================================
		System.out.println();
		
		ArrayList<Integer> num_2 = new ArrayList<Integer>();
		//ArrayList<String> str = new ArrayList<String>();
		
		num_2.add(30);
		num_2.add(40);
		num_2.add(50);
		num_2.add(60);
		num_2.add(70);
		
		System.out.println(num_2);
		
		num_2.addAll(num_1);
		
		System.out.println();
		System.out.println("Added All the Element On Array_1: " + num_2);
		//==================================================================================================
		System.out.println();
		
		List<String> strArrList = new ArrayList<String>();
		//ArrayList<String> str = new ArrayList<String>();
		
		strArrList.add("Bengaluru");
		strArrList.add("Delhi");
		strArrList.add("Mumbai");
		strArrList.add("Hyderabad");
		strArrList.add("Pune");
		
		System.out.println(strArrList);
		
		strArrList.remove(0);
		strArrList.remove("Delhi");
		
		System.out.println();
		System.out.println("After Removing Array Elements: " + strArrList);
		//==================================================================================================
		// Added Elements in the ArrayList based on Index value
		System.out.println();

		strArrList.add(0, "Delhi");
		strArrList.add(1, "Bengaluru");
		System.out.println("Elements After Adding index based: " + strArrList);
		//==================================================================================================
		// Update Array Elements in the ArrayList based on Index value
		System.out.println();

		strArrList.set(2, "Kolkata");
		strArrList.set(4, "J&K");
		System.out.println("Elements After Adding index based: " + strArrList);
		//==================================================================================================
		// Get Element from the ArrayList based on Index value
		System.out.println();

		strArrList.get(4);
		System.out.println("Elements retrieve based on index: " + strArrList.get(4));
		//==================================================================================================
		// Sorting of ArrayList Element
		System.out.println();
		
		Collections.sort(strArrList);
		System.out.println("Elements After Sorting: " + strArrList);
		//==================================================================================================
		// Sorting of ArrayList Element
		System.out.println();
		
		Collections.sort(strArrList, Collections.reverseOrder());
		System.out.println("Elements After Reversing: " + strArrList);
		//==================================================================================================
		// Contains Methods ArrayList Element
		System.out.println();
		
		System.out.println(strArrList.contains("Kolkata"));
		//==================================================================================================
		// IsEmpty Methods ArrayList Element
		System.out.println();
		
		System.out.println(strArrList.isEmpty());
		//==================================================================================================
		// IsEmpty Methods ArrayList Element
		System.out.println();
		
		System.out.println(strArrList.isEmpty());
		//==================================================================================================
		// Read the ArrayList Element using For Loop
		System.out.println();
		System.out.println();
		System.out.print("Displaying data using For Loop: ");
		
		for (int i = 0; i < strArrList.size(); i++) {
			System.out.print(strArrList.get(i) + " ");
		}
		//==================================================================================================
		// Read the ArrayList Element using Foreach Loop
		System.out.println();
		System.out.println();
		System.out.print("Displaying data using Foreach Loop: ");
		for (String string : strArrList) {
			System.out.print(string + " ");
		}
		//==================================================================================================
		// Read the ArrayList Element using Iterator
		System.out.println();
		System.out.println();
		
		Iterator it = strArrList.iterator();
		System.out.print("Displaying data using Iterator: ");
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		//==================================================================================================
		// Remove all ArrayList Element using removeAll method
		System.out.println();
		System.out.println();
		
		num_2.removeAll(num_1);
		System.out.print("After Removing Element: " + num_2);
		//==================================================================================================
	}
}