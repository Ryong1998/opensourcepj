package practice;
import java.util.Scanner;
public class quiz_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99): ");
		int number = scanner.nextInt();
		if (number/10 == number%10) //10���� ���� ��� �������� ��ġ�ϸ� 10�� �ڸ��� 1�� �ڸ� ��ġ�ϴ� ��
				System.out.print("yes 10�� �ڸ�, 1�� �ڸ� ��ġ");
		else
			System.out.print("no 10���ڸ� 1�� �ڸ� ��ġ ����");
		scanner.close();
	}

}
