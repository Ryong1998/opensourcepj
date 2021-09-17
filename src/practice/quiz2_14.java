package practice;
import java.util.Scanner;
public class quiz2_14 {

	public static void main(String[] args) {
		String courses[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int scores [] = {95,88,76,62,55};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("과목이름: ");
			String subject = scanner.next();
			if (subject.equals("그만")) {
				break;
			}
			int count=0;
			for(int i=0;i<courses.length;i++) {
				if(courses[i].equals(subject)) {
					System.out.println(courses[i]+" 점수는 "+scores[i]);
					count++;
				}
			}
			if(count==0) {
				System.out.println("없는 과목입니다");
			}
		
			
		}
		
		System.out.println("끝입니다");
		
		scanner.close();

	}

}
