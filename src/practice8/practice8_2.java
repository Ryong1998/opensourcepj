package practice8;
import java.io.*;

public class practice8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\LG\\eclipse-workspace\\practice\\phone8_2.txt");
			in = new InputStreamReader(fin, "UTF-8");  
			int c;
			System.out.println("C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\phone8_2.txt �� ����մϴ� "); //phone8_2.txt ���Ͽ� ����
			while ((c = in.read()) != -1) { //�� ���ھ� ���� ������ �б�
				System.out.print((char)c);//���
			}
			in.close();
			fin.close();
		} 
		catch (IOException e) {
			System.out.println("����� ����");
		}


	}

}
