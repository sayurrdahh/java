package CHAPTER6;

import java.util.*;

public class Test004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a =a.trim(); //��������
		int n = 0;
		StringTokenizer st = new StringTokenizer(a,"+");//a���ڿ��� +�� ������\
		while(st.hasMoreTokens()) {
		String token = st.nextToken(); //��ū���
		n = Integer.parseInt(token); //��ū�� n����
		n += n;
		}
		System.out.println("���� "+n);
	}

}
