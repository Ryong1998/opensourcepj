package practice;
import java.util.Scanner;
public class quiz_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99): ");
		int number = scanner.nextInt();
		if (number/10 == number%10) //10으로 나눈 몫과 나머지가 일치하면 10의 자리와 1의 자리 일치하는 것
				System.out.print("yes 10의 자리, 1의 자리 일치");
		else
			System.out.print("no 10의자리 1의 자리 일치 안함");
		scanner.close();
	}

}
