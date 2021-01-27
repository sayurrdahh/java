package CHAPTER14;

import java.io.*;

import java.net.*;
import java.util.*;

public class Test002Client {

	public static void main(String[] args) {
		
		BufferedReader in =null;
		BufferedWriter out = null;
		Socket socket =null;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		try {
			socket = new Socket("localhost",9999);
			System.out.println("서버에 접속하였습니다...");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("보낼 정수 입력>>");
			
				String outputMessage = Integer.toString(sc.nextInt());
				
				if(Integer.parseInt(outputMessage)<0){
					System.out.println("서버를 종료합니다...");
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				
				sum += Integer.parseInt(outputMessage);
				out.write(sum+"\n");
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				if(socket!=null)socket.close();
			}catch(IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}

	}

}
