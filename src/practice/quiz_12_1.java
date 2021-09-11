package practice;
import java.util.Scanner;
public class quiz_12_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산: ");
		int number1 = scanner.nextInt();
		var op = scanner.next();
		int number2 = scanner.nextInt();
		int result=0;
		int answer=0;
		if(op.equals("*")) // 문자열이 각 연산자와 같은지 확인하기 위해서 equals사용
			result = number1*number2;
		else if(op.equals("/")) {
			if (number2 == 0) {
				System.out.println("0으로 나눌 수 없음");
				answer++;
			}
			else 
				result = number1/number2;
		}
		else if(op.equals("+"))
			result = number1+number2;
		else if(op.equals("-"))
			result = number1-number2;
		else
			System.out.println("잘못입력");
		if (answer==0)
				System.out.println(number1+op+number2+"의 계산 결과는 "+ result);
		scanner.close();

	}

}
