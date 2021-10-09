package practice5;

import java.util.Scanner;

abstract class Shape {
   private Shape next;//Ŭ���� Shape�� ��ü next ����
   public Shape() { next = null; }
   public void setNext(Shape obj) { next = obj; } // ��ũ ����
   public Shape getNext() { return next; }
   public abstract void draw(); //�߻�޼ҵ� Line,Rect,Circle �� Ŭ������ �ڼ��� ����Ǿ� ����
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
   private Shape head, tail; //Ŭ���� Shape�� ��ü head, tail ����
   private Scanner sc; 
   
   public practice5_12() {
      head = null;  // ���� ���
      tail = null; // �� ���
      sc = new Scanner(System.in);
   }
   
   //1�� �ּ�
   public void run() {
      System.out.println("�׷��� ������ beauty�� �����մϴ�.");
      while(true) {
         System.out.print("����(1), ����(2), ��� ����(3), ����(4) >> ");
         int num = sc.nextInt();
         switch(num) {
         case 1://������ ���
            System.out.print("Line(1), Rect(2), Circle(3) >> ");
            num = sc. nextInt();
            insert(num);//2�� �ּ����� �̵�
            break;
         case 2:
            System.out.print("������ ������ ��ġ >> ");
            num = sc.nextInt();
            delete(num);//3�� �ּ����� �̵�
            break;
         case 3:
            print();//4�� �ּ����� �̵�
            break;
         case 4:
            System.out.println("beauty�� �����մϴ�.");
            sc.close();
            return;
         }
      }
   }
   
   //2�� �ּ�
   public void insert(int draw) { // ��� ����
      Shape grapic; //class Shape�� ��ü graphics ����
      switch(draw) {
      case 1:
         grapic = new Line(); //��ĳ����, Shape�� ����� ���� ����
         break;
      case 2:
         grapic = new Rect();//��ĳ����
         break;
      case 3:
         grapic = new Circle();//��ĳ����
         break;
      default:
         System.out.println("�ٽ� �Է��� �ּ���.");
         return;
      }
      //graphic ��ü�� ���ǵ� ������,
      if(head == null) { // head�� �ƹ��͵� ����Ű�� ������(ó���� ������ ���)
         head = grapic; // head�� tail�� ���ο� ��带����Ŵ
         tail = grapic;
      }
      else {
         tail.setNext(grapic); // �θ�Ŭ������ setNext �޼ҵ� �̿�, �� ��忡 ���ο� ��带 �����ϰ�,
         tail = grapic; // �� ���� ���� ������� ��带 ����Ű�� ��
      }
   }
   
   //4�� �ּ�
   public void print() { // ��ü ��� ���
      Shape s = head;
      while(s != null) {
         s.draw();
         s = s.getNext();
      }
   }
   
   //3�� �ּ�
   public void delete(int num) { // num�� ���° �������
      Shape cur = head; // ���� ���
      Shape tmp = head;
      int i;
      if( num == 1) { // ù��° ��带 �����ϴ� ��� 
         if(head == tail) { // ��尡 �Ѱ� �ϰ�� 
            head = null;
            tail = null;
            return;
         }
         else { // ��尡 �ΰ� �̻�
            head = head.getNext();
            return;
         }
      }
      for(i=1; i<num; i++) {
         tmp = cur; // ���� ��带 ���� ��  (��, ���� ���)
         cur = cur.getNext(); // ���� ���� �̵�
         if(cur == null) { // ��� ���� �Է� ������ ������
            System.out.println("������ �� �����ϴ�.");
            return;
         }
      }
      if(i==num) { // �� ��带 ����ų��
         tmp.setNext(cur.getNext());
         tail = tmp;
      }
      else // ����尡 �ƴ϶�� ������尡 ���� ��带 ����Ŵ (��, ���� ��� ����)
         tmp.setNext(cur.getNext());
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   	practice5_12 editor = new practice5_12();
        editor.run();
   }
}
