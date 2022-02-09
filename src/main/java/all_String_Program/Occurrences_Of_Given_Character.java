package all_String_Program;

public class Occurrences_Of_Given_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is java again java again";
        
        int count1 = s.length();
        int count2 = s.replace("a", "").length();
        int count = count1-count2;
        
        System.out.println("Character 'a' repeated: " + count + " times");
	}
}
