package CHAPTER7;

import java.util.*;

public class Test005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���.");
		for(int i = 0; i < 5; i++) {
			System.out.print("���� �̸�, �α� >> ");
			nations.put(sc.next(), sc.nextInt());
		}
		
		Set<String> keys = nations.keySet();//�ؽø� h�� �ִ� ��� Ű�� set�÷������� ����
		Iterator<String> it = keys.iterator(); //set���� ���ڿ��� �˻��� �� �ִ� iterator����
		
		int max = 0;
		String max_cont = null;
		while(it.hasNext()) { 
			String key = it.next(); //Ű
			int value = nations.get(key); //��
			if(max < value) {
				max = value;
				max_cont = key;
			}
		}
		
		System.out.println("���� �α��� ���� ����� (" + max_cont + ", " + nations.get(max_cont) + ")");
	}
}