package practice;
import java.util.Scanner;
public class quiz2_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unit[] = {50000,10000,1000,500,100,50,10,1};
		System.out.print("�ݾ��� �Է��ϼ���: ");
		int money = scanner.nextInt();
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i]+"���� : "+money/unit[i]);
			money%=unit[i];
		}
		
		scanner.close();

	}

}
