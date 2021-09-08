import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		Exam num = new Exam(num1, num2);
		num.maxmin();
		System.out.println(num.value1 + " " + num.value2);
	}
}
