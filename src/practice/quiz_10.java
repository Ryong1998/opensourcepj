package practice;
import java.util.Scanner;
import java.lang.Math; //�������� ���ϱ� ���ؼ� math ���̺귯�� Ȱ��
public class quiz_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		double distance=0;
		distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); //�� �� �߽��� �Ÿ��� ����
		if (distance>r1+r2) // �߽ɻ����� �Ÿ��� �� �������� �պ��� ũ�� �Ȱ�ħ
			System.out.println("�Ȱ�ħ");
		else // �߽ɻ����� �Ÿ��� �� �������� �պ��� ������ ��ħ
			System.out.println("��ħ");
			
		System.out.println(distance);
		System.out.println(r1+r2);
		scanner.close();

	}

}
