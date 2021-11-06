package practice8;
import java.io.*;

public class practice8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\LG\\eclipse-workspace\\practice");
		File[] subfiles = f.listFiles(); //해당 경로에 있는 파일들을 리스트 타입으로 저장
		File max_f = null;
		
		for(int i=0;i<subfiles.length;i++) { //length는 파일의 크기를 나타냄
			if(i==0)
				max_f = subfiles[i];
			if(max_f.length()<subfiles[i].length())
				max_f=subfiles[i];
		}
		System.out.print("가장 큰 파일은 "+max_f.getPath()+" "+max_f.length()+"바이트");

	}

}
