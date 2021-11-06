package practice8;

import java.io.*;
import java.util.*;

public class practice8_12 {
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>(); //lineVector는 파일내의 내용들을 한 줄씩 읽어서 저장한 벡터
	
	public practice8_12() { }
	
	private void readFile(String fileName) {
		targetFile = new File(fileName);
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			while(fScanner.hasNext()) { // 파일을 라인 단위로 모두 읽기
				String line = fScanner.nextLine(); // 한 라인 읽고
				lineVector.add(line); // 한 라인을 벡터에 저장
			}			
			fScanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Vector<Integer> searchWord(String word) { // word가 포함된 라인 번호들을 벡터로 리턴
		Vector<Integer> noVector = new Vector<Integer>();
		for(int i=0; i<lineVector.size(); i++) { //lineVector size만큼(검색할 파일에 모든 줄들을) 실행
			String line = lineVector.get(i); //lineVector의 한 줄씩의 내용을 line에 저장
			if(line.indexOf(word) != -1)  //line에 입력받은 word가 있으면
				noVector.add(i); //noVector 에 i를 추가
		}
		return noVector; //noVector 반환
	}

	private void printLines(Vector<Integer> noVector) {
		for(int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i); //noVector에 저장되어 있는 값들은 word를 가지고 있는 행의 위치다
			String line = lineVector.get(lineNo);//index가 lineNo인 lineVector은  대상 파일에 해당 행을 전부 반환 해준다
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();

		readFile(fileName); // 파일을 라인 단위로 벡터로 읽어들임
		
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String word = scanner.nextLine();
			if(word.equals("그만"))
				break; // 프로그램 종료
			Vector<Integer> noVector = searchWord(word); 
			printLines(noVector);
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void main(String[] args) {
		practice8_12 ws = new practice8_12();
		ws.run();
	}
}
