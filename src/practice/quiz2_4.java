package practice;
import java.util.Scanner;
public class quiz2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 하나를 입력하세요: ");
		char alpa = scanner.next().charAt(0);
		int ialpa = (int)alpa;
		int count= ialpa+1;
		for(int i=97;i<ialpa+1;i++) {
			for(int j=97;j<count;j++) {
				System.out.print((char)j+" ");
			}
			count-=1;
			System.out.println();
		}
		scanner.close();

	}

}
