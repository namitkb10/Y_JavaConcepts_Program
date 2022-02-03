package hashMap_Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "Namit");
		hMap.put(2, "Kumar");
		hMap.put(3, "Barnwal");
		hMap.put(4, "Divya");
		hMap.put(5, "Jyoti");
		hMap.put(6, "Bharti");
		
		for (HashMap.Entry i : hMap.entrySet()) {
			System.out.println(i.getKey() + " --- " + i.getValue());
		}
	}
}
