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
	
	public int game() { // ���۰� ���� �� Ű�� ������ �� ���̸� ��ȯ
		System.out.print(name+" ���� <Enter>Ű  >>");
		sec1 = enter(); //enter�� enter ������ �� �ʸ� ��ȯ�ϴ� �޼ҵ�
		System.out.print("10�� ���� �� <Enter>Ű  >>");
		sec2 = enter();
		if(sec1 < sec2) //�Ϲ����� ���
			return sec2-sec1;
		else 
			return (60-sec1) + sec2; //sec1�� sec2���̿� ���� �ٲ���
	}
	
	public int enter() {
		buffer = sc.nextLine(); //���� �Է� ������ ���� �ڵ�� �Ѿ, ������ ������ ������ �ڵ尡 �ٷ� �����.. 
		now = Calendar.getInstance(); //���� �ð��� �Է¹���
		System.out.println("\t���� �� �ð� = "+ now.get(Calendar.SECOND));//���� �ð�(��) �� �����
		return now.get(Calendar.SECOND); //����� ����ð�(��)�� ��ȯ
		
	}
}
public class practice6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6_6 person1 = new Person6_6("Ȳ����");
		Person6_6 person2 = new Person6_6("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1 = person1.game();
		int result2 = person2.game();
		
		if(Math.abs(result1 - 10) < Math.abs(result2 - 10)) //������ �̿��ؼ� 10�� ���̰� ���� ���� �̱�
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� "+result1+", ���繮�� ��� "+result2+", ���ڴ� ���繮");
	}

}
