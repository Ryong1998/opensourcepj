package practice6.app;
import java.util.Scanner;
public class practice6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String str = sc.nextLine();
		for(int i = 1; i <= str.length() ;i++) {
			System.out.print(str.substring(i)); //i=1인덱스 부터 끝까지 출력
			System.out.println(str.substring(0, i)); //i=0 인덱스 부터 위에서 출력시작하기 전 인덱스까지 출력
		}
		sc.close();
	}

}
