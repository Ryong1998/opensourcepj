package practice;

public class Circle_2 {
	int radius;
	String name;
	public Circle_2() { // 매개 변수 없는 생성자(donut)
	radius = 1; name = ""; // radius의 초기값은 1, 이름은 빈 칸
	}
	public Circle_2(int r, String n) { // 매개 변수를 가진 생성자(pizza)
	radius = r; name = n;
	}
	public double getArea() {
	return 3.14*radius*radius;
	}
}
