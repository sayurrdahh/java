package CHAPTER7;

import java.util.*;

public class Test003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라떼", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while(true) {
			System.out.print("주문>>");
			String jm = sc.next();
			if(jm.equals("그만")) {
				break;
			}else {
			int price = h.get(jm);
			System.out.println(jm+"는 "+price+"입니다.");
		}
		}
	}

}
