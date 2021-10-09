package example5;

class Shape_5 { // 슈퍼 클래스
	public Shape_5 next; 
	public Shape_5() { next = null; }
	public void draw() {
		System.out.println("Shape_5");
	}
}

class Line_5 extends Shape_5 {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line_5");
	}
}

class Rect_5 extends Shape_5 {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect_5");
	}
}

class Circle_5 extends Shape_5 {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle_5");
	}
}

public class example5_5 {
	static void paint(Shape_5 p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 
		// 동적 바인딩
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
