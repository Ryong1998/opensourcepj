package practice;
import java.util.Scanner;
public class quiz2_14 {

	public static void main(String[] args) {
		String courses[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int scores [] = {95,88,76,62,55};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�����̸�: ");
			String subject = scanner.next();
			if (subject.equals("�׸�")) {
				break;
			}
			int count=0;
			for(int i=0;i<courses.length;i++) {
				if(courses[i].equals(subject)) {
					System.out.println(courses[i]+" ������ "+scores[i]);
					count++;
				}
			}
			if(count==0) {
				System.out.println("���� �����Դϴ�");
			}
		
			
		}
		
		System.out.println("���Դϴ�");
		
		scanner.close();

	}

}
