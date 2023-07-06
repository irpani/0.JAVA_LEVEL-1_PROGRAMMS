package String_Basics_1;

public class Print_Console_Techniques_4 {
	public static void main(String[] args) {
		// + symbol behave like concatenation Operator
		int a = 100;
		int b = 200;
		double d1 = 12.33;
		double d2 = 13.22;
		System.out.println(100);
		System.out.println(200);
		System.out.println("The value Of a is :" + a);
		System.out.println("The value Of b is :" + b);
		System.out.println("sum of the a&b is :" + (a + b));

		System.out.println(d1 + d2);
		System.out.println(a + b + d1 + d2);

		System.out.println("Hello" + "world" + a + b);
		System.out.println("Hello" + "world" + (a + b));
		System.out.print("Naveen" + "\n");
		System.out.println("Test Automation");
	}

}
