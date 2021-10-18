package example6;

class Point6_3 {
	int x, y;
	public Point6_3(int x, int y) {
		this.x = x; this.y = y;
	}
	public boolean equals(Object obj) {
		Point6_3 p = (Point6_3)obj; 
		if(x == p.x && y == p.y) 
			return true;
		else 
			return false;
	}
}

public class example6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point6_3 a = new Point6_3(2,3);
		Point6_3 b = new Point6_3(2,3);
		Point6_3 c = new Point6_3(3,4);
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");
	}

}
