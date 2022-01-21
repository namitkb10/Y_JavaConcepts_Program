package com.Java_String_Programs;

public class Extract_No_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st Method
		String str1 = "Namitkb10";
		String str = "avbkjd1122klj4 543 af";
		System.out.print("Following integers are found in the string: ");
		System.out.print(extractInt(str));
		
		// 2nd Method
		System.out.println("");
		System.out.println("===================================================");
        System.out.print("Following integers are found in the string: ");

        //4
        for (char ch : str1.toCharArray()) {
            //5
            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
        
     // 3rd Method
     	System.out.println("");
     	System.out.println("===================================================");
        System.out.print("Following integers are found in the string: ");
        //extracting string
        String str3 = "DJBharti1012";
        String numbers=str3.replaceAll("[^0-9]", "");
         
        System.out.println("Numbers are: " + numbers);
		
	}
	
	static String extractInt(String str)
    {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");
  
        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();
  
        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");
  
        if (str.equals(""))
            return "-1";
  
        return str;
    }
}
