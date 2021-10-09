package example5;

interface PhoneInterface_8 { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall_8(); // 추상 메소드(public abstract 생략 가능)
	void receiveCall_8(); // 추상 메소드
	default void printLogo_8() { // default 메소드
		System.out.println("** Phone **");
	}
}

class SamsungPhone_8 implements PhoneInterface_8 { // 인터페이스 구현
	// PhoneInterface의 모든 메소드 구현
	@Override
	public void sendCall_8() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall_8() {
		System.out.println("전화가 왔습니다.");
	}
	// 메소드 추가 작성
	public void flash_8() { 
		System.out.println("전화기에 불이 켜졌습니다."); 
	}
}

public class example5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone_8 phone = new SamsungPhone_8();
		phone.printLogo_8();
		phone.sendCall_8();
		phone.receiveCall_8();
		phone.flash_8();
	}

}
