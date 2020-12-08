package Bronze3;

import java.util.Scanner;

public class Test1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,w,h;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		System.out.println(Math.min(Math.min(w-x, x), Math.min(h-y, y)));
		sc.close();
	}
}
