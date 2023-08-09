package No_Programms;

public class Display_1_100_EvenNumbers {

	public static void main(String[] args) {

		int num = 100;
		for (int i = 2; i <= num; i = i + 2) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
