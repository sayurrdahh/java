package CHAPTER7;

import java.util.*;

public class Test006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> h = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ������ �Է� >> ");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			int point = sc.nextInt();
	
			if(h.containsKey(name)) {
				h.put(name, h.get(name) + point);
			}
			else {
				h.put(name, point);
			}
			Set<String> keys = h.keySet(); //�ؽø� H�� �ִ� ��� Ű�� SET�÷������� ����
			Iterator<String> it = keys.iterator(); //SET���� ���ڿ��� �˻��� �� �ִ� ITERATOR����
			while(it.hasNext()) {
				String key = it.next(); //Ű
				int value = h.get(key); //��
				System.out.print("(" + key + "," + value + ") "); //Ű�� ���� ���� ���
			}
			System.out.println();
		}
	}
}