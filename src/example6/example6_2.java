package example6;
class Point6_2 {
	int x, y;
	public Point6_2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point6_2(" + x + "," + y + ")";
	}
}
public class example6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point6_2 p = new Point6_2(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p�� p.toString()���� �ڵ� ��ȯ
		System.out.println(p + "�Դϴ�."); // p.toString() + "�Դϴ�"�� �ڵ� ��ȯ
	}

}
