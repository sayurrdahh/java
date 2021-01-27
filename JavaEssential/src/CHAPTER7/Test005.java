package CHAPTER7;

import java.util.*;

public class Test005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(sc.next(), sc.nextInt());
		}
		
		Set<String> keys = nations.keySet();//해시맵 h에 있는 모든 키를 set컬렉션으로 리턴
		Iterator<String> it = keys.iterator(); //set에서 문자열을 검색할 수 있는 iterator리턴
		
		int max = 0;
		String max_cont = null;
		while(it.hasNext()) { 
			String key = it.next(); //키
			int value = nations.get(key); //값
			if(max < value) {
				max = value;
				max_cont = key;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + max_cont + ", " + nations.get(max_cont) + ")");
	}
}