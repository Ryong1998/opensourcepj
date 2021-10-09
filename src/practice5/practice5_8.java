package practice5;
class PositivePoint extends Point { //Point클래스는 practice5_6 참조
	   public PositivePoint() {
	      super(0, 0);
	   }
	   public PositivePoint(int x, int y) {
	      super(x,y); //우선 x,y로 생성자를 생성
	      if(x<0 || y<0) { //만약 객체생성할때 입력받은 x,y가 음수이면
	         super.move(0,0); //생성자를 (0,0)으로 만듬
	      }
	   }
	   protected void move(int x, int y) {
	      if(x>0 && y>0) {//x,y는 음수 공간으로 이동을 안하므로 양수일때만
	         super.move(x, y); //부모클래스의 매소드 move 실행
	      }
	   }
	   public String toString() {
	      String tmp = "("+getX()+","+getY()+")의 점";
	      return tmp;
	   }
	}
public class practice5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		p.move(-5,5); 
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
	}

}
