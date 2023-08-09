package No_Programms;

public class ArmStrong {
	public static void main(String[] args) {
		int temp, num = 153, c = 0, a;
		temp = num;

		while (num != 0) {
			a = num % 10;
			num = num / 10;
			c = c + a * a * a;
		}

		if (temp == c) {
			System.out.println("number is armstrongnumber " + c);
		} else {
			System.out.println("number is not an armstrongnumber");
		}
	}
}
