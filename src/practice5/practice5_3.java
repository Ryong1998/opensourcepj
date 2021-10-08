package practice5;

class Point_3 {
	private int x, y; // �� ���� �����ϴ� x, y ��ǥ
	public Point_3() {
		this.x = this.y = 0;
	}
	public Point_3(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // ���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint_3 extends Point_3 { 
	private String color; // ���� ��
	public ColorPoint_3(int x, int y, String color) {
		super(x, y); // Point�� ������ Point(x, y) ȣ��, super ������ public Point_3()�� ���ؼ� 5,6 �ƴ� 0,0�� ���޵�
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}

public class practice5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint_3 cp = new ColorPoint_3(5, 6, "blue");
		cp.showColorPoint();
	}

}
