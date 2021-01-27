package CHAPTER13;

import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\");
		File [] sf = f.listFiles();
		long max = 0;
		int num = 0;
		for(int i=0;i<sf.length;i++) {
			
			if(sf[i].length()>max) {
				max = sf[i].length();
				num = i;
			}
		}
		
		System.out.println("가장 큰 파일은"+sf[num].getPath()+" "+max+"바이트");
		
	}

}
