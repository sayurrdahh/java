package CHAPTER7;
import java.util.*;

class Location {
	private double x,y;
	public Location(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
}

public class Test007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Location> lo = new ArrayList<Location>();

		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		lo.add(new Location(0,0));
		for(int i=0;i<5;i++) {
			System.out.print(">>");
			lo.add(new Location(sc.nextDouble(),sc.nextDouble()));
		}
		lo.add(new Location(0,0));

		double sum=0;
		for(int i=0;i<lo.size()-1;i++) {
			Location l1 = lo.get(i+1);
			Double x1 = l1.getX();
			Double y1 = l1.getY();
			
			Location l2 = lo.get(i);
			Double x2 = l2.getX();
			Double y2 = l2.getY();
			
			double xx = Math.pow((x1-x2),2);
			double yy = Math.pow((y1-y2),2);
			
			sum +=  Math.sqrt(xx+yy);
		}

		System.out.println("총 이동거리는 "+sum);
		
	}

}
