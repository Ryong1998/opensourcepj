package practice8;
import java.io.*;

public class practice8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\LG\\eclipse-workspace\\practice");
		File[] subfiles = f.listFiles(); //�ش� ��ο� �ִ� ���ϵ��� ����Ʈ Ÿ������ ����
		File max_f = null;
		
		for(int i=0;i<subfiles.length;i++) { //length�� ������ ũ�⸦ ��Ÿ��
			if(i==0)
				max_f = subfiles[i];
			if(max_f.length()<subfiles[i].length())
				max_f=subfiles[i];
		}
		System.out.print("���� ū ������ "+max_f.getPath()+" "+max_f.length()+"����Ʈ");

	}

}
