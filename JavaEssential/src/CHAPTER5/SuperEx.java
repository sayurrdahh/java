package CHAPTER5;

class Point {
	private int x,y;
	public Point() { //������ , Ŭ���� �̸��� �����ؾ���, �Ű����� ����
		this.x = this.y = 0; //x�� y�� �ʱ�ȭ�۾�
	}
	
	public Point(int x, int y) { //������ 2, Ŭ���� �̸��� ����, �ڿ� ��ȣ�ȿ� ���� �Ű������� �ٸ��� ������ �� �� ����.
		this.x=x; this.y=y;
	}
	
	public void showPoint () { //public ���������� / void ���� Ÿ�� ���� / showPoint �޼ҵ� �̸� / ()�޼ҵ� ���� ����
		System.out.println("("+x+","+y+")");
		
	}
}

class ColorPoint extends Point {
	private String color;//���� ��
	public ColorPoint(int x, int y, String color) { //������, �Ű����� 
		super(x,y);//Point ������ Point(x,y)ȣ��
		this.color = color;
	}
	public void ColorShowPoint() { //public�� ����������/void�� ���� Ÿ�� ������ �ǹ�/ColorShowPoint�� �޼ҵ� �̸�/�޼ҵ� ���� ����.
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
