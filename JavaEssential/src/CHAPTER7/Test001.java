package CHAPTER7;

import java.util.*;

public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Double> v = new Vector<Double>();
		Double m=0.0;
		for(int i=0;i<5;i++) {
			v.add(sc.nextDouble());
		}
		for(int i=0;i<4;i++) {
		m = Math.max(v.get(i),v.get(i+1));
		}
		System.out.println("가장 큰 수는 "+m);
}
}