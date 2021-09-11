package practice;
import java.util.Scanner;
public class quiz_12_2 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산: ");
		int number1 = scanner.nextInt();
		var op = scanner.next();
		int number2 = scanner.nextInt();
		int result=0;
		int answer=0;
		switch(op) {
			case "*":
				result=number1*number2;
				break;
			case "/":
				if (number2==0) {
					System.out.println("0으로 나눌 수 없다");
					answer++;
					break;
				}
				else
					result=number1/number2;
				  	break;
			case "+":
				result=number1+number2;
				break;
			case "-":
				result=number1-number2;
				break;
			default:
				System.out.println("잘못된 값 입력");
				break;
		}
		if (answer==0)
			System.out.println(number1+op+number2+"의 계산 결과는 "+ result);
		scanner.close();

	}


}
