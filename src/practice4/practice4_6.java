package practice4;
import java.util.Scanner;
class Circle{
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) { // x, y, radius �ʱ�ȭ
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public int area() {
		return this.radius;
	}
}

public class practice4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3���� Circle �迭 ����
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble(); // x �� �б�
		    double y = scanner.nextDouble(); // y �� �б�
		    int radius = scanner.nextInt(); // ������ �б�
		    c[i] = new Circle(x, y, radius); // Circle ��ü ����
		}
		int max_index=0;
		for(int i=1; i<c.length; i++)
			if(c[i].area()>c[max_index].area()) {
				max_index=i;
			}
		c[max_index].show();
		scanner.close();
	}

}
