package practice5;
class PositivePoint extends Point { //PointŬ������ practice5_6 ����
	   public PositivePoint() {
	      super(0, 0);
	   }
	   public PositivePoint(int x, int y) {
	      super(x,y); //�켱 x,y�� �����ڸ� ����
	      if(x<0 || y<0) { //���� ��ü�����Ҷ� �Է¹��� x,y�� �����̸�
	         super.move(0,0); //�����ڸ� (0,0)���� ����
	      }
	   }
	   protected void move(int x, int y) {
	      if(x>0 && y>0) {//x,y�� ���� �������� �̵��� ���ϹǷ� ����϶���
	         super.move(x, y); //�θ�Ŭ������ �żҵ� move ����
	      }
	   }
	   public String toString() {
	      String tmp = "("+getX()+","+getY()+")�� ��";
	      return tmp;
	   }
	}
public class practice5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"�Դϴ�.");
		p.move(-5,5); 
		System.out.println(p.toString()+"�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"�Դϴ�.");
	}

}
