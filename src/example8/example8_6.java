package example8;
import java.io.*;

public class example8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte [6]; // ��� �ִ� byte �迭
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\LG\\eclipse-workspace\\practice\\test8_5.out");
			int n=0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c; 
				n++;
			}
			System.out.println("\"C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out\"t���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} 
		catch(IOException e) {
			System.out.println( "\"C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out\"���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}

	}

}
