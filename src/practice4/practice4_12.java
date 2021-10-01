package practice4;
import java.util.Scanner;

class Seat { // �¼� ����
	private String seat[];
	
	public Seat() { // �¼� ������
		seat = new String[10]; //10���� �¼�
		for(int i=0; i<seat.length; i++) {
			seat[i] = "___"; //ó���� S,A,B ������ �� 10�ڸ����� ��� �ʱ�ȭ
		}
	}
	
	public void Show() { // �¼� ���� ���
		for(int i=0; i<seat.length; i++) { //�Է¹��� S,A,B �߿��� �Ѱ��� 10�ڸ��� ��� ���
			System.out.print(seat[i]+" ");
		}
		System.out.println();
	}
	
	public void Set(String name, int num) { // ���ŵ� �¼� ���� ó��
		seat[num-1] = name; //�Է¹��� ������, �̸��� �ش� �ڸ��� ������Ʈ
	}
	
	public boolean reSet(String name) { // �¼� ��� ���� Ȯ�� ��, ó��
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) { //�Է� ���� �̸��� �����ϸ�, ��ĭ���� �ٲٰ� �ٲ����� true ��ȯ
				seat[i] = "___";
				return true;
			}
		}
		return false;
	}
}

class Reservation {
	Scanner sc = new Scanner(System.in);
	private Seat s[]; // ������ ��� �� �¼� ����
	private String seatGrade[] = {"S", "A", "B"}; // �¼� ��޺� �̸�
	
	public Reservation() { //���� ������
		s  = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat(); //Seat Ŭ���� �����Ͽ��� ó�� �ڸ� �ʱ�ȭ�� ����
		}
	}
	
	public void Reserve() { //����
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("�̸�>>");
		String name = sc.next();
		System.out.print("��ȣ>>");
		int num = sc.nextInt();
		s[grade-1].Set(name, num);
	}
	
	public void Check() { //��ȸ
		for(int i=0; i<s.length; i++ ) {
			System.out.print(seatGrade[i]+">>");
			s[i].Show();
		}
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public void Cancel() {//���
		System.out.print("�¼� S:1, A:2, B:3>>");
		int grade = sc.nextInt();
		System.out.print(seatGrade[grade-1]+">>");
		s[grade-1].Show();
		
		System.out.print("�̸�>>");
		String name = sc.next();
		
		boolean result = s[grade-1].reSet(name); //��Ҹ� ������(��ĭ���� �مf����) true ��ȯ
		if(result==true)
			System.out.println("<<<��Ҹ� �Ϸ��Ͽ����ϴ�.>>>");
		else
			System.out.println("�������� �ʴ� �����Դϴ�.");
	}
	
	public void Run() {
		int option;
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
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
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Reservation r = new Reservation();
		r.Run();
	}
}

