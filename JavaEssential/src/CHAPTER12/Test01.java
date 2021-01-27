package CHAPTER12;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	
	private JPanel p; //Ÿ�̸� ���� ���� �����̳�
	
	public TimerThread(JPanel p) {
		this.p = p; //Ÿ�̸� ī��Ʈ�� ����� �����̳�
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true) { 
			count++;
			try {
			Thread.sleep(1000); //1�ʸ��� ī��Ʈ ���ֱ�?
			}catch(InterruptedException e) {
				return;
			}
			if(count==10)
				System.exit(0);
			else if(count==9) {
				
				p.setBackground(Color.blue);
			}
			else 
				p.setBackground(Color.yellow);
		}	
	}
} //������ Ŭ���� ��


public class Test01 extends JFrame{

	public Test01() {
		super("���� 1");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		add(p);
		TimerThread th = new TimerThread(p);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		new Test01();
	}

}
