package practice;

public class Book_2 {
	String title;
	String author;
	void show(){
		System.out.println(title + " " + author);
	}
	
	public Book_2() { //매개변수 없는 경우
	this("제목없음", "작가없음"); //매개변수 2개인 경우인 메소드로 진행
	System.out.println("생성자 호출됨");
	}
	
	public Book_2(String title) { //매개변수 1개인 경우
	this(title, "작자미상"); //매개변수 2개인 경우인 메소드로 진행
	}
	
	public Book_2(String title, String author) { //매개변수 2개인 경우
		this.title = title; this.author = author;
	}
}
