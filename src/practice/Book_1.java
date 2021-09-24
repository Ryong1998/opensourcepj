package practice;

public class Book_1 {
	String title; //책 제목
	String author; // 책 작가
	public Book_1(String t) { // 생성자. 매개변수 1개인 경우
	title = t; author = "작자미상";
	}
	public Book_1(String t, String a) { // 생성자, 배개변수 2개인 경우
	title = t; author = a;
	}
}
