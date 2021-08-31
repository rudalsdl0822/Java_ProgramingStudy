package j210831;

import java.util.Scanner;

public class Exam1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0) {
				sc.close();
				for (int j = (i - 1); j >= 0; j--) {
					System.out.print(arr[j] + " ");
				}
				break;
			}

		}

	}

}
