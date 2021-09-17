package practice;
import java.util.Arrays;
import java.util.Scanner;
public class quiz2_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수몇개?: ");
		int n = scanner.nextInt();

		int intArray[];
		intArray = new int[n];
		//int intArray[] = new int[n]; 도 되는듯
		for(int i=0;i<intArray.length;i++){
			int number = (int)(Math.random()*100+1);
			int count=0;
			for(int j=0;j<intArray.length;j++) {
				if(number==intArray[j]) {
					count+=1;
				}
			}
			if (count!=0) {
				i--;
				continue;
			}
			intArray[i]=number;
			
		}
		for(int k =0;k<intArray.length;k++) {
			System.out.print(intArray[k]+" ");
			if((k+1)%10==0) {
				System.out.println();
			}
		}
		System.out.println();
		Arrays.sort(intArray);
		for(int k =0;k<intArray.length;k++) {
			System.out.print(intArray[k]+" ");
			if((k+1)%10==0) {
				System.out.println();
			}
		}
		scanner.close();
	}

}
