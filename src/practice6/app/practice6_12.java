package practice6.app;
import java.util.Scanner;
public class practice6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�׺� ���ӿ� ������ ���� ����>>");
		int num = sc.nextInt();
		Person6_10[] person = new Person6_10[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"��° ���� �̸�>>");
			String name = sc.next();
			person[i] = new Person6_10(name);
		}
		String buffer = sc.nextLine(); //3��° ���� �̸��� ���� enter�� ���� �� ������ buffer �Ҵ�ȴ�
		while(true) {
			for(int i=0; i<num; i++) {
				System.out.print("["+person[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(person[i].game()) {
					System.out.println(person[i].name+"���� �̰���ϴ�!");
					sc.close();
					return;
				}
				System.out.println("�ƽ�����!");
			}
		}
	}

}
