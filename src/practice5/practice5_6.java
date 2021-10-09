package practice5;

class Point {
	   private int x, y;
	   public Point(int x, int y) { 
		   this.x = x; this.y = y; //3.super �̿��ؼ� �� ������, (0,0) ���� ����
		   						   ////9.super �̿��ؼ� �� ������, (10,10) ���� ����
	   }
	   public int getX() { 
		   return x; 
	   }
	   public int getY() { 
		   return y; 
	   }
	   protected void move(int x, int y) { 
		   this.x =x; this.y = y; //13. ��ǥ ����
	   }
	}

class ColorPoint extends Point{
	   private String color;
	   public ColorPoint() {
	      super(0, 0); //2.super�� �̿��ؼ� �θ�Ŭ���� ������ ���
	      this.color = "BLACK"; //4.(0,0)�� ���� Black
	   }
	   public ColorPoint(int x, int y) {
	      super(x, y); //8.super�� �̿��ؼ� �θ�Ŭ���� ������ ���
	      this.color = "BLACK"; //10. (10,10)�� ���� Black
	   }
	   public void setXY(int x, int y) {
	      move(x, y);//12. �θ�Ŭ������ �޼ҵ�� �̵�
	   }
	   public void setColor(String color) {
	      this.color = color;//15.���򺯰�
	   }
	   public String toString() {
	      String tmp = color+"���� ("+getX()+","+getY()+") ��"; //6. �θ�Ŭ�����κ��� ��ӹ��� �޼ҵ� �̿�
	      return tmp;
	   }
	}
public class practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ColorPoint zeroPoint = new ColorPoint(); // 1.Ŭ���� ColorPoint�� ��ü�� zeroPoint ����
	   System.out.println(zeroPoint.toString() + "�Դϴ�."); //5.zeroPoint�� toString �޼ҵ� �ǽ�
	   ColorPoint cp = new ColorPoint(10, 10); // 7. Ŭ���� ColorPoint ��ü�� cp ����
	   cp.setXY(5,5);//11. ��ü cp�� �޼ҵ� ����
	   cp.setColor("RED");//14. ��ü cp�� �޼ҵ� ����
	   System.out.println(cp.toString()+"�Դϴ�.");
	}

}
