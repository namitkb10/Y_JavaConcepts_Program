package array_Example;

import java.util.ArrayList;

public class Duplicate_Elements_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "Namit", "Kumar", "Divya", "Barnwal", "Namit", "Divya", "Kumar", "Jyoti", "Bharti",
				"Namit" };
		ArrayList<String> arrList = new ArrayList<String>();
		int count = 0;

		for (int i = 0; i < strArr.length; i++) {
			count = 1;
			if (!arrList.contains(strArr[i])) {
				arrList.add(strArr[i]);
				for (int j = i + 1; j < strArr.length; j++) {
					if (strArr[i].equalsIgnoreCase(strArr[j])) {
						count++;
					}
				}
			}
			if (count > 1) {
				System.out.println(strArr[i] + "---" + count);
			}
		}
	}
}
