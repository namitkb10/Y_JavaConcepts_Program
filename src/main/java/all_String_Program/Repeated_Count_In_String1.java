package all_String_Program;

import java.util.ArrayList;

public class Repeated_Count_In_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "namitkumarbarnwal";
		String[] strArr = str.split("");
		
		ArrayList<String> arrList = new ArrayList<String>();
		int count=0;
		for (int i = 0; i < strArr.length; i++) {
			count=1;
			if(!arrList.contains(strArr[i]))
			{
				arrList.add(strArr[i]);
				for (int j = i+1; j < strArr.length; j++) {
					if(strArr[i].equalsIgnoreCase(strArr[j]))
					{
						count++;
					}
				}
				System.out.println(strArr[i] + " repeats " + count + " times ");
			}
		}
	}
}