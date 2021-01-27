package CHAPTER6;

import java.util.*;

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a =a.trim(); //공백제거
		int n = 0;
		StringTokenizer st = new StringTokenizer(a,"+");//a문자열을 +로 나눈다\
		while(st.hasMoreTokens()) {
		String token = st.nextToken(); //토큰얻기
		n = Integer.parseInt(token); //토큰을 n으로
		n += n;
		}
		System.out.println("합은 "+n);
	}

}
