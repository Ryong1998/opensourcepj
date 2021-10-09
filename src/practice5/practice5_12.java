package practice5;

import java.util.Scanner;

abstract class Shape {
   private Shape next;//클래스 Shape의 객체 next 선언
   public Shape() { next = null; }
   public void setNext(Shape obj) { next = obj; } // 링크 연결
   public Shape getNext() { return next; }
   public abstract void draw(); //추상메소드 Line,Rect,Circle 각 클래스에 자세이 선언되어 있음
}

class Line extends Shape {
   String name ="line";
   public void draw() {
      System.out.println("Line");
   }
}
class Rect extends Shape {
   String name ="Rect";
   public void draw() {
      System.out.println("Rect");
   }
}
class Circle extends Shape {
   String name ="circle";
   public void draw() {
      System.out.println("Circle");
   }
}

public class practice5_12{
   private Shape head, tail; //클래스 Shape의 객체 head, tail 선언
   private Scanner sc; 
   
   public practice5_12() {
      head = null;  // 시작 노드
      tail = null; // 끝 노드
      sc = new Scanner(System.in);
   }
   
   //1번 주석
   public void run() {
      System.out.println("그래픽 에디터 beauty를 실행합니다.");
      while(true) {
         System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
         int num = sc.nextInt();
         switch(num) {
         case 1://삽입의 경우
            System.out.print("Line(1), Rect(2), Circle(3) >> ");
            num = sc. nextInt();
            insert(num);//2번 주석으로 이동
            break;
         case 2:
            System.out.print("삭제할 도형의 위치 >> ");
            num = sc.nextInt();
            delete(num);//3번 주석으로 이동
            break;
         case 3:
            print();//4번 주석으로 이동
            break;
         case 4:
            System.out.println("beauty을 종료합니다.");
            sc.close();
            return;
         }
      }
   }
   
   //2번 주석
   public void insert(int draw) { // 노드 삽입
      Shape grapic; //class Shape의 객체 graphics 생성
      switch(draw) {
      case 1:
         grapic = new Line(); //업캐스팅, Shape의 멤버만 접근 가능
         break;
      case 2:
         grapic = new Rect();//업캐스팅
         break;
      case 3:
         grapic = new Circle();//업캐스팅
         break;
      default:
         System.out.println("다시 입력해 주세요.");
         return;
      }
      //graphic 객체가 정의된 다음에,
      if(head == null) { // head가 아무것도 가리키지 않으면(처음의 실행의 경우)
         head = grapic; // head랑 tail이 새로운 노드를가리킴
         tail = grapic;
      }
      else {
         tail.setNext(grapic); // 부모클래스의 setNext 메소드 이용, 끝 노드에 새로운 노드를 연결하고,
         tail = grapic; // 끝 노드는 새로 만들어진 노드를 가리키게 함
      }
   }
   
   //4번 주석
   public void print() { // 전체 노드 출력
      Shape s = head;
      while(s != null) {
         s.draw();
         s = s.getNext();
      }
   }
   
   //3번 주석
   public void delete(int num) { // num은 몇번째 노드인지
      Shape cur = head; // 현재 노드
      Shape tmp = head;
      int i;
      if( num == 1) { // 첫번째 노드를 삭제하는 경우 
         if(head == tail) { // 노드가 한개 일경우 
            head = null;
            tail = null;
            return;
         }
         else { // 노드가 두개 이상
            head = head.getNext();
            return;
         }
      }
      for(i=1; i<num; i++) {
         tmp = cur; // 현재 노드를 저장 후  (즉, 이전 노드)
         cur = cur.getNext(); // 다음 노드로 이동
         if(cur == null) { // 노드 수가 입력 값보다 적을때
            System.out.println("삭제할 수 없습니다.");
            return;
         }
      }
      if(i==num) { // 끝 노드를 가리킬때
         tmp.setNext(cur.getNext());
         tail = tmp;
      }
      else // 끝노드가 아니라면 이전노드가 다음 노드를 가리킴 (즉, 현재 노드 삭제)
         tmp.setNext(cur.getNext());
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   	practice5_12 editor = new practice5_12();
        editor.run();
   }
}
