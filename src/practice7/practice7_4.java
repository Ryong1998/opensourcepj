package practice7;
import java.util.Vector;


import java.util.Scanner;

public class practice7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> stack = new Vector<Integer>(); //Integer Ÿ���� ���� stack ����
		Scanner scanner = new Scanner(System.in);
		while(true) { //0�� �Է¹��� �� ���� ���� �ݺ�
			System.out.print("������ �Է�(0�Է½� ����)>>");
			int average=0;
			int sum=0;
			int rain=scanner.nextInt(); //�Է¹��� �������� rain ������ �Ҵ�
			if(rain==0) //�Է¹��� ���� 0�̸�
				break; //���� ���� Ż��
			
			stack.add(rain); //�Է¹��� �������� stack�� �߰�
			for(int i=0;i<stack.size();i++) {//stack�� �ִ� ���� ��ŭ
				System.out.print(stack.get(i)+" ");//stack�� �ִ� value���� ����ϰ�
				sum+=stack.get(i);//�հ迡 value���� �߰�
			}
			
			System.out.println();
			average=(sum/stack.size());//�հ踦 stack�� �ִ� value���� ������ ����� ����� ���Ѵ�
			System.out.println("������� : "+average);
			
		}
		scanner.close();
	}

}
