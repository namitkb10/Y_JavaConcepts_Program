package all_String_Program;

public class Compare_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// == is used to compare the reference variable of two String object &
				// .equals is used to compare the content of two Strings object .Both returns the boolean value.
				
				String s1 = new String("TUTORIALSPOINT");
				String s2 = new String("TUTORIALSPOINT");

				// Reference/Address comparison
				System.out.println(s1 == s2); // false

				// Content/Value comparison
				System.out.println(s1.equals(s2)); // true

				// Integer-type
				System.out.println(10 == 10); // true

				// Char-type
				System.out.println('a' == 'a'); // true
				
				System.out.println("========================================");
				
				String str1="Java";
				String str2="Java";
				System.out.println(str1.equals(str2)); //true because content is same.
				System.out.println(str1==str2); //true because both reference variable are referring to the same String.
	}

}
