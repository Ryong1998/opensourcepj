package practice;

public class example4_3 {

	public static void main(String[] args) {
		Circle_2 pizza = new Circle_2(10, "자바피자"); // Circle_2 객체 생성, 반지름 10,이름 자바피자
		double area = pizza.getArea(); //생성 객체(pizza)의 면적 계산
		System.out.println(pizza.name + "의 면적은 " + area); //결과 출력
		Circle_2 donut = new Circle_2(); // Circle_2 객체 생성, 반지름 1(기본값)
		donut.name = "도넛피자"; //Circle_2 객체(도넛)의 필드(이름) 설정
		area = donut.getArea(); //생성 객체(donut)의 면적 계산
		System.out.println(donut.name + "의 면적은 " + area); //결과 출력
	}

}
