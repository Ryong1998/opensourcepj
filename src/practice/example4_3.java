package practice;

public class example4_3 {

	public static void main(String[] args) {
		Circle_2 pizza = new Circle_2(10, "�ڹ�����"); // Circle_2 ��ü ����, ������ 10,�̸� �ڹ�����
		double area = pizza.getArea(); //���� ��ü(pizza)�� ���� ���
		System.out.println(pizza.name + "�� ������ " + area); //��� ���
		Circle_2 donut = new Circle_2(); // Circle_2 ��ü ����, ������ 1(�⺻��)
		donut.name = "��������"; //Circle_2 ��ü(����)�� �ʵ�(�̸�) ����
		area = donut.getArea(); //���� ��ü(donut)�� ���� ���
		System.out.println(donut.name + "�� ������ " + area); //��� ���
	}

}
