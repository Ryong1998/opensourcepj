package practice;
import java.util.Scanner;
public class quiz_8 {

	public static boolean inRect(int x, int y, int rectx1,int recty1, int rectx2,int recty2) {
		if((x>=rectx1 && x<=rectx2)&&(y>=recty1 && y<= recty2))
			return true;
		else return false;
	}//���� ������ ���� ��� true, ���� ��� false ��ȯ
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("����: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		final int max = 9999;
		boolean result1;
		boolean result2;
		//������ �簢���� ������ ������ ��� �浹�Ѵٰ� ����
		if(x2>x1 && y2>y1) {
				result1=inRect(x1,y1,100,100,200,200);
				result2=inRect(x2,y2,100,100,200,200);
				if(result1==true || result2== true) { //���� �̻��� �簢�� ���ο� �ִ� ���
					if(result1==true && result2== true) //�� ���� �簢�� ���ο� ������ ���� ��ġ�� ����
						System.out.println("�浹���մϴ�");
					else
						System.out.println("�浹�մϴ�"); // ������ �簢�� ���ο� ������ �浹��
				}
				else { //������ �簢�� �ܺο� �ִ� ��� x1,y1�� ������ x2,y2 ��ġ�� ���� �浿�ϴ� ����� ������ ����
					//0<=x1<=100 and 0<=y1<=100 �� ��,100<=x2<=max and 100<=y2<=200�� ��� ��ħ
					if(inRect(x1,y1,0,0,100,100)==true && inRect(x2,y2,100,100,max,200)==true)
						System.out.println("�浹�մϴ�");
					//100<=x1<=200 and 0<=y1<=100 �� ��, x1<=x2<=max and 200<=y2<=max�� ��� ��ħ
					else if(inRect(x1,y1,100,0,200,100)==true && inRect(x2,y2,x1,100,max,max)==true)
						System.out.println("�浹�մϴ�");
					//0<=x1<=100 and 100<=y1<=200 �� ��,200<=x2<=max and y1<=y2<=max�� ��� ��ħ
					else if(inRect(x1,y1,0,100,100,200)==true && inRect(x2,y2,100,y1,max,max)==true)
						System.out.println("�浹�մϴ�");
					else
						System.out.println("�浹���մϴ�");
				}
		}
		scanner.close();

	}

}
