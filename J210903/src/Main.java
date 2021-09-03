import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int cnt = 0;
		for (int i = 1;; i++) {
			x = x - i;
			cnt++;
			if (x <= 0) {
				int a = 0, b = 0;
				for (int j = 0; j < cnt + x; j++) {
					a = 1 + j;
					b = cnt - j;
				}
				if (cnt % 2 == 0) {
					System.out.println(a + "/" + b);

				} else {
					System.out.println(b + "/" + a);
				}
				break;
			}
		}
	}
}