package CHAPTER13;

import java.io.*;
public class Test001 {

	public static void main(String[] args) {

		FileReader fin = null;
		try {
		fin = new FileReader("C:\\temp\\sample.txt");
		int n; 
		while((n=fin.read())!=-1) {
			System.out.print((char)n);
		}
		fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		
	}

}
