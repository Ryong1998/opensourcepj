package practice;

public class example4_5 {
	public static void main(String[] args) {
		Book_2 littlePrince = new Book_2("�����", "�������丮"); //Book_2�� ���� ��ü littlePrince ����, �Ű����� 2���� ���
		Book_2 bible = new Book_2("Bible");//Book_2�� ���� ��ü bible ����, �Ű����� 1���� ���
		Book_2 emptyBook = new Book_2();//Book_2�� ���� ��ü emyptyBook ����, �Ű����� 0���� ���
		littlePrince.show(); //��ü �޼ҵ�(show) ����
		System.out.println();
		bible.show(); //��ü �޼ҵ�(show) ����
		System.out.println();
		emptyBook.show(); //��ü �޼ҵ�(show) ����
	}
}
