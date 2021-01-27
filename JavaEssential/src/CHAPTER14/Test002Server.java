package CHAPTER14;

import java.io.*;
import java.net.*;
import java.util.*;

public class Test002Server {

	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out=null;
		ServerSocket listener = null;
		Socket socket =null;
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버입니다. 클라이언트를 기다립니다...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				
				if(Integer.parseInt(inputMessage)<0) {
					System.out.println("연결을 종료합니다.");
					break;
				}
				
				System.out.println("누적합 "+inputMessage);
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
