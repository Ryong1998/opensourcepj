package practice5;

class Point {
	   private int x, y;
	   public Point(int x, int y) { 
		   this.x = x; this.y = y; //3.super 이용해서 온 생성자, (0,0) 으로 생성
		   						   ////9.super 이용해서 온 생성자, (10,10) 으로 생성
	   }
	   public int getX() { 
		   return x; 
	   }
	   public int getY() { 
		   return y; 
	   }
	   protected void move(int x, int y) { 
		   this.x =x; this.y = y; //13. 좌표 수정
	   }
	}

class ColorPoint extends Point{
	   private String color;
	   public ColorPoint() {
	      super(0, 0); //2.super를 이용해서 부모클래스 생성자 사용
	      this.color = "BLACK"; //4.(0,0)의 색은 Black
	   }
	   public ColorPoint(int x, int y) {
	      super(x, y); //8.super를 이용해서 부모클래스 생성자 사용
	      this.color = "BLACK"; //10. (10,10)의 색은 Black
	   }
	   public void setXY(int x, int y) {
	      move(x, y);//12. 부모클래스의 메소드로 이동
	   }
	   public void setColor(String color) {
	      this.color = color;//15.색깔변경
	   }
	   public String toString() {
	      String tmp = color+"색의 ("+getX()+","+getY()+") 점"; //6. 부모클래스로부터 상속받은 메소드 이용
	      return tmp;
	   }
	}
public class practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ColorPoint zeroPoint = new ColorPoint(); // 1.클래스 ColorPoint의 객체인 zeroPoint 생성
	   System.out.println(zeroPoint.toString() + "입니다."); //5.zeroPoint의 toString 메소드 실시
	   ColorPoint cp = new ColorPoint(10, 10); // 7. 클래스 ColorPoint 객체인 cp 생성
	   cp.setXY(5,5);//11. 객체 cp의 메소드 실행
	   cp.setColor("RED");//14. 객체 cp의 메소드 실행
	   System.out.println(cp.toString()+"입니다.");
	}

}
