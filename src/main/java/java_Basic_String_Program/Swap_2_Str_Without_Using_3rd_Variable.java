package java_Basic_String_Program;

public class Swap_2_Str_Without_Using_3rd_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println("Before Swapping: ");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
         
        //Swapping starts
        s1 = s1 + s2;
        
        s2 = s1.substring(0, s1.length() - s2.length());
         
        s1 = s1.substring(s2.length());
        System.out.println();
        
        //Swapping ends
        System.out.println("After Swapping: ");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
	}
}
