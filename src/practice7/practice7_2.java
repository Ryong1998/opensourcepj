package practice7;
import java.util.ArrayList;
import java.util.Scanner;

public class practice7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> stack = new ArrayList<Character>(); //String일 경우, 학점이 문자 한개여서 오류가 난다
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개의 학점은 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0;i<6;i++) {
			char score=scanner.next().charAt(0); //문자 1개씩 입력받음 .charAt()은 String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
			stack.add(score); //stack에 입력받은 문자 1개 씩 추가
		}
		int sum=0;
		for(int i=0;i<stack.size();i++) { //추가한 문자 개수만큼 반복
			char score = stack.get(i); //stack의 i 인덱스를 가진 value를 score에 할당
			switch(score) { //score의 값에 따라 switch 구문 실행
			case 'A':
				sum+=4;
				break;
			case 'B':
				sum+=3;
				break;
			case 'C':
				sum+=2;
				break;
			case 'D':
				sum+=1;
				break;
			case 'F':
				sum+=0;
				break;
			}
		}
		double average=(double)sum/stack.size(); //전체 점수의 합을 입력받은 문자의 개수만큼 나누면 평균이 구해진다
		System.out.println(average);
		scanner.close();
	}

}
