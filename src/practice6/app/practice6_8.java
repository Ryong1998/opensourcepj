package practice6.app;
import java.util.Scanner;
public class practice6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String str = sc.nextLine();
		for(int i = 1; i <= str.length() ;i++) {
			System.out.print(str.substring(i)); //i=1�ε��� ���� ������ ���
			System.out.println(str.substring(0, i)); //i=0 �ε��� ���� ������ ��½����ϱ� �� �ε������� ���
		}
		sc.close();
	}

}
