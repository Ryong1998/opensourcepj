package practice6.app;
import java.util.Scanner;
class Person6_10{
	private int num1,num2,num3;
	public String name;
	public Person6_10(String name) {
		this.name=name;
	}
	public boolean game() {
		num1=(int)((Math.random()*3)+1);
		num2=(int)((Math.random()*3)+1);
		num3=(int)((Math.random()*3)+1); //랜덤으로 숫자 3개 생성
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1==num2 && num2==num3) //숫자 3개가 같으면 true 반환
			return true;
		else
			return false;
	}
}
public class practice6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffer;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = scanner.nextLine();
		Person6_10 person1 = new Person6_10(name); //첫번째 선수 이름 입력받아서 객체 생성
		System.out.print("2번째 선수 이름>>");
		name =scanner.nextLine();
		Person6_10 person2 = new Person6_10(name); //두번째 선수 이름 입력받아서 객체 생성
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = scanner.nextLine(); //buffer를 통해서 다음 코드가 바로 실행하지 않고 입력을 아무거나 받아야 다음 코드로 넘어감
			if(person1.game()) {//game은 랜던으로 3개 수 만들어서 이겼는지 알려주는 메소드, true이면 3개수가 같은 것
				System.out.println(person1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		scanner.close();
	}

}
