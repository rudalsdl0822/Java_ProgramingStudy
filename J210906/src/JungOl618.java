import java.util.Scanner;

public class JungOl618 {

	// 정올 #618

	// 무게 무거운 기준 정렬 함수
	static void weightArray(Student std[]) {
		System.out.println("weight");
		int idx = 0;
		for (int j = 0; j < 5; j++) {
			double maxWeight = 0;
			for (int i = 0; i < 5; i++) {
				if (std[i].getWeight() > maxWeight) {
					maxWeight = std[i].getWeight();
					idx = i;
				}
			}
			System.out.print(std[idx].getName() + " " + std[idx].getHeight() + " ");
			System.out.printf("%.1f\n", std[idx].getWeight());
			std[idx].setWeight(-1);
		}
		return;
	}

	// 이름순 정렬함수
	static void nameArray(Student std[]) {
		System.out.println("name");
		int idx = 0;
		for (int j = 0; j < 5; j++) {
			char minName = 'z';
			for (int i = 0; i < 5; i++) {
				if (std[i].getName().charAt(0) < minName) {
					minName = std[i].getName().charAt(0);
					idx = i;
				}
			}
			System.out.print(std[idx].getName() + " " + std[idx].getHeight() + " ");
			System.out.printf("%.1f\n", std[idx].getWeight());
			std[idx].setName("z");
		}
		return;
	}

	// 배열 복사 함수
	static void dupArray(Student std1[], Student std2[]) {
		for (int i = 0; i < std1.length; i++) {
			std2[i] = new Student(std1[i].getName(), std1[i].getHeight(), std1[i].getWeight());
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std1[] = new Student[5];
		Student std2[] = new Student[5];

		// 학생 정보 입력받아 객체 생성 및 배열에 저장
		for (int i = 0; i < std1.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			std1[i] = new Student(name, height, weight);
		}
		sc.close();

		dupArray(std1, std2);
		nameArray(std2);
		System.out.println();
		weightArray(std1);

	}

	// 학생 클래스
	static class Student {
		private String name;
		private int height;
		private double weight;

		Student(String name, int height, double weight) {
			setName(name);
			setHeight(height);
			setWeight(weight);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

	}
}
