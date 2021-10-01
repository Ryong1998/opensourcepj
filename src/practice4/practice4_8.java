package practice4;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	public Phone(String name, String tel) { 
		this.name = name;
		this.tel = tel;
	}
	public String check_name() {
		return this.name;
	}
	public String check_tel() {
		return this.tel;
	}
	
}

public class practice4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int max;
		String comment;
		int count=0;
		System.out.print("�ο���>>");
		max = scanner.nextInt();
		Phone c[] = new Phone[max]; // 3���� Circle �迭 ����
		for(int i=0; i<max; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
		    String tel = scanner.next(); 
		    c[i] = new Phone(name,tel); 
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			count=0;
			System.out.print("�˻��� �̸�>> ");
			comment = scanner.next();
			if(comment.equals("�׸�")) {
				break;
			}
			for(int i=0; i<max; i++) {
				if (comment.equals(c[i].check_name())){
					System.out.println(comment+"�� ��ȣ�� "+c[i].check_tel());
					count++;
				}
			}
			if (count==0){
				System.out.println(comment+"�� �����ϴ�");
			}
		}
		System.out.println("����");
		scanner.close();
	}

}
