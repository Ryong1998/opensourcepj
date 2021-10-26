package practice7;
import java.util.Vector;


import java.util.Scanner;

public class practice7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> stack = new Vector<Integer>(); //Integer 타입의 벡터 stack 생성
		Scanner scanner = new Scanner(System.in);
		while(true) { //0을 입력받을 때 까지 무한 반복
			System.out.print("강수량 입력(0입력시 종료)>>");
			int average=0;
			int sum=0;
			int rain=scanner.nextInt(); //입력받은 강수량은 rain 변수에 할당
			if(rain==0) //입력받은 값이 0이면
				break; //무한 루프 탈출
			
			stack.add(rain); //입력받은 강수량을 stack에 추가
			for(int i=0;i<stack.size();i++) {//stack에 있는 개수 만큼
				System.out.print(stack.get(i)+" ");//stack에 있는 value들을 출력하고
				sum+=stack.get(i);//합계에 value들을 추가
			}
			
			System.out.println();
			average=(sum/stack.size());//합계를 stack에 있는 value들의 개수로 나누어서 평균을 구한다
			System.out.println("현재평균 : "+average);
			
		}
		scanner.close();
	}

}
