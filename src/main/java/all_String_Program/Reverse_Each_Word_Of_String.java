package all_String_Program;

public class Reverse_Each_Word_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Namit Kumar Barnwal";
		String[] strArr = str.split(" ");
		String strRev = ""; String oStr = "";
		int count=0;
		for (int i = 0; i < strArr.length; i++) {
			// count = strArr[i].length();
			strRev="";
			for (int j = strArr[i].length()-1; j >=0; j--) {
				strRev = strRev + strArr[i].charAt(j);
			}
			oStr = oStr + strRev + " ";
		}
		
		System.out.println("Reverse Each Word of Entered String is: " + oStr);
	}
}
