package practice;

public class quiz2_10 {
	public static void main(String[] args) {
		int array[][]=new int[4][4];
		int number1,number2;
		int count=0;
		
		while(count<10) {
			number1=(int)(Math.random()*4);
			number2=(int)(Math.random()*4);
			if(array[number1][number2]==0) {
				array[number1][number2]=(int)(Math.random()*10+1);
				count++;
			}
		}
		
		for(int i=0; i<array.length; i++) {
	         for(int j=0; j<array[i].length; j++) {
	            System.out.print(array[i][j]+" ");
	         }
	         System.out.println();
	    }
		
}
}
