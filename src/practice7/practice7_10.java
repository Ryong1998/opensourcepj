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
		Vector<Shape7_10> v = new Vector<Shape7_10>(); //Shape7_10을 입력받는 Vector v를 선언
		Shape7_10 shape = null;
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1://삽입을 선택한 경우
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1://Line을 생성
					shape = new Line7_10();
					break;
				case 2://Rect을 생성
					shape = new Rect7_10();
					break;
				case 3://Circle을 생성
					shape = new Circle7_10();
					break;
				}
				v.add(shape); //v에 shape를 추가
				break;
			case 2://삭제를 선택한 경우
				System.out.print("삭제할 도형의 위치 >> " );
				int position = sc.nextInt(); //position은 인덱스
				if(v.size() == 0 || v.size() <= position)//v가 빈 값이거나 입력받은 위치가 v의 크기보다 큰경우
					System.out.println("삭제할 수 없습니다.");
				else 
					v.remove(position);//해당 인덱스에 해당하는 값을 삭제
				break;
			case 3: //모두 보기를 선택한 경우
				for(int i=0; i<v.size(); i++) //v에 크기만큼
					v.get(i).draw(); //정보 출력
				break;
			case 4://종료를 선택한 경우
				System.out.println("beauty을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
