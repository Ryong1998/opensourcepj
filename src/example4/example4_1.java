package example4;

public class example4_1 {

	public static void main(String[] args) {
		Circle_1 pizza; //���۷��� ���� ����
		pizza = new Circle_1(); // new�� �̿��ؼ� Circle_1 ��ü ����(pizza)
		pizza.radius = 10; // ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area); //��� ���
		Circle_1 donut = new Circle_1(); // new�� �̿��ؼ� Circle_1 ��ü ����(donut)
		donut.radius = 2; // ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area); //��� ���
	}

}
