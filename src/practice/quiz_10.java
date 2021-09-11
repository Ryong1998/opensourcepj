package practice;
import java.util.Scanner;
import java.lang.Math; //제곱근을 구하기 위해서 math 라이브러리 활용
public class quiz_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		double distance=0;
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); //두 원 중심의 거리를 구함
		if (distance>r1+r2) // 중심사이의 거리가 두 반지름의 합보다 크면 안겹침
			System.out.println("안겹침");
		else // 중심사이의 거리가 두 반지름의 합보다 작으면 겹침
			System.out.println("겹침");
			
		System.out.println(distance);
		System.out.println(r1+r2);
		scanner.close();

	}

}
