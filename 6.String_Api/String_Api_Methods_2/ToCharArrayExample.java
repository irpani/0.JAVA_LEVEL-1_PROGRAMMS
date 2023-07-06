package String_Api_Methods_2;

public class ToCharArrayExample {
	public static void main(String[] args) {
		String str = "javaguides";
		char[] characters = str.toCharArray();
		for (char c : characters) {
			System.out.println(c);
		}
		
	}
}