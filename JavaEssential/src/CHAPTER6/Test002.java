package CHAPTER6;

import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		while(true) {
			String a = sc.nextLine(); //���� ����
			if(a.equals("exit")) {
				System.out.println("�����մϴ�...");
				System.exit(0);
			}else {
				StringTokenizer st = new StringTokenizer(a," ");
				s = st.countTokens();			
				System.out.println(s);
			}
	}
		
}
}

