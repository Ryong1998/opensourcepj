package example7;
import java.util.Vector;

class Point7_2{
	private int x,y;
	public Point7_2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}
public class example7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Point ��ü�� ��ҷθ� ������ ���� ����
		Vector<Point7_2> v = new Vector<Point7_2>(); 
		
		// 3 ���� Point ��ü ����
		v.add(new Point7_2(2, 3));
		v.add(new Point7_2(-5, 20));	
		v.add(new Point7_2(30, -8));
		v.remove(1); // �ε��� 1�� Point(-5, 20) ��ü ����
		
		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0; i<v.size(); i++) {
			Point7_2 p = v.get(i); // ���Ϳ��� i ��° Point ��ü ����
			System.out.println(p); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}

}
