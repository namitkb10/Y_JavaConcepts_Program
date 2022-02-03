package all_String_Program;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method-1");
//		Scanner scn1 = new Scanner(System.in);
//		System.out.print("Please Enter a String: ");
//		String str1 = scn1.next();
		String str1="Namit";
		String revStr1="";
		//scn1.close();
		for (int i = str1.length()-1; i >=0 ; i--) {
			revStr1 = revStr1 + str1.charAt(i);
		}
		System.out.println("Reverse Of Entered String is: " + revStr1);
		System.out.println("======================================================================");
		System.out.println("Method-2");
//		Scanner scn2 = new Scanner(System.in);
//		System.out.println("Please Enter 2nd String: ");
//		String str2 = scn2.next();
		String str2 = "Kumar";
		String revStr2 = "";
		String[] strArr2 = str2.split("");
		for (int j = strArr2.length-1; j >=0 ; j--) {
			revStr2 = revStr2 + strArr2[j]; 
		}
		System.out.println("Reverse Of Entered String is: " + revStr2);
		System.out.println("======================================================================");
		System.out.println("Method-3");
		String str3="Barnwal"; String revStr3="";
		char[] ch = str3.toCharArray();
		
		for (int k = ch.length-1; k >= 0; k--) {
			revStr3 = revStr3 + ch[k];
		}
		System.out.println("Reverse Of Entered String is: " + revStr3);
		System.out.println("======================================================================");
		System.out.println("Method-4");
		String str4="Jyoti";
		
		StringBuffer sbf = new StringBuffer(str4);
		// StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
		sbf.reverse();
		System.out.println("Reverse Of Entered String is: " + sbf);
		System.out.println("======================================================================");
		System.out.println("Method-5");
		String str5="Divya"; String revStr5="";
		
		StringBuilder sbd = new StringBuilder(str5);
		// StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
		sbd.reverse();
		System.out.println("Reverse Of Entered String is: " + sbd);
		System.out.println("======================================================================");
	}
}
