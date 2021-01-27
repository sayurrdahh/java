package CHAPTER6;

class MyPoint {
	private int x,y;
	public MyPoint(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	public String toString() {
		return "MyPoint("+x+","+y+")";
	}
}

public class Test001 {
	
	public static void main(String[] args) {
		
		MyPoint a = new MyPoint(3, 20); 
		System.out.println(a);
	}

}
