package all_String_Program;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A Palindrome is a word, sentence or even number that reads the same backward or forward.
		
		String str = "abcdedcba";
		int count = str.length();
		System.out.println(count);
		String[] strArr = str.split("");
		String revStr = ""; 
		for (int i = strArr.length-1; i >=0 ; i--) {
			revStr = revStr + strArr[i];
		}
		
		if(str.equalsIgnoreCase(revStr))
		{
			System.out.println("Enter String: " + str + " is palindrome of " + revStr);
		}
	}
}
