package practice;
import java.util.Scanner;
public class quiz_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ���� �Է�: ");
		int number = scanner.nextInt();
		if(number/10==3 || number/10==6 || number/10==9) //���� �ڸ� ���ڰ� 3 6 9 �� ��쿡��
			if(number%10==3 || number%10==6 || number%10==9) // ���� �ڸ� ���� 3 6 9 �� �ڼ�¦¦
				System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�¦"); // �ƴϸ� ���� �ڸ��� 3 6 9 �� ���̴� �ڼ�¦
		else if(number%10==3 || number%10==6 || number%10==9) //���� �ڸ��� 3 6 9 �� �ƴ����� �����ڸ��� 3 6 9 �ΰ��
			System.out.println("�ڼ�¦");
		
		else
			System.out.println("�ڼ�����");
		scanner.close();

	}

}
