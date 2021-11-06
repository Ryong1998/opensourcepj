package practice8;

import java.io.*;
import java.util.Scanner;
 

public class practice8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다");
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String n1 = scanner.nextLine(); //n1에 파일 이름 입력 받음
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String n2 = scanner.nextLine(); //n2에 파일이름 입력받음
		
		int c;
		try {
			//파일명이 n1인 파일을 읽음, FileReader를 쓰는 경우 파일 내용에 한글이 있을 경우 한글이 깨져서 인코딩을 설정할 수 있는 BufferedReader를 사용
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(n1), "utf-8")); 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("appended.txt"), "utf-8"));
			while((c= br.read())!=-1) {
				bw.write((char)c); //n1의 내용들을 appended.txt파일에 추가
			}
			br.close();
			bw.write("\n");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(n2), "utf-8"));
			while((c=br2.read())!=-1) {
				bw.write((char)c);//n2의 내용들을 appended.txt파일에 추가
			}
			br2.close();
			bw.close();
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}
