import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str[] = new String[80];
		int cnt = 0;
		int sum = 0;

		for (int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else
					cnt = 0;
			}
			System.out.println(sum);
			cnt = 0;
			sum = 0;
		}

	}

}