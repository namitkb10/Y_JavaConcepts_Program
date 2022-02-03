package all_String_Program;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Elements_From_Array_Using_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,2,6,8,6,7,5,2,8};
        int n = a.length;
        // Function call
        removeDuplicates(a);
        System.out.println();
        System.out.println();
        removeDups(a, n);
	}

	public static void removeDuplicates(int[] a) {
		// TODO Auto-generated method stub
		Set<Integer> lhSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			lhSet.add(a[i]);
		}
		System.out.print(lhSet);
	}

	public static void removeDups(int[] a, int n) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int i = 0; i < n; ++i) {
			  
            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            if (map.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                map.put(a[i], true);
            }
        }
	}
}
