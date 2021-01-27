package CHAPTER6;

import java.util.*;
public class Bonus002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer(s);
			if(sb.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random()*s.length());
			while(true) {
				int i = (int)(Math.random()*26);
				char c = (char)('a'+i);
				if(!sb.equals(c)) {
					sb.replace(index,index+1,Character.toString(c));
					//바꿀 문자 위치에서 시작해서 1글자만 바꾸는거니까 index+1이 된다.
					//char을 string으로 바꾸기 위해서는 character.tostring을 쓴다.
					break;
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}

}
