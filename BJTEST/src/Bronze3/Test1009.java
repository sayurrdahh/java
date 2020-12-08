package Bronze3;

import java.util.Scanner;

public class Test1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b,r; 
		int T = 0;

		T = sc.nextInt();
		
		for(int i=0 ;i<T;i++) {
		a = sc.nextInt();
		b = sc.nextInt();
		r=1;

		for( int j =0; j<b; j++) 
			r = (r*a)%10;
		
		if(r==0) r=10;
		System.out.println(r);
		}
		sc.close();
		}
}
