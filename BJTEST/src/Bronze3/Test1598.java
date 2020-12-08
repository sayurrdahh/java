package Bronze3;

import java.util.Scanner;

public class Test1598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int [][] arr = new int[4][2500000];
		int i, j, result=0, xx = 0, xy = 0, yx = 0, yy = 0;
		
for(i=0;i<2500000; i++){
        for(j=0; j<4; j++){
            result=result+1;
            arr[j][i]=result;
        }
    }
for(i=0;i<4; i++){
    for(j=0; j<2500000; j++){
    	 if (x==arr[i][j]) {
             xx  = i;
             xy = j;
         } 
    	 if (y==arr[i][j]) {
             yx  = i;
             yy = j;
           } 
    }
}

int garo = Math.max(xx, yx)-Math.min(xx, yx);
int sero = Math.max(xy, yy)-Math.min(xy, yy);
System.out.println(garo+sero);
	}
}
