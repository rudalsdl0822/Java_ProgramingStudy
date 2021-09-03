import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		sum = sum - 100;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] == arr[j]) {
					arr[i] = arr[j] = 0;
					break;
				}
			} 
			if (arr[i] == 0)
			break;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.println(arr[i]);
		}

	}
}
