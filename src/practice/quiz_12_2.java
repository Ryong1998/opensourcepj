package practice;
import java.util.Scanner;
public class quiz_12_2 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
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
					System.out.println("0���� ���� �� ����");
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
				System.out.println("�߸��� �� �Է�");
				break;
		}
		if (answer==0)
			System.out.println(number1+op+number2+"�� ��� ����� "+ result);
		scanner.close();

	}


}
