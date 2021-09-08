import java.util.Scanner;

public class Main {
	// 정올#153

	public static void main(String[] args) {
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == -1) {
				sc.close();
				if (i < 3) {
					for (int j = 0; j < i; j++) {
						System.out.print(arr[j] + " ");
					}
				} else {
					System.out.println(arr[i - 3] + " " + arr[i - 2] + " " + arr[i - 1]);
				}
				break;
			}
		}

	}

}
