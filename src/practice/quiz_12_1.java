package practice;
import java.util.Scanner;
public class quiz_12_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int number1 = scanner.nextInt();
		var op = scanner.next();
		int number2 = scanner.nextInt();
		int result=0;
		int answer=0;
		if(op.equals("*")) // ���ڿ��� �� �����ڿ� ������ Ȯ���ϱ� ���ؼ� equals���
			result = number1*number2;
		else if(op.equals("/")) {
			if (number2 == 0) {
				System.out.println("0���� ���� �� ����");
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
			System.out.println("�߸��Է�");
		if (answer==0)
				System.out.println(number1+op+number2+"�� ��� ����� "+ result);
		scanner.close();

	}

}
