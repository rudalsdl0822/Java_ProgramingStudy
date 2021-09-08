 // Exam3 관련
public class Exam {
	int value1, value2;

	public Exam(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public void maxmin() {
		if (this.value1 > this.value2) {
			this.value1 = this.value1 / 2;
			this.value2 = this.value2 * 2;
		} else {
			this.value1 = this.value1 * 2;
			this.value2 = this.value2 / 2;
		}
	}
}
