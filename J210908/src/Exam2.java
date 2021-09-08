import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person[] = new Person[5];

		for (int i = 0; i < person.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			person[i] = new Person(name, height);
		}
		sc.close();

		int idx = 0;
		int min = 1000;

		for (int i = 0; i < person.length; i++) {
			if (person[i].height < min) {
				min = person[i].height;
				idx = i;
			}
		}
		System.out.println(person[idx].name + " " + person[idx].height);

	}

}

class Person {
	String name;
	int height;

	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
}