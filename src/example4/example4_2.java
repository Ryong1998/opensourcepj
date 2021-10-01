package example4;
import java.util.Scanner;
public class example4_2 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in); //값을 입력받음
		System.out.print(">> ");
		rect.width = scanner.nextInt(); //생성된 객체의 필드(너비)로 입력받음
		rect.height = scanner.nextInt(); //생성된 객체의 필드(높이) 로 입력 받음
		System.out.println("사각형의 면적은 " + rect.getArea()); //생성된 객체의 메소드반환값 출력
		scanner.close();
	}
}
