package practice6.app;

import practice6.lib.Circle6_2;

public class practice6_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle6_2 a = new Circle6_2(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		Circle6_2 b = new Circle6_2(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}

}
