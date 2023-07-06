package No_Programms;

public class Swap_with_Out_Using_Third_Va {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 30;
		System.out.println("Before swapping a = " + a + ", b = " + b + ", c = " + c);

		// Store sum of all in a
		// (a = 60)
		a = a + b + c;

		// After this, b has value of a
		// (b = 60 - (20 + 30) = 10)
		b = a - (b + c);

		// After this, c has value of b
		// (c = 60 - (10 + 30) = 20)
		c = a - (b + c);

		// After this, a has value of c
		// (a = 60 - (10 + 20) = 30)
		a = a - (b + c);

		System.out.println("After swapping a = " + a + ", b = " + b + ", c = " + c);
	}

}
