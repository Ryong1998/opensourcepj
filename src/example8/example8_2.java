package example8;
import java.io.*;

public class example8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\LG\\eclipse-workspace\\practice\\hangul8_2.txt");
			in = new InputStreamReader(fin, "UTF-8");  //"MS949"로 하면 안됨..
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} 
		catch (IOException e) {
			System.out.println("입출력 오류");
		}


	}

}
