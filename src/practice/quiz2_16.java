package practice;
import java.util.Scanner;
public class quiz2_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위","바위","보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		while(true) {
			System.out.print("가위 바위 보 >> ");
			String person_state = scanner.next();
			if(person_state.equals("그만")) {
				System.out.println("게임을 종료합니다");
				break;
			}
			int com_state_int = (int)(Math.random()*3);
			
			if(person_state.equals("가위")) {
				if(com_state_int==0) {
					System.out.println("비겼습니다");
				}
				else if(com_state_int==1) {
					System.out.println("사용자가 졌습니다");					
				}
				else{
					System.out.println("사용자가 이겼습니다");					
				}
			}
			else if(person_state.equals("바위")) {
				if(com_state_int==0) {
					System.out.println("사용자가 이겼습니다");					
				}
				else if(com_state_int==1) {
					System.out.println("비겼습니다");					
				}
				else{
					System.out.println("사용자가 졌습니다");				
				}			
			}
			else if(person_state.equals("보")) {
				if(com_state_int==0) {
					System.out.println("사용자가 졌습니다");					
				}
				else if(com_state_int==1) {
					System.out.println("사용자가 이겼습니다");				
				}
				else{
					System.out.println("비겼습니다");				
				}
			}
			else {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			System.out.println("사용자 : "+person_state+" 컴퓨터 : "+str[com_state_int]);
		}
		
		
		
		
		scanner.close();


	}

}
