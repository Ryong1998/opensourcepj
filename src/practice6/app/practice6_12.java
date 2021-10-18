package practice6.app;
import java.util.Scanner;
public class practice6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = sc.nextInt();
		Person6_10[] person = new Person6_10[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name = sc.next();
			person[i] = new Person6_10(name);
		}
		String buffer = sc.nextLine(); //3번째 선수 이름을 적고 enter를 누를 때 공백이 buffer 할당된다
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(person[i].game()) {
					System.out.println(person[i].name+"님이 이겼습니다!");
					sc.close();
					return;
				}
				System.out.println("아쉽군요!");
			}
		}
	}

}
