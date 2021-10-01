package example4;
import java.util.Scanner;
public class example4_7 {
	public static void main(String[] args) {
		Book_3 [] book = new Book_3[2]; // Book 배열 선언(2개)
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
		System.out.print("제목>>");
		String title = scanner.nextLine();
		System.out.print("저자>>");
		String author = scanner.nextLine();
		book[i] = new Book_3(title, author); // 배열 원소 객체 생성
		}
		for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		scanner.close();
	}
}
