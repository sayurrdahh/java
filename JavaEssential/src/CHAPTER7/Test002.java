package CHAPTER7;

import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> grade = new ArrayList<Double>(); 
		
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/E)>>");
		for(int i=0;i<5;i++) {
			char a = sc.next().charAt(0);
			if(a=='A')
				grade.add(4.0);
			else if(a=='B')
				grade.add(3.0);
			else if(a=='C')
				grade.add(2.0);
				else if(a=='D')
					grade.add(1.0);
					else if(a=='F')
						grade.add(0.0);
		}

		for(int i=0;i<5;i++) {
			double g = grade.get(i);
			System.out.print(g+" ");
		}
		
	}

}
