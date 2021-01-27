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
			System.out.println("����üũ �����Դϴ�.");	
			System.out.println("words.txt �б� �Ϸ�");
			socket=listener.accept();
		
			System.out.println("Ŭ���̾�Ʈ �����");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				String outputMessage;
				if(inputMessage.equalsIgnoreCase("�׸�")) {
					System.out.println("Ŭ���̾�Ʈ ���� ����");
					break;
				}
				else {
					for(int i=0;i<v.size();i++) {
						if(v.get(i).equals(inputMessage)) {
							outputMessage="YES";
							System.out.println("��û�ܾ�"+inputMessage+outputMessage);
							out.flush();
							break;
						}
						else
							count++;
					}
					if (count == v.size()) {
						outputMessage="NO";
						System.out.println("��û�ܾ�"+inputMessage+outputMessage);
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
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}
