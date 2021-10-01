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
		//aClass.b = 20; //aClass.b 는 private 이어서 AccesEx에서 접근 불가 접근하면 오류뜸
		aClass.c = 30;
		System.out.println("aClass.a : "+aClass.a);
		//System.out.println("aClass.b : "+aClass.b);
		System.out.println("aClass.c : "+aClass.c);
	}

}
