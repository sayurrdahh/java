package CHAPTER12;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	
	private JPanel p; //타이머 값이 들어가는 컨테이너
	
	public TimerThread(JPanel p) {
		this.p = p; //타이머 카운트를 출력할 컨테이너
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true) { 
			count++;
			try {
			Thread.sleep(1000); //1초마다 카운트 세주기?
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
} //쓰레드 클래스 끝


public class Test01 extends JFrame{

	public Test01() {
		super("예제 1");
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
