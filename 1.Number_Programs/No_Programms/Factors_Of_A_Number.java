package No_Programms;

public class Factors_Of_A_Number {

	public static void main(String[] args) {

		int n = 10;
		System.out.println("Factors Of a Entered Number:");
		for (int i = 1; i <= n; i++) {

			if (n % i == 0)

				System.out.println(i);
		}

	}

}
