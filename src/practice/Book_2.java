package practice;

public class Book_2 {
	String title;
	String author;
	void show(){
		System.out.println(title + " " + author);
	}
	
	public Book_2() { //�Ű����� ���� ���
	this("�������", "�۰�����"); //�Ű����� 2���� ����� �޼ҵ�� ����
	System.out.println("������ ȣ���");
	}
	
	public Book_2(String title) { //�Ű����� 1���� ���
	this(title, "���ڹ̻�"); //�Ű����� 2���� ����� �޼ҵ�� ����
	}
	
	public Book_2(String title, String author) { //�Ű����� 2���� ���
		this.title = title; this.author = author;
	}
}
