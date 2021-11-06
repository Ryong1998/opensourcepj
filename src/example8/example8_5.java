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
			fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
		} 
		catch(IOException e) {
			System.out.println( "C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out에 저장할 수 없었습니다. 경로명을 확인해 주세요");
			return;
		}
		System.out.println("C:\\\\Users\\\\LG\\\\eclipse-workspace\\\\practice\\\\test8_5.out을 저장하였습니다.");
	}

}
