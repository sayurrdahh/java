package CHAPTER14;

import java.io.*;
import java.net.*;
import java.util.*;

public class Test003Client {

	public static void main(String[] args){
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket =null;
		Scanner sc = new Scanner(System.in);
	
		int count =0;
	
		
		
		try {
			System.out.println("����üũ Ŭ���̾�Ʈ�Դϴ�.");
			socket = new Socket("localhost",9999);
			System.out.println("����üũ ������ �����Ͽ����ϴ�....");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("�ܾ�>>");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("�׸�")) {
					System.out.println("���α׷��� �����մϴ�...");
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				if(socket!=null)socket.close();
			}catch(IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
