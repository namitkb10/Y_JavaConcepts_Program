package all_String_Program;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Elements_From_Array_Using_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,6,8,6,7,5,2,8};
        int len = arr.length;
        // Function call
        removeDuplicates(arr);
        System.out.println();
        System.out.println();
        removeDups(arr, len);
	}

	public static void removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> lhSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lhSet.add(arr[i]);
		}
		System.out.print(lhSet);
	}

	public static void removeDups(int[] arr, int len) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < len; ++i) {
			  
            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            if (map.get(arr[i]) == null)
            {
                System.out.print(arr[i] + " ");
                map.put(arr[i], true);
            }
        }
	}
}
