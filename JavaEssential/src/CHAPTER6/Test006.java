package CHAPTER6;

import java.util.Scanner;

public class Test006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] game = {"","����","����","��"};
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4)>>");
			int na = sc.nextInt();
			if(na==4) {
				System.out.println("������ �����մϴ�...");
				break;
			}else if(na>0&&na<4) {
			int com = (int)(Math.random()*4);
			String n = game[na];
			String c = game[com];
			System.out.println("����� "+n+": ��ǻ�� "+c);
			if((com-na)==-1||(com-na)==2)
				System.out.println("����ڰ� �̰���ϴ�.");
			else if(com==na)
				System.out.println("�����ϴ�.");
			else
				System.out.println("����ڰ� �����ϴ�.");
			}
		}
	}

}
