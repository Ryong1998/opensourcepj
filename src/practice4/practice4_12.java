package practice4;
import java.util.Scanner;

class Seat { // 좌석 관리
	private String seat[];
	
	public Seat() { // 좌석 생성자
		seat = new String[10]; //10개의 좌석
		for(int i=0; i<seat.length; i++) {
			seat[i] = "___"; //처음에 S,A,B 에서의 각 10자리들을 모두 초기화
		}
	}
	
	public void Show() { // 좌석 상태 출력
		for(int i=0; i<seat.length; i++) { //입력받은 S,A,B 중에서 한개의 10자리를 모두 출력
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void Set(String name, int num) { // 예매된 좌석 정보 처리
		seat[num-1] = name; //입력받은 순서와, 이름을 해당 자리에 업데이트
	}
	
	public boolean reSet(String name) { // 좌석 취소 정보 확인 후, 처리
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) { //입력 받은 이름이 존재하면, 빈칸으로 바꾸고 바꿨으니 true 반환
				seat[i] = "___";
				return true;
			}
		}
		return false;
	}
}

class Reservation {
	Scanner sc = new Scanner(System.in);
	private Seat s[]; // 세개의 등급 당 좌석 생성
	private String seatGrade[] = {"S", "A", "B"}; // 좌석 등급별 이름
	
	public Reservation() { //예약 생성자
		s  = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat(); //Seat 클래스 생성하여서 처음 자리 초기화도 실행
		}
	}
	
	public void Reserve() { //예약
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("번호>>");
		int num = sc.nextInt();
		s[grade-1].Set(name, num);
	}
	
	public void Check() { //조회
		for(int i=0; i<s.length; i++ ) {
			System.out.print(seatGrade[i]+">>");
			s[i].Show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void Cancel() {//취소
		System.out.print("좌석 S:1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("이름>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reSet(name); //취소를 했으면(빈칸으로 바꿧으면) true 반환
		if(result==true)
			System.out.println("<<<취소를 완료하였습니다.>>>");
		else
			System.out.println("존재하지 않는 정보입니다.");
	}
	
	public void Run() {
		int option;
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				Reserve();
				break;
			case 2:
				Check();
				break;
			case 3:
				Cancel();
				break;
			case 4:
				sc.close();
				return;
			}
		}
	}
}

public class practice4_12 {
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Reservation r = new Reservation();
		r.Run();
	}
}

