package CHAPTER6;

class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String toString() {
		return "("+x+","+y+")반지름"+radius;
	}
	public boolean equals(Object obj) {
		Circle a = (Circle)obj;
		Circle b = (Circle)obj;
		if(radius ==a.radius&& radius == b.radius) return true;
		else return false;
	}
}

public class Bonus001 {

	public static void main(String[] args) {

		Circle a = new Circle(1,2,10);
		Circle b = new Circle(5,6,10);
		System.out.println("원 1: "+a);
		System.out.println("원 2: "+b);
		if(a.equals(b))
			System.out.println("같은 원입니다.");
		else
			System.out.println("다른 원입니다.");
	}

}
