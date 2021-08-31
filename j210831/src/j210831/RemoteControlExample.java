package j210831;

public class RemoteControlExample {
	public static void main(String[] args) {
	RemoteControl rc = null;
	
	rc = new Television();
	rc.turnOn();
	rc.turnOff();
	
	rc = new Audio();
	rc.turnOn();
	rc.turnOff();
	
	
	rc = new SmartTelevision();
	rc.turnOn();
	rc.setVolume(6);;
	rc.turnOff();
	
	Searchable sc = new SmartTelevision();
	sc.search("www.naver.com");
	
	SmartTelevision st = new SmartTelevision();
	st.turnOn();
	sc.search("www.google.com");	
	}
}