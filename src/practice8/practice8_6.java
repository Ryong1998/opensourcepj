package practice8;

import java.io.*;
import java.util.Scanner;
 

public class practice8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String n1 = scanner.nextLine(); //n1�� ���� �̸� �Է� ����
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String n2 = scanner.nextLine(); //n2�� �����̸� �Է¹���
		
		int c;
		try {
			//���ϸ��� n1�� ������ ����, FileReader�� ���� ��� ���� ���뿡 �ѱ��� ���� ��� �ѱ��� ������ ���ڵ��� ������ �� �ִ� BufferedReader�� ���
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(n1), "utf-8")); 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("appended.txt"), "utf-8"));
			while((c= br.read())!=-1) {
				bw.write((char)c); //n1�� ������� appended.txt���Ͽ� �߰�
			}
			br.close();
			bw.write("\n");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(n2), "utf-8"));
			while((c=br2.read())!=-1) {
				bw.write((char)c);//n2�� ������� appended.txt���Ͽ� �߰�
			}
			br2.close();
			bw.close();
			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����Ͽ����ϴ�");
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}

}
