import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		sc.close();

		System.out.printf("%.3f\n", d1);
		System.out.printf("%.3f\n", d2);
		System.out.printf("%.3f\n", d3);

	}

}
