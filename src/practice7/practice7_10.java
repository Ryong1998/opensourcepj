package practice7;
import java.util.Scanner;
import java.util.Vector;

abstract class Shape7_10 {
	private Shape7_10 
		next;
	public Shape7_10() { 
		next = null; 
	}
	public abstract void draw();
}

class Line7_10 extends Shape7_10 {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect7_10 extends Shape7_10 {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle7_10 extends Shape7_10 {
	public void draw() {
		System.out.println("Circle");
	}
}

public class practice7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Shape7_10> v = new Vector<Shape7_10>(); //Shape7_10�� �Է¹޴� Vector v�� ����
		Shape7_10 shape = null;
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1://������ ������ ���
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1://Line�� ����
					shape = new Line7_10();
					break;
				case 2://Rect�� ����
					shape = new Rect7_10();
					break;
				case 3://Circle�� ����
					shape = new Circle7_10();
					break;
				}
				v.add(shape); //v�� shape�� �߰�
				break;
			case 2://������ ������ ���
				System.out.print("������ ������ ��ġ >> " );
				int position = sc.nextInt(); //position�� �ε���
				if(v.size() == 0 || v.size() <= position)//v�� �� ���̰ų� �Է¹��� ��ġ�� v�� ũ�⺸�� ū���
					System.out.println("������ �� �����ϴ�.");
				else 
					v.remove(position);//�ش� �ε����� �ش��ϴ� ���� ����
				break;
			case 3: //��� ���⸦ ������ ���
				for(int i=0; i<v.size(); i++) //v�� ũ�⸸ŭ
					v.get(i).draw(); //���� ���
				break;
			case 4://���Ḧ ������ ���
				System.out.println("beauty�� �����մϴ�.");
				sc.close();
				return;
			}
		}
	}
}
