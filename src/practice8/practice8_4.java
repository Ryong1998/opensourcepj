package practice8;

import java.io.*;
import java.util.Scanner;

public class practice8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
		try {
			// ���Ϸκ��� �б� ���� ����, FileReader�� �ѱ��� �ȵǴ� ��..
			Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini")); 
			int lineNumber = 1;
			while(fScanner.hasNext()) { // ���Ͽ� ���� ���� �ִ� ���� 
				String line = fScanner.nextLine();
				System.out.printf("%4d", lineNumber++); // ��ȣ ���
				System.out.println(": "+line); // �ҽ� ���� ���
			}
			fScanner.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}

	}

}