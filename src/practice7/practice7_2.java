package practice7;
import java.util.ArrayList;
import java.util.Scanner;

public class practice7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> stack = new ArrayList<Character>(); //String�� ���, ������ ���� �Ѱ����� ������ ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		for(int i=0;i<6;i++) {
			char score=scanner.next().charAt(0); //���� 1���� �Է¹��� .charAt()�� String���� ����� ���ڿ� �߿��� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �༮
			stack.add(score); //stack�� �Է¹��� ���� 1�� �� �߰�
		}
		int sum=0;
		for(int i=0;i<stack.size();i++) { //�߰��� ���� ������ŭ �ݺ�
			char score = stack.get(i); //stack�� i �ε����� ���� value�� score�� �Ҵ�
			switch(score) { //score�� ���� ���� switch ���� ����
			case 'A':
				sum+=4;
				break;
			case 'B':
				sum+=3;
				break;
			case 'C':
				sum+=2;
				break;
			case 'D':
				sum+=1;
				break;
			case 'F':
				sum+=0;
				break;
			}
		}
		double average=(double)sum/stack.size(); //��ü ������ ���� �Է¹��� ������ ������ŭ ������ ����� ��������
		System.out.println(average);
		scanner.close();
	}

}
