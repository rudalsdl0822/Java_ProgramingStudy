package clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	// Heap 영역에 이 메서드가 호출되면 cloned라는 이름으로 Member의 필드가 복제되고 공간을 할당받는다.
	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}
}
