package example8;
import java.io.*;
import java.util.Scanner;

public class example8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\LG\\eclipse-workspace\\practice\\test8_7.txt");
			BufferedOutputStream out = new 
			BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) { 
				out.write(c);
			}
			// ���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine(); 
			out.flush(); // ���ۿ� ���� �ִ� ���� ��� ���
			fin.close();
			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}


	}

}