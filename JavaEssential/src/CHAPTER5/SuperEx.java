package CHAPTER5;

class Point {
	private int x,y;
	public Point() { //생성자 , 클래스 이름과 동일해야함, 매개변수 없음
		this.x = this.y = 0; //x와 y의 초기화작업
	}
	
	public Point(int x, int y) { //생성자 2, 클래스 이름과 동일, 뒤에 괄호안에 들어가는 매개변수가 다르면 여러개 쓸 수 있음.
		this.x=x; this.y=y;
	}
	
	public void showPoint () { //public 접근지정자 / void 리턴 타입 없음 / showPoint 메소드 이름 / ()메소드 인자 없음
		System.out.println("("+x+","+y+")");
		
	}
}

class ColorPoint extends Point {
	private String color;//정의 색
	public ColorPoint(int x, int y, String color) { //생성자, 매개변수 
		super(x,y);//Point 생성자 Point(x,y)호출
		this.color = color;
	}
	public void ColorShowPoint() { //public은 접근지정자/void는 리턴 타입 없음을 의미/ColorShowPoint는 메소드 이름/메소드 인자 없음.
		System.out.print(color);
		showPoint();
	}
}
public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.ColorShowPoint();

	}

}
