package CHAPTER13;

import java.io.*;
import java.util.*;

public class Test004 {

	public static void main(String[] args) throws NullPointerException, IOException{
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.print("�ؽ�Ʈ ���� �̸��� �Է��ϼ���>>");
		String src = sc.next();
		
		Scanner fileScanner = new Scanner(new FileReader(src));
		
		while(fileScanner.hasNext()) { //���Ͽ� ���� ������ ��������.
			String line = fileScanner.nextLine();
			System.out.println(i+" : "+line);
			i++;
		}
		
	}

}
