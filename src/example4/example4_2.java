package example4;
import java.util.Scanner;
public class example4_2 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scanner = new Scanner(System.in); //���� �Է¹���
		System.out.print(">> ");
		rect.width = scanner.nextInt(); //������ ��ü�� �ʵ�(�ʺ�)�� �Է¹���
		rect.height = scanner.nextInt(); //������ ��ü�� �ʵ�(����) �� �Է� ����
		System.out.println("�簢���� ������ " + rect.getArea()); //������ ��ü�� �޼ҵ��ȯ�� ���
		scanner.close();
	}
}
