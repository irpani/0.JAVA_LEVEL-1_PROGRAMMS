package String_Basics_1;

public class ImmutableString_2 {

	public static void main(String args[]) {
		String str = "Hello";
		str.concat("World");
		System.out.println("String is Immutable because It will not Allowed Operatios on Directly " + str);

		System.out.println("-------------------");
		String str2 = str.concat("World");
		System.out.println("After Creation Of new Object Allowed Operations" + str2);
	}
}
