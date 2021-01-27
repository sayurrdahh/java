package CHAPTER6;

import java.util.Scanner;

public class Bonus003 {

	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		
		while(true){
			String key = sc.nextLine();
			if(key.equals("")) {
				String first = text.substring(0,1);
				String last = text.substring(1);
				text = last.concat(first);
				System.out.println(text+" >>");
			}
			else if(key.equals("q"))
				break;
			else
				System.out.print(text+" >>");//현재 문자열 출력
		}
		System.out.println("종료합니다...");
		sc.close();
	}

}
