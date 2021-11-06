package practice8;
import java.io.*;
import java.util.*;

public class practice8_10 {
	
	private String fileName = "C:\\Users\\LG\\eclipse-workspace\\practice\\phone8_10.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();
	
	private void readPhoneFile() {
		try {
			String line;
		    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
		    while ((line = reader.readLine()) != null){
		        String[] parts = line.split(" ", 2); //���Ͽ��� ������    �̸� ��ȭ��ȣ   �������� ������ �Ǿ� �־ �̸��� ��ȭ��ȣ ���̿� ������ �������� Ű�� ������ ����
		        if (parts.length == 2){ //�̸��� ��ȭ��ȣ�� ���� �� ���� �����Ǿ� ���� ��
		            String key = parts[0]; //���� �κ��� [0]�� key������
		            String value = parts[1]; //���� �κΈ� [1]�� value������
		            phoneMap.put(key, value); //HashMap�� phoneMap�� ���� �߰�
		        } 
		        else {
		            System.out.println("�߸��� �Է�: " + line);
		        }
		    }			
		    reader.close();
			System.out.println(phoneMap.keySet()); //Ŷ���� ����� ���� Ȯ�ο�
		} 
		
		catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}
		
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�."); //��� ��ȭ��ȣ�� �о����� Ȯ��
		
	}
	
	private void processQuery() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�̸�>> ");
			String name = scanner.next(); // �̸� �Է�
			if(name.equals("�׸�")) //�׸��� �Է� ������ ����
				break;
			String tel = phoneMap.get(name); //phoneMape���� key�� name�� value�� ���� tel�� �Ҵ�
			if(tel == null) { //tel�� null �̸�(name�� key���� ���� ��)
				System.out.println("ã�� �̸��� �����ϴ�.");			
			}
			else{
				System.out.println(tel);
			}
		}

		scanner.close();
	}
	
	public void run() {
		readPhoneFile(); //HashMap�� phoneMap ������Ʈ
		processQuery(); //���� �Է¹ް� �Է¹��� ���� ��Ī�Ǵ� ��ȭ��ȣ ���
	}
	
	public static void main(String[] args) {
		practice8_10 phoneExplorer = new practice8_10();
		phoneExplorer.run();
	}

}
