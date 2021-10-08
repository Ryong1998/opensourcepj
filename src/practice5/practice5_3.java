package practice5;

class Point_3 {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public Point_3() {
		this.x = this.y = 0;
	}
	public Point_3(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint_3 extends Point_3 { 
	private String color; // 점의 색
	public ColorPoint_3(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출, super 없으면 public Point_3()에 의해서 5,6 아닌 0,0이 전달됨
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}

public class practice5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint_3 cp = new ColorPoint_3(5, 6, "blue");
		cp.showColorPoint();
	}

}
