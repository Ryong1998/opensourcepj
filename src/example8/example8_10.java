package example8;
import java.io.*;

public class example8_10 {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("C:\\Users\\LG\\eclipse-workspace\\practice\\copyimg8_10.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} 
		catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
