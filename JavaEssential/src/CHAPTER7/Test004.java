package CHAPTER7;

import java.util.*;

public class Test004 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("2000~2009년까지 1년 단위로 키 입력");
		System.out.print(">> ");
		for(int i = 0; i < 10; i++) {
			v.add(sc.nextInt());
		}
		
		int max = 0;
		int max_index = 0;
		for(int i = 0; i < 9; i++) {
			if(max < (v.get(i+1) - v.get(i))){
				max = v.get(i+1) - v.get(i);
				max_index = i;
			}
		}	
		System.out.println("가장 키가 많이 자란 년도는 200" + max_index + "년 " + (float)max + "cm");
	}
}

