package Bronze3;

import java.io.BufferedReader;
import java.io.*;

public class Test1284 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(bf.readLine());
			while(N!=0) {
				int sum = 1;
				while(N!=0) {
				int a = N%10;
				if(a==0)
					sum +=4;
				else if(a == 1)
					sum +=2;
				else 
					sum +=3;
				sum++;
				N=N/10;
			}
			System.out.println(sum);
			N = Integer.parseInt(bf.readLine());
			}
		
//		while(true) {
//			int N  = Integer.parseInt(bf.readLine());
//			int sum =0;
//			if(N==0) {
//			System.exit(0);
//			}else{
//				String s = Integer.toString(N);
//				String [] arr = s.split(""); {1,2,0}
//				for(int i=0;i<arr.length;i++) {
//					if(arr[i].equals(0))
//						sum = sum+4;
//					else if(arr[i].equals(1))
//						sum = sum+2;
//					else 
//						sum = sum+3;
//		}	System.out.println(sum+arr.length+1);
//		N = 
//		}
//		}
}
}