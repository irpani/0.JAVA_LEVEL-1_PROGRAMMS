package String_Api_Methods_2;

public class ReplaceExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = str.replaceFirst("[a-z]", "java");
		System.out.println(subStr);
	}
}