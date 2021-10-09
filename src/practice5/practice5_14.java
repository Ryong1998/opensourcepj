package practice5;

interface Shape5 {
   final double PI = 3.14; // ���
   void draw(); // ������ �׸��� �߻� �޼ҵ�,�ڽ� Ŭ������ ���� ����ٸ�
   double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�, �ڽ� Ŭ������ ���� ����ٸ�
   default public void redraw() { // ����Ʈ �޼ҵ�
      System.out.print("--- �ٽ� �׸��ϴ�.");//1. �ش� ���� �����
      draw(); //1. �� �ڽ� Ŭ������ ��üȭ�� �߻� �޼ҵ� ����
   }
}

class Circle5 implements Shape5 {
   private int radius;
   public Circle5(int radius) {
      this.radius = radius;
   }
   public void draw() {
      System.out.println("�������� "+radius+"�� ���Դϴ�.");
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
      System.out.println(a+"x"+b+"�� �����ϴ� Ÿ���Դϴ�.");
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
      System.out.println(a+"x"+b+"ũ���� �簢�� �Դϴ�.");
   }
   public double getArea() {
      return a*b;
   }
}
	
public class practice5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape5[] list = new Shape5[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		 list[0] = new Circle5(10); // �������� 10�� �� ��ü
		 list[1] = new Oval5(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		 list[2] = new Rect5(10, 40); // 10x40 ũ���� �簢��
		 for(int i=0; i<list.length; i++) 
			 list[i].redraw(); //1�� �ּ����� �̵�
		 for(int i=0; i<list.length; i++) 
			 System.out.println("������ "+ list[i].getArea());
	}

}
