package example6;
class Point6_1 {
	int x, y;
	public Point6_1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class example6_1 {
	public static void print(Object obj) {
			System.out.println(obj.getClass().getName()); // Ŭ���� �̸�
			System.out.println(obj.hashCode()); // �ؽ� �ڵ� ��
			System.out.println(obj.toString()); // ��ü�� ���ڿ��� ����� ���
			System.out.println(obj); // ��ü ���
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point6_1 p = new Point6_1(2,3);
		print(p);
	}

}
