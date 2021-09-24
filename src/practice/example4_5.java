package practice;

public class example4_5 {
	public static void main(String[] args) {
		Book_2 littlePrince = new Book_2("어린왕자", "생텍쥐페리"); //Book_2를 통해 객체 littlePrince 생성, 매개변수 2개인 경우
		Book_2 bible = new Book_2("Bible");//Book_2를 통해 객체 bible 생성, 매개변수 1개인 경우
		Book_2 emptyBook = new Book_2();//Book_2를 통해 객체 emyptyBook 생성, 매개변수 0개인 경우
		littlePrince.show(); //객체 메소드(show) 실행
		System.out.println();
		bible.show(); //객체 메소드(show) 실행
		System.out.println();
		emptyBook.show(); //객체 메소드(show) 실행
	}
}
