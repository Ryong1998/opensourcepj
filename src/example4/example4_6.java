package example4;

public class example4_6 {
	public static void main(String[] args) {
		Circle_3 [] c; //Circle_3 �迭�� ���� ���۷��� ���� c ����
		c = new Circle_3[5]; //���۷��� �迭 ����
		for(int i=0; i<c.length; i++) 
		c[i] = new Circle_3(i); //�迭�� �� ���� ��ü ����(5�� ����)
		for(int i=0; i<c.length; i++) 
		System.out.print((int)(c[i].getArea()) + " "); //�迭�� ���� ��ü �̿��ؼ� ��� ���(�������� 0 1 2 3 4 �� ����� ������)
		}
}
