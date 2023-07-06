package _6.MisArray_Programs;

public class Second_Highest_Element_In_Array {

	public static void main(String[] args) {

		int[] a = { 10, 2, 4, 12, 56, 7 };
		int max = a[0];

		// Arrays.sort(a);// {2,4,7,10,12,56}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i - 1];
			}

		}
		System.out.println(max); // max no

	}
}
