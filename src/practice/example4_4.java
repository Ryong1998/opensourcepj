package practice;

public class example4_4 {
	public static void main(String[] args) {
		Book_1 littlePrince = new Book_1("�����", "�������丮"); //Book_1 �� ��ü(littlePrince) ����, �Ű������� 2���� ��� 
		Book_1 loveStory = new Book_1("������"); //Book_1 �� ��ü(loveStory) ����, �Ű������� 1���� ���
		System.out.println(littlePrince.title + " " + littlePrince.author); //��ü�� �ʵ�(����,�۰�) ���
		System.out.println(loveStory.title + " " + loveStory.author);//��ü�� �ʵ�(����,�۰�) ���
	}
}
