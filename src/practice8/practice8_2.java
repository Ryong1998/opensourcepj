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
			System.out.println("C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\phone8_2.txt 을 출력합니다 "); //phone8_2.txt 파일에 접근
			while ((c = in.read()) != -1) { //한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);//출력
			}
			in.close();
			fin.close();
		} 
		catch (IOException e) {
			System.out.println("입출력 오류");
		}


	}

}
