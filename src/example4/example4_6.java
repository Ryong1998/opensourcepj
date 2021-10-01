package example4;

public class example4_6 {
	public static void main(String[] args) {
		Circle_3 [] c; //Circle_3 배열에 대한 레퍼런스 변수 c 선언
		c = new Circle_3[5]; //레퍼런스 배열 생성
		for(int i=0; i<c.length; i++) 
		c[i] = new Circle_3(i); //배열의 각 원소 객체 생성(5개 생성)
		for(int i=0; i<c.length; i++) 
		System.out.print((int)(c[i].getArea()) + " "); //배열의 원소 객체 이용해서 결과 출력(반지름이 0 1 2 3 4 인 경우의 면적들)
		}
}
