package CHAPTER7;

import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("����������", 2000);
		h.put("�Ƹ޸�ī��", 2500);
		h.put("īǪġ��", 3000);
		h.put("ī���", 3500);
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��� �ֽ��ϴ�.");
		while(true) {
			System.out.print("�ֹ�>>");
			String jm = sc.next();
			if(jm.equals("�׸�")) {
				break;
			}else {
			int price = h.get(jm);
			System.out.println(jm+"�� "+price+"�Դϴ�.");
		}
		}
	}

}
