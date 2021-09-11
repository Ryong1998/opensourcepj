package practice;
import java.util.Scanner;
public class quiz_8 {

	public static boolean inRect(int x, int y, int rectx1,int recty1, int rectx2,int recty2) {
		if((x>=rectx1 && x<=rectx2)&&(y>=recty1 && y<= recty2))
			return true;
		else return false;
	}//점이 범위에 있을 경우 true, 없을 경우 false 반환
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		System.out.print("연산: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		final int max = 9999;
		boolean result1;
		boolean result2;
		//기존의 사각형과 변끼리 만나는 경우 충돌한다고 가정
		if(x2>x1 && y2>y1) {
				result1=inRect(x1,y1,100,100,200,200);
				result2=inRect(x2,y2,100,100,200,200);
				if(result1==true || result2== true) { //한점 이상이 사각형 내부에 있는 경우
					if(result1==true && result2== true) //두 점다 사각형 내부에 있으면 변이 겹치지 않음
						System.out.println("충돌안합니다");
					else
						System.out.println("충돌합니다"); // 한점만 사각형 내부에 있으면 충돌함
				}
				else { //두점이 사각형 외부에 있는 경우 x1,y1에 위지와 x2,y2 위치에 따라서 충동하는 경우의 수들이 생김
					//0<=x1<=100 and 0<=y1<=100 일 때,100<=x2<=max and 100<=y2<=200인 경우 겹침
					if(inRect(x1,y1,0,0,100,100)==true && inRect(x2,y2,100,100,max,200)==true)
						System.out.println("충돌합니다");
					//100<=x1<=200 and 0<=y1<=100 일 때, x1<=x2<=max and 200<=y2<=max인 경우 겹침
					else if(inRect(x1,y1,100,0,200,100)==true && inRect(x2,y2,x1,100,max,max)==true)
						System.out.println("충돌합니다");
					//0<=x1<=100 and 100<=y1<=200 일 때,200<=x2<=max and y1<=y2<=max인 경우 겹침
					else if(inRect(x1,y1,0,100,100,200)==true && inRect(x2,y2,100,y1,max,max)==true)
						System.out.println("충돌합니다");
					else
						System.out.println("충돌안합니다");
				}
		}
		scanner.close();

	}

}
