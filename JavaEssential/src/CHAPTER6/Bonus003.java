package CHAPTER6;

import java.util.Scanner;

public class Bonus003 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		System.out.println("<Enter>�� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		
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
				System.out.print(text+" >>");//���� ���ڿ� ���
		}
		System.out.println("�����մϴ�...");
		sc.close();
	}

}
