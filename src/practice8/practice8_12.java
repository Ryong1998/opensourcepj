package practice8;

import java.io.*;
import java.util.*;

public class practice8_12 {
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>(); //lineVector�� ���ϳ��� ������� �� �پ� �о ������ ����
	
	public practice8_12() { }
	
	private void readFile(String fileName) {
		targetFile = new File(fileName);
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			while(fScanner.hasNext()) { // ������ ���� ������ ��� �б�
				String line = fScanner.nextLine(); // �� ���� �а�
				lineVector.add(line); // �� ������ ���Ϳ� ����
			}			
			fScanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Vector<Integer> searchWord(String word) { // word�� ���Ե� ���� ��ȣ���� ���ͷ� ����
		Vector<Integer> noVector = new Vector<Integer>();
		for(int i=0; i<lineVector.size(); i++) { //lineVector size��ŭ(�˻��� ���Ͽ� ��� �ٵ���) ����
			String line = lineVector.get(i); //lineVector�� �� �پ��� ������ line�� ����
			if(line.indexOf(word) != -1)  //line�� �Է¹��� word�� ������
				noVector.add(i); //noVector �� i�� �߰�
		}
		return noVector; //noVector ��ȯ
	}

	private void printLines(Vector<Integer> noVector) {
		for(int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i); //noVector�� ����Ǿ� �ִ� ������ word�� ������ �ִ� ���� ��ġ��
			String line = lineVector.get(lineNo);//index�� lineNo�� lineVector��  ��� ���Ͽ� �ش� ���� ���� ��ȯ ���ش�
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();

		readFile(fileName); // ������ ���� ������ ���ͷ� �о����
		
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String word = scanner.nextLine();
			if(word.equals("�׸�"))
				break; // ���α׷� ����
			Vector<Integer> noVector = searchWord(word); 
			printLines(noVector);
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		practice8_12 ws = new practice8_12();
		ws.run();
	}
}
