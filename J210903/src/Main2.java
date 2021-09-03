import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num != 0) {
				if (num % 3 != 0 && num % 5 != 0) {
					cnt++;
				}
			} else {
				break;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
