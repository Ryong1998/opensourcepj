package example8;
import java.io.*;

public class example8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = 
			new FileOutputStream("C:\\Users\\LG\\eclipse-workspace\\practice\\test8_5.out");
			for(int i=0; i<b.length; i++)
			fout.write(b[i]); // �迭 b�� ���̳ʸ��� �״�� ���
			fout.close();
		} 
		catch(IOException e) {
			System.out.println( "C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out�� ������ �� �������ϴ�. ��θ��� Ȯ���� �ּ���");
			return;
		}
		System.out.println("C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out�� �����Ͽ����ϴ�.");
	}

}
