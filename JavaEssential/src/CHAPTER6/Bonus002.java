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
				System.out.println("�����մϴ�...");
				break;
			}
			int index = (int)(Math.random()*s.length());
			while(true) {
				int i = (int)(Math.random()*26);
				char c = (char)('a'+i);
				if(!sb.equals(c)) {
					sb.replace(index,index+1,Character.toString(c));
					//�ٲ� ���� ��ġ���� �����ؼ� 1���ڸ� �ٲٴ°Ŵϱ� index+1�� �ȴ�.
					//char�� string���� �ٲٱ� ���ؼ��� character.tostring�� ����.
					break;
				}
			}
			System.out.println(sb);
		}
		sc.close();
	}

}
