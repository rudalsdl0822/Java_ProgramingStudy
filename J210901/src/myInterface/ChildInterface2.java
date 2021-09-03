package myInterface;

public interface ChildInterface2 extends ParentInterface {
	public default void method2() {
		System.out.println("ChildInterface2-method2() 실행");
	}
	public void method3();

}
