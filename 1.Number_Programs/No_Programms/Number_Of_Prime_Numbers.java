package No_Programms;

public class Number_Of_Prime_Numbers {

	public static void main(String[] args) {

		int i, count, j;
		for (i = 1; i <= 100; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("" + i);
			}

		}

	}
}