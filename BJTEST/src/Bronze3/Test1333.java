package Bronze3;

import java.io.*;

public class Test1333 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
			
		boolean time[]=new boolean[N*L+5*(N-1)];
		for(int i=0;i<N;i++) {
			int a=(L+5)*i;
			for(int j=a;j<a+L;j++) {
				time[j]=true;
			}
		}
		int answer=0;
		while(answer<time.length) {
			if(!time[answer]) break;
			answer+=D;
		}
		System.out.println(answer);
	}
}