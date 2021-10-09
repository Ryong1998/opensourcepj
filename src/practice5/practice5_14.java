package practice5;

interface Shape5 {
   final double PI = 3.14; // 상수
   void draw(); // 도형을 그리는 추상 메소드,자식 클래스들 마다 내용다름
   double getArea(); // 도형의 면적을 리턴하는 추상 메소드, 자식 클래스들 마다 내용다름
   default public void redraw() { // 디폴트 메소드
      System.out.print("--- 다시 그립니다.");//1. 해당 문구 출력후
      draw(); //1. 각 자식 클래스에 구체화된 추상 메소드 참조
   }
}

class Circle5 implements Shape5 {
   private int radius;
   public Circle5(int radius) {
      this.radius = radius;
   }
   public void draw() {
      System.out.println("반지름이 "+radius+"인 원입니다.");
   }
   public double getArea() {
      return PI*radius*radius;
   }
}

class Oval5 implements Shape5 {
   private int a, b;
   public Oval5(int a, int b) {
      this.a  = a;
      this.b = b;
   }
   public void draw() {
      System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
   }
   public double getArea() {
      return PI*a*b;
   }
}

class Rect5 implements Shape5 {
   private int a, b;
   public Rect5(int a, int b) {
      this.a  = a;
      this.b = b;
   }
   public void draw() {
      System.out.println(a+"x"+b+"크기의 사각형 입니다.");
   }
   public double getArea() {
      return a*b;
   }
}
	
public class practice5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape5[] list = new Shape5[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		 list[0] = new Circle5(10); // 반지름이 10인 원 객체
		 list[1] = new Oval5(20, 30); // 20x30 사각형에 내접하는 타원
		 list[2] = new Rect5(10, 40); // 10x40 크기의 사각형
		 for(int i=0; i<list.length; i++) 
			 list[i].redraw(); //1번 주석으로 이동
		 for(int i=0; i<list.length; i++) 
			 System.out.println("면적은 "+ list[i].getArea());
	}

}
