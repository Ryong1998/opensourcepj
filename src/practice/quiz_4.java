package practice;
import java.util.Scanner;

public class quiz_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� 3�� �Է�: ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		if((number1<number2&&number2<number3)||(number3<number2&&number2<number1)) //�ι�° �Է� ���� ���� �߰� ���� ���
			System.out.println("�߰� ���� "+number2);
		else if((number2<number1&&number1<number3)||(number3<number1&&number1<number2))//ù��° �Է� ���� ���� �߰� ���� ���
			System.out.println("�߰� ���� "+number1);
		else //�� �ΰ����� �ƴϸ� ���� ° �Է� ���� ���� �߰� ���� ����
			System.out.println("�߰� ���� "+number3);
		scanner.close();
		
	}
}
