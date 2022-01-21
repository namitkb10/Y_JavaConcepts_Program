package java_Basic_String_Program;

public class Equals_CompareTo_Double_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1 = new String("ABC");
        String str2 = new String("PQR");

        //comparing strings using equals() method
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str1));

        //comparing strings using == operator 
        System.out.println(str1 == str1);
        System.out.println(str1 == str2);

        //comparing strings using compareTo() method
        // comparing position of character
        System.out.println(str1.compareTo(str1));
        System.out.println(str1.compareTo(str2));
	}
}
