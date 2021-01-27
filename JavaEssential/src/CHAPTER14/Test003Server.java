package CHAPTER14;

import java.io.*;
import java.net.*;
import java.util.*;

public class Test003Server {

	public static void main(String[] args)throws FileNotFoundException  {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket =null;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		Vector<String> v = new Vector<String>();
		
		
		Scanner fileScanner = new Scanner(new FileReader("c:\\dev\\words.txt"));
		
		while(fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			v.add(line);
		}
		try {
			listener = new ServerSocket(9999);
			System.out.println("스펠체크 서버입니다.");	
			System.out.println("words.txt 읽기 완료");
			socket=listener.accept();
		
			System.out.println("클라이언트 연결됨");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				String outputMessage;
				if(inputMessage.equalsIgnoreCase("그만")) {
					System.out.println("클라이언트 연결 종료");
					break;
				}
				else {
					for(int i=0;i<v.size();i++) {
						if(v.get(i).equals(inputMessage)) {
							outputMessage="YES";
							System.out.println("요청단어"+inputMessage+outputMessage);
							out.flush();
							break;
						}
						else
							count++;
					}
					if (count == v.size()) {
						outputMessage="NO";
						System.out.println("요청단어"+inputMessage+outputMessage);
						out.flush();
						break;
					}
					count = 0;
			}
				
			}

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
