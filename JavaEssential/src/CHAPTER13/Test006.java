package CHAPTER13;

import java.io.*;

import java.util.*;

public class Test006 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<String>();
		int count =0;
		
		Scanner fileScanner = new Scanner(new FileReader("c:\\dev\\words.txt"));
		while(fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			v.add(line);
		}
		
		while(true) {
		System.out.print("단어>>");
		String s = sc.next();
		
		if(s.equals("exit")) {
			System.out.println("종료합니다...");
			System.exit(0);
		} else {
		for(int i=0;i<v.size();i++) {
			if(v.get(i).contains(s))
				System.out.println(v.get(i));
			else
				count++;
		}
		if (count == v.size()) 
			System.out.println("발견할 수 없음");
		}
		count = 0;
	}
	}
	}
