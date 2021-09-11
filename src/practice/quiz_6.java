package practice;
import java.util.Scanner;
public class quiz_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수 입력: ");
		int number = scanner.nextInt();
		if(number/10==3 || number/10==6 || number/10==9) //십의 자리 숫자가 3 6 9 인 경우에서
			if(number%10==3 || number%10==6 || number%10==9) // 일의 자리 까지 3 6 9 면 박수짝짝
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝"); // 아니면 십의 자리만 3 6 9 인 것이니 박수짝
		else if(number%10==3 || number%10==6 || number%10==9) //십의 자리는 3 6 9 가 아니지만 일의자리가 3 6 9 인경우
			System.out.println("박수짝");
		
		else
			System.out.println("박수없음");
		scanner.close();

	}

}
