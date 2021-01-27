package CHAPTER14;

import java.io.*;
import java.net.*;
import java.util.*;

public class Test001Client {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost",9999);
			System.out.println("������ �����Ͽ����ϴ�...");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("�ؽ�Ʈ �Է�>>");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("��")) {
					System.out.println("������ �����մϴ�...");
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
			}
		}catch (IOException e) {
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
