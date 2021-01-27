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
			System.out.println("�����Դϴ�. Ŭ���̾�Ʈ�� ��ٸ��ϴ�...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				
				if(Integer.parseInt(inputMessage)<0) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				
				System.out.println("������ "+inputMessage);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
