package practice4;
import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (math+science+english)/3;
	}

}
public class practice4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����
		
		scanner.close();
	}

}