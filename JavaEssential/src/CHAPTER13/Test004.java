package CHAPTER13;

import java.io.*;
import java.util.*;

public class Test004 {

	public static void main(String[] args) throws NullPointerException, IOException{
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.print("텍스트 파일 이름을 입력하세요>>");
		String src = sc.next();
		
		Scanner fileScanner = new Scanner(new FileReader(src));
		
		while(fileScanner.hasNext()) { //파일에 읽을 라인이 있을동안.
			String line = fileScanner.nextLine();
			System.out.println(i+" : "+line);
			i++;
		}
		
	}

}
