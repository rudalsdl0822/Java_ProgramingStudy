import java.util.Scanner;

public class Jungol127 {

	public static void main(String[] args) {
		// 정올 #127
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num < 0 || num > 100) {
				System.out.println("sum : " + sum);
				System.out.printf("avg : %.1f", (double) sum / cnt);
				sc.close();
				break;
			}
			sum += num;
			cnt++;
		}

	}

}
