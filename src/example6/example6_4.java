package example6;

class Rect6_4 {
	int width;
	int height;
	public Rect6_4(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect6_4 p = (Rect6_4)obj;
		if (width*height == p.width*p.height) 
			return true;
		else 
			return false;
	}
}
public class example6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect6_4 a = new Rect6_4(2,3);
		Rect6_4 b = new Rect6_4(3,2);
		Rect6_4 c = new Rect6_4(3,4);
		if(a.equals(b)) 
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}

}
