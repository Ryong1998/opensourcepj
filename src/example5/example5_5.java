package example5;

class Shape_5 { // ���� Ŭ����
	public Shape_5 next; 
	public Shape_5() { next = null; }
	public void draw() {
		System.out.println("Shape_5");
	}
}

class Line_5 extends Shape_5 {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line_5");
	}
}

class Rect_5 extends Shape_5 {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect_5");
	}
}

class Circle_5 extends Shape_5 {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle_5");
	}
}

public class example5_5 {
	static void paint(Shape_5 p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. 
		// ���� ���ε�
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line_5 line = new Line_5();
		paint(line); 
		paint(new Shape_5()); 
		paint(new Line_5()); 
		paint(new Rect_5()); 
		paint(new Circle_5()); 
	}

}
