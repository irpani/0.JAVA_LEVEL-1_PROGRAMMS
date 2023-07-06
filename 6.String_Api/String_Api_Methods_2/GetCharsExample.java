package String_Api_Methods_2;

public class GetCharsExample {
	public static void main(String[] args) {
		String str = "javaguides";
		char[] dest = new char[str.length()];
		str.getChars(0, str.length(), dest, 0);
		for (char c : dest) {
			System.out.println("Copied characters :: " + c);
		}
	}

}
