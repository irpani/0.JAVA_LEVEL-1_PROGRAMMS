package String_Basics_1;

public class Concatenation_String_Int_Character_3 {
	public static void main(java.lang.String[] args) {

		String s = "Hello world";
		int a = 100;
		int b = 200;
		// _____Always remember execution starts from Left to right_____
		// Topic Concatrenatoin
		// Int Concatenation
		System.out.println(a + b);
		System.out.println(a + s); // 100Hello world
		System.out.println(b + s); // 200Hello world
		System.out.println(a + b + s); // 300Hello world
		System.out.println(a + s + b); // 100Hello world200
		System.out.println(s + a + b); // Hello world100200
		System.out.println(s + (a + b));// Hello world300

		// _____String Concatenation_____
		String p = "Test";
		String q = "Automation";
		System.out.println(p + q); // TestAutomation
		System.out.println(p + " " + q);// Test Automation --- for space concatenate between them

		// _____Character Concatenation____
		// Q: Can we Concatenate Characters? Possibility Yes But What is the Output?
		// A:195 y ? Whenever u add characters what will happened.
		// Characters Concatenation happened based on their ASCII Values.
		// So their is Ascii Value already defined.we have to check the Ascii vaues.
		// For Every Programming Language for Computer Science Already defined.
		// Go to Google Type the Ascii Table
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1 + c2);// 195
		// A-Z 65- 90
		// a-z 97-122
		// 0-9

	}

}
