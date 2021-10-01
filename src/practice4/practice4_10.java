package practice4;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) { 
		for(int i=0;i<kor.length;i++) {
			if (kor[i].equals(word)){
				return eng[i];
			}	
		}
		return null;
	}
}

public class practice4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String comment;
		String result;
		System.out.println("한영 단어 검색 프로그램 입니다");
		while(true) {
			System.out.print("검색할 이름>> ");
			comment = scanner.next();
			if(comment.equals("그만")) {
				break;
			}
			result = Dictionary.kor2Eng(comment);
			if(result==null) {
				System.out.println(comment+"는 사전에 없습니다");
			}
			else {
				System.out.println(comment+"는 "+result);
			}
			
		}
		System.out.println("종료");
		scanner.close();
	}

}
