package CHAPTER6;

import java.util.Scanner;

public class Test006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] game = {"","가위","바위","보"};
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int na = sc.nextInt();
			if(na==4) {
				System.out.println("게임을 종료합니다...");
				break;
			}else if(na>0&&na<4) {
			int com = (int)(Math.random()*4);
			String n = game[na];
			String c = game[com];
			System.out.println("사용자 "+n+": 컴퓨터 "+c);
			if((com-na)==-1||(com-na)==2)
				System.out.println("사용자가 이겼습니다.");
			else if(com==na)
				System.out.println("비겼습니다.");
			else
				System.out.println("사용자가 졌습니다.");
			}
		}
	}

}
