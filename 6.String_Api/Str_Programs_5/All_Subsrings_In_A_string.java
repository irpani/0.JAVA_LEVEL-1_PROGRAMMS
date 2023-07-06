package Str_Programs_5;

public class All_Subsrings_In_A_string {

	public static void main(String[] args) {

		String str = "abcd";

		for (int i = 0; i <= str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				System.out.println(str.substring(i, j));

			}

		}

		// logic
		// ----------
		/**
		 * 
		 * a ab abc abcd
		 * 
		 * 
		 * b bc bcd c cd
		 * 
		 * d
		 * 
		 * 
		 * 
		 */

	}

}
