package practice4;

import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	public Phone(String name, String tel) { 
		this.name = name;
		this.tel = tel;
	}
	public String check_name() {
		return this.name;
	}
	public String check_tel() {
		return this.tel;
	}
	
}

public class practice4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int max;
		String comment;
		int count=0;
		System.out.print("인원수>>");
		max = scanner.nextInt();
		Phone c[] = new Phone[max]; // 3개의 Circle 배열 선언
		for(int i=0; i<max; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
		    String tel = scanner.next(); 
		    c[i] = new Phone(name,tel); 
		}
		System.out.println("저장되었습니다...");
		while(true) {
			count=0;
			System.out.print("검색할 이름>> ");
			comment = scanner.next();
			if(comment.equals("그만")) {
				break;
			}
			for(int i=0; i<max; i++) {
				if (comment.equals(c[i].check_name())){
					System.out.println(comment+"의 번호는 "+c[i].check_tel());
					count++;
				}
			}
			if (count==0){
				System.out.println(comment+"이 없습니다");
			}
		}
		System.out.println("종료");
		scanner.close();
	}

}
