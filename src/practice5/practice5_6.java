package practice5;

class Weapon {
	protected int fire() {
		return 1; // 무기는 기본적으로 한 명만 살상
	}
}

class Cannon extends Weapon {
	@Override ////생략가능. 아래 메서드가 정확히 오버라이딩된 것인지 컴파일러가 체크하기 때문에 개발 실수를 줄일 수 있음.
	protected int fire() { // 오버라이딩
	return 10; // 대포는 한 번에 10명을 살상
	}
}

public class practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + 
		weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + 
		weapon.fire());
	}

}
