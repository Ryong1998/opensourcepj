package practice7;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String eng, kor;
	Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	String Eng() {
		return eng;
	}
	String Kor() {
		return kor;
	}
}


public class practice7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var v = new Vector<Word>(); //WordŬ������ �Է¹޴� ���� v �� ����
		v.add(new Word("love", "���"));
		v.add(new Word("animal", "����"));
		v.add(new Word("dog", "������"));
		v.add(new Word("cat", "�����"));
		v.add(new Word("computer", "��ǻ��"));
		v.add(new Word("bag", "����"));
		v.add(new Word("book", "å"));
		v.add(new Word("pencil", "����"));
		v.add(new Word("cloth", "��"));
		v.add(new Word("pants", "����"));
		v.add(new Word("head", "�Ӹ�"));
		v.add(new Word("hand", "��"));
		v.add(new Word("foot", "��"));
		v.add(new Word("arm", "��"));
		v.add(new Word("cigarettes", "���"));
		v.add(new Word("fire", "��"));
		v.add(new Word("water", "��")); //���ܾ�� ���� �Է� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** ���� �ܾ� �׽�Ʈ ���α׷� \"��ǰ����\" �Դϴ�. ****");
		while (true) {
			System.out.println();
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����:3>> ");
			int num = scanner.nextInt();
			if (num == 3) //3�� �Է� ������ ����
				break;
			switch (num) {
			case 1:// �ܾ� �׽�Ʈ�� �Է� ���� ���
				System.out.println("���� " + v.size() + "���� �ܾ ��� �ֽ��ϴ�.");
				System.out.println("-1�� �Է��ϸ� �׽�Ʈ�� �����մϴ�.");
				System.out.println();
				int[] example = new int[4]; //example�� ���⸦ ��Ÿ�� �� ���
				while (true) {
					for (int i = 0; i < 4; i++) {
						int v_random_index = (int) (Math.random() * v.size()); //r�� vũ�⸸ŭ�� ������ ������ �� ������ �ε���
						example[i] = v_random_index; //4���� example�� v_random_index�� �Ҵ�
						if (i > 0 && example[i - 1] == example[i]) //example�� �Ҵ��� value���� ���� ���� ������ ������
							i--;//i�� ���� ���Ѽ� �ٽ� �Ҵ�
					}
					int v_random_index2 = (int) (Math.random() * 4); //0�������� 4�̸��� index(������ �ε���)�� �Ҵ�
					System.out.println(v.get(example[v_random_index2]).Eng() + "?");

					for (int i = 0; i < 4; i++) { //4���� ���⸦ ���
						System.out.print("(" + (i + 1) + ")" + v.get(example[i]).Kor() + " ");
					}
					int answer = 0;
					System.out.print(":>");
					String tmp = scanner.next();
					if (tmp.equals("1") || tmp.equals("2") || tmp.equals("3") || tmp.equals("4") || tmp.equals("-1"))//1 2 3 4 -1 �� ���� �Է��ϸ�
						answer = Integer.parseInt(tmp); //�������� ���� �Է� ���� ������ ���� �ϰ� answer�� ���� �Ҵ�
					else {
						System.out.println("���ڸ� �Է��ϼ��� !!");
						System.out.println();
					}
					if (answer == -1) //-1�� �Է¹�����
						break;//����
					if (answer >= 1 && answer <= 4) { //1���� 4 ������ ���� �Է� ������
						if (v.get(example[answer - 1]).Eng().equals(v.get(example[v_random_index2]).Eng())) {
							System.out.println("Excellent  !!");
							System.out.println();
						} else {
							System.out.println("No.  !!");
							System.out.println();
						}
					}
				}
				break;
			case 2: //�ܾ� ������ �Է��� ���
				System.out.println("���� �ܾ �׸��� �Է��ϸ� �Է��� �����մϴ�.");
				while (true) {
					System.out.print("���� �ѱ� �Է� >> ");
					String eng = scanner.next();
					if (eng.equals("�׸�"))
						break;
					String kor = scanner.next();
					int count = 0;
					for (int i = 0; i < v.size(); i++) {
						String tmp = v.get(i).Eng();
						if (tmp.equals(eng)) //v�� �����ϴ� ���ܾ� �� �Է¹��� ���ܾ ������
							System.out.println("�̹� �ִ� �ܾ� �Դϴ�.. �ٸ� �ܾ �Է��ϼ���!");
						else //���� �ʴٸ� count�� ����
							count++;
					}
					if (count == v.size()) //v�� �����ϴ� ��� ���ܾ ���ߴµ��� �Է� ���� ���ܾ ������
						v.add(new Word(eng, kor)); //�Է¹��� ���ܾ�, �ѱ۴ܾ �߰�
				}
				break;
			default:
				System.out.println("1, 2, 3�� �ϳ��� �Է��ϼ���"); //1 2 3 �̿��� ���� �Է¹��� ���
				break;
			}
		}
		scanner.close();


	}

}
