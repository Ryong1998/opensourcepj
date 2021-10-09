package example5;


class Person_4{} 
class Student_4 extends Person_4 {} 
class Researcher_4 extends Person_4 {} 
class Professor_4 extends Researcher_4 {} 

public class example5_4 { 
	static void print(Person_4 p) { 
		if(p instanceof Person_4) //레퍼런스가 가리키는 객체의 타입 식별을 위해 사용
			System.out.print("Person "); 
		if(p instanceof Student_4) 
			System.out.print("Student "); 
		if(p instanceof Researcher_4) 
			System.out.print("Researcher "); 
		if(p instanceof Professor_4) 
			System.out.print("Professor "); 
		System.out.println(); 
	} 
	
	public static void main(String[] args) { 
		System.out.print("new Student_4() -> \t"); 
		print(new Student_4()); 
		System.out.print("new Researcher_4() -> \t"); 
		print(new Researcher_4()); 
		System.out.print("new Professor_4() -> \t"); 
		print(new Professor_4()); 
	}
}


