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
		num3=(int)((Math.random()*3)+1); //�������� ���� 3�� ����
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1==num2 && num2==num3) //���� 3���� ������ true ��ȯ
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
		System.out.print("1��° ���� �̸�>>");
		String name = scanner.nextLine();
		Person6_10 person1 = new Person6_10(name); //ù��° ���� �̸� �Է¹޾Ƽ� ��ü ����
		System.out.print("2��° ���� �̸�>>");
		name =scanner.nextLine();
		Person6_10 person2 = new Person6_10(name); //�ι�° ���� �̸� �Է¹޾Ƽ� ��ü ����
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = scanner.nextLine(); //buffer�� ���ؼ� ���� �ڵ尡 �ٷ� �������� �ʰ� �Է��� �ƹ��ų� �޾ƾ� ���� �ڵ�� �Ѿ
			if(person1.game()) {//game�� �������� 3�� �� ���� �̰���� �˷��ִ� �޼ҵ�, true�̸� 3������ ���� ��
				System.out.println(person1.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = scanner.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"���� �̰���ϴ�!");
				break;
			}
			System.out.println("�ƽ�����!");
		}
		scanner.close();
	}

}
