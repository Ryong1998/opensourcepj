package practice;
import java.util.Scanner;
public class quiz2_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����","����","��"};
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�");
		while(true) {
			System.out.print("���� ���� �� >> ");
			String person_state = scanner.next();
			if(person_state.equals("�׸�")) {
				System.out.println("������ �����մϴ�");
				break;
			}
			int com_state_int = (int)(Math.random()*3);
			
			if(person_state.equals("����")) {
				if(com_state_int==0) {
					System.out.println("�����ϴ�");
				}
				else if(com_state_int==1) {
					System.out.println("����ڰ� �����ϴ�");					
				}
				else{
					System.out.println("����ڰ� �̰���ϴ�");					
				}
			}
			else if(person_state.equals("����")) {
				if(com_state_int==0) {
					System.out.println("����ڰ� �̰���ϴ�");					
				}
				else if(com_state_int==1) {
					System.out.println("�����ϴ�");					
				}
				else{
					System.out.println("����ڰ� �����ϴ�");				
				}			
			}
			else if(person_state.equals("��")) {
				if(com_state_int==0) {
					System.out.println("����ڰ� �����ϴ�");					
				}
				else if(com_state_int==1) {
					System.out.println("����ڰ� �̰���ϴ�");				
				}
				else{
					System.out.println("�����ϴ�");				
				}
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				continue;
			}
			System.out.println("����� : "+person_state+" ��ǻ�� : "+str[com_state_int]);
		}
		
		
		
		
		scanner.close();


	}

}
