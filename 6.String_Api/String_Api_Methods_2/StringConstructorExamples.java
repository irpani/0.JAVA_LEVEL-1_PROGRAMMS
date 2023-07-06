package String_Api_Methods_2;

public class StringConstructorExamples {
	public static void main(String[] args) {

		String string = new String(new StringBuffer("JavaGuides"));
		System.out.println(string);
		
		String string2 = new String(new StringBuilder("JavaGuides"));
		System.out.println(string2);

	}

}