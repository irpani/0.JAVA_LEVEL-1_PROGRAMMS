package _6.MisArray_Programs;

public class AvgAllElemArray {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 1, 2, 3, 4, 5 };
		// using double as average can be in decimal.

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i];
		}
		double average = sum / n;
		System.out.println("The average is: " + average);
	}
}