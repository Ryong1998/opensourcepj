package practice6.lib;



public class Circle6_2 {
	private int x, y, radius;
	
	public Circle6_2(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
	
	public boolean equals(Object obj) {
		Circle6_2 p = (Circle6_2)obj;
		if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
			return true;
		else 
			return false;
	}
}
