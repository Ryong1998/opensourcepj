package practice;

public class example4_4 {
	public static void main(String[] args) {
		Book_1 littlePrince = new Book_1("어린왕자", "생텍쥐페리"); //Book_1 의 객체(littlePrince) 생성, 매개변수가 2개인 경우 
		Book_1 loveStory = new Book_1("춘향전"); //Book_1 의 객체(loveStory) 생성, 매개변수가 1개인 경우
		System.out.println(littlePrince.title + " " + littlePrince.author); //객체의 필드(제목,작가) 출력
		System.out.println(loveStory.title + " " + loveStory.author);//객체의 필드(제목,작가) 출력
	}
}
