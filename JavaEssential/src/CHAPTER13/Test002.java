package CHAPTER13;

import java.io.*;

public class Test002 {

	public static void main(String[] args) {
		
		FileReader in = null;
		try {
			in = new FileReader("c:\\windows\\system.ini");
			int c;
			while((c=in.read())!=-1) {
				if(Character.isLowerCase(c)) {
					c = Character.toUpperCase(c);
					System.out.print((char)c);
				}
			}
				in.close();
			}catch(IOException e) {
				System.out.println("입출력 오류");
			}
		

	}

}
