package practice;

public class Circle_2 {
	int radius;
	String name;
	public Circle_2() { // �Ű� ���� ���� ������(donut)
	radius = 1; name = ""; // radius�� �ʱⰪ�� 1, �̸��� �� ĭ
	}
	public Circle_2(int r, String n) { // �Ű� ������ ���� ������(pizza)
	radius = r; name = n;
	}
	public double getArea() {
	return 3.14*radius*radius;
	}
}
