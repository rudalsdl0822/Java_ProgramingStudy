package myInterface;

public interface ParentInterface {
	public void method1();

	public default void method2() {
		System.out.println("ParentInterface-method2 실행");
		/* 실행문 */}

}
