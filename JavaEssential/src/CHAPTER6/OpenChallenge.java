package CHAPTER6;

import java.util.*;

public class OpenChallenge {
	
	//콘솔 창에서 텍스트를 입력받아 하나의 문자열로 리턴하는 코드는 다음 소스를 이용한다. 
	String readString() {
		StringBuffer sb = new StringBuffer(); //키 입력받을 스트링버퍼 생성
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine(); //텍스트 한 라인을 읽는다.
			if(line.equals(";")) //';'만 있는 라인이면
				break; //입력 끝
			sb.append(line); //읽은 라인 문자열을 스트링버퍼에 추가한다.
		}
		return sb.toString(); //스트링버퍼의 문자열을 스트링으로 리턴
	}

	public static void main(String[] args) {
		
		OpenChallenge op = new OpenChallenge();
		String str = op.readString().toUpperCase();
		
		int count[] = new int[26];
		for(int i=0;i<str.length();i++) {
			char n = str.charAt(i);
			if(n>='A'&&n<='Z')
				count[n-'A']++;
		}
		for(int k=65;k<91;k++) {
			System.out.print((char)k);
			System.out.print("("+count[k-'A']+")");
			
			for(int j=0;j<count[k-'A'];j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
	}

}
