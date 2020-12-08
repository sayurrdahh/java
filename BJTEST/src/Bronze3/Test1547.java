package Bronze3;

import java.util.Scanner;

public class Test1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [] gong = {1,0,0};
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y =sc.nextInt();
			int temp;
			temp = gong[x-1];
			gong[x-1] = gong[y-1];
			gong[y-1] = temp;
		}
		for(int i=0;i<3;i++) {
			if(gong[i]==1)
				System.out.println(i+1);
		}
	}
}
