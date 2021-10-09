package example5;

abstract class Calculator { //�߻�Ŭ������ ��ü ���� �Ұ���
	//�߻� �żҵ� ����
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

public class example5_7 extends Calculator {
	@Override
	public int add(int a, int b) { // �߻� �޼ҵ� ����
		return a + b;
	}
	@Override
	public int subtract(int a, int b) { // �߻� �޼ҵ� ����
		return a - b;
	}
	@Override
	public double average(int[] a) { // �߻� �޼ҵ� ����
		double sum = 0;
		for (int i = 0; i <a.length; i++)
		sum += a[i];
		return sum/a.length;
	}
	public static void main(String [] args) {
		example5_7 c = new example5_7();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] { 2,3,4 }));
	}

}