package CHAPTER6;

import java.util.*;

public class OpenChallenge {
	
	//�ܼ� â���� �ؽ�Ʈ�� �Է¹޾� �ϳ��� ���ڿ��� �����ϴ� �ڵ�� ���� �ҽ��� �̿��Ѵ�. 
	String readString() {
		StringBuffer sb = new StringBuffer(); //Ű �Է¹��� ��Ʈ������ ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine(); //�ؽ�Ʈ �� ������ �д´�.
			if(line.equals(";")) //';'�� �ִ� �����̸�
				break; //�Է� ��
			sb.append(line); //���� ���� ���ڿ��� ��Ʈ�����ۿ� �߰��Ѵ�.
		}
		return sb.toString(); //��Ʈ�������� ���ڿ��� ��Ʈ������ ����
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
