package example4;
import java.util.Scanner;
public class example4_7 {
	public static void main(String[] args) {
		Book_3 [] book = new Book_3[2]; // Book �迭 ����(2��)
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
		System.out.print("����>>");
		String title = scanner.nextLine();
		System.out.print("����>>");
		String author = scanner.nextLine();
		book[i] = new Book_3(title, author); // �迭 ���� ��ü ����
		}
		for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		scanner.close();
	}
}
