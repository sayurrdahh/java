package Bronze3;

import java.util.Scanner;

public class Test1703 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			int a = sc.nextInt();
			int r = 1; 
			if(a==0)
				System.exit(0);
			else {
				int [] b = new int [a];
				int [] c = new int [a];
				for(int i=0;i<a;i++) {
					b[i] = sc.nextInt();
					c[i] = sc.nextInt();
				}				
				for(int i=0;i<a;i++) {
					r = r*b[i];
					r = r-c[i];
				}
				System.out.println(r+" ");
			}
		}
	}
}
