package Bronze3;

import java.util.Scanner;

public class Test1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Y=0, M = 0, yy = 0, mm = 0, time;
		int N =sc.nextInt(); //몇번 통화했는지
		for(int i=0;i<N;i++) {
			time = sc.nextInt();
				yy=(time/30)*10+10;
				Y += yy;
				mm=(time/60)*15+15;
				M += mm;
		}
		if(Y<M)
			System.out.println("Y "+Y);
		else if(Y==M)
			System.out.println("Y M "+M);
		else if(Y>M)
			System.out.println("M "+M);
	}
}