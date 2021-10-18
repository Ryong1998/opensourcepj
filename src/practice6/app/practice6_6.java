package practice6.app;
import java.util.Scanner;
import java.util.Calendar;

class Person6_6 {
	Calendar now = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	private String name, buffer;
	private int sec1, sec2;
	
	public Person6_6(String name) {
		this.name = name;
	}
	
	public int game() { // 시작과 예상 후 키를 눌렀을 때 차이를 반환
		System.out.print(name+" 시작 <Enter>키  >>");
		sec1 = enter(); //enter는 enter 눌렀을 때 초를 반환하는 메소드
		System.out.print("10초 예상 후 <Enter>키  >>");
		sec2 = enter();
		if(sec1 < sec2) //일반적인 경우
			return sec2-sec1;
		else 
			return (60-sec1) + sec2; //sec1과 sec2사이에 분이 바뀐경우
	}
	
	public int enter() {
		buffer = sc.nextLine(); //엔터 입력 받으면 다음 코드로 넘어감, 없으면 다음에 나오는 코드가 바로 실행됨.. 
		now = Calendar.getInstance(); //현재 시간을 입력받음
		System.out.println("\t현재 초 시간 = "+ now.get(Calendar.SECOND));//현재 시간(초) 를 출력함
		return now.get(Calendar.SECOND); //출력한 현재시간(초)를 반환
		
	}
}
public class practice6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6_6 person1 = new Person6_6("황기태");
		Person6_6 person2 = new Person6_6("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1 = person1.game();
		int result2 = person2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10)) //절댓값을 이용해서 10과 차이가 적은 쪽이 이김
			System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 황기태");
		else
			System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 이재문");
	}

}
