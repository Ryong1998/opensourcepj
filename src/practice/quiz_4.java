package practice;
import java.util.Scanner;

public class quiz_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		if((number1<number2&&number2<number3)||(number3<number2&&number2<number1)) //두번째 입력 받은 값이 중간 값인 경우
			System.out.println("중간 값은 "+number2);
		else if((number2<number1&&number1<number3)||(number3<number1&&number1<number2))//첫번째 입력 받은 값이 중간 값인 경우
			System.out.println("중간 값은 "+number1);
		else //위 두가지가 아니면 세번 째 입력 받은 값이 중간 값인 경우다
			System.out.println("중간 값은 "+number3);
		scanner.close();
		
	}
}
