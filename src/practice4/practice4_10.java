package practice4;
import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) { 
		for(int i=0;i<kor.length;i++) {
			if (kor[i].equals(word)){
				return eng[i];
			}	
		}
		return null;
	}
}

public class practice4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String comment;
		String result;
		System.out.println("�ѿ� �ܾ� �˻� ���α׷� �Դϴ�");
		while(true) {
			System.out.print("�˻��� �̸�>> ");
			comment = scanner.next();
			if(comment.equals("�׸�")) {
				break;
			}
			result = Dictionary.kor2Eng(comment);
			if(result==null) {
				System.out.println(comment+"�� ������ �����ϴ�");
			}
			else {
				System.out.println(comment+"�� "+result);
			}
			
		}
		System.out.println("����");
		scanner.close();
	}

}
