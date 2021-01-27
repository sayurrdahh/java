package CHAPTER7;

import java.util.*;

public class Test006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		System.out.println("** 포인트 관리 프로그램입니다 **");

		while (true) {
			System.out.print("이름과 포인터 입력 >> ");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			int point = sc.nextInt();
	
			if(h.containsKey(name)) {
				h.put(name, h.get(name) + point);
			}
			else {
				h.put(name, point);
			}
			Set<String> keys = h.keySet(); //해시맵 H에 있는 모든 키를 SET컬렉션으로 리턴
			Iterator<String> it = keys.iterator(); //SET에서 문자열을 검색할 수 있는 ITERATOR리턴
			while(it.hasNext()) {
				String key = it.next(); //키
				int value = h.get(key); //값
				System.out.print("(" + key + "," + value + ") "); //키와 값의 쌍의 출력
			}
			System.out.println();
		}
	}
}