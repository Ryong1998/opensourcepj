package practice6.app;

import practice6.lib.Circle6_2;

public class practice6_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle6_2 a = new Circle6_2(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
		Circle6_2 b = new Circle6_2(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}

}
