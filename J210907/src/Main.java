import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();

		calendar(month, day);

	}

	static void calendar(int month, int day) {
		String result = null;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day >= 1 && day <= 31) {
				result = "OK!";
			} else {
				result = "BAD!";
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day >= 1 && day <= 30) {
				result = "OK!";
			} else {
				result = "BAD!";
			}
		} else if (month ==2) {
			if (day >= 1 && day <= 29) {
				result = "OK!";
			} else {
				result = "BAD!";
			}
		} else {
			result = "BAD!";
		}
		System.out.println(result);
	}
}
