package example4;

class Sample {
	public int a;
	private int b;
	int c;
}

public class example4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 20; //aClass.b �� private �̾ AccesEx���� ���� �Ұ� �����ϸ� ������
		aClass.c = 30;
		System.out.println("aClass.a : "+aClass.a);
		//System.out.println("aClass.b : "+aClass.b);
		System.out.println("aClass.c : "+aClass.c);
	}

}
