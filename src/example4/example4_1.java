package example4;

public class example4_1 {

	public static void main(String[] args) {
		Circle_1 pizza; //레퍼런스 변수 선언
		pizza = new Circle_1(); // new를 이용해서 Circle_1 객체 생성(pizza)
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area); //결과 출력
		Circle_1 donut = new Circle_1(); // new를 이용해서 Circle_1 객체 생성(donut)
		donut.radius = 2; // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; // 도넛의 이름 설정
		area = donut.getArea(); // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area); //결과 출력
	}

}
