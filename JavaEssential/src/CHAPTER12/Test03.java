package CHAPTER12;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Test03 extends JFrame{
	 JLabel WalkingLabel ;
	 String s;
	 int i=1;
	
	public Test03() {
		WalkingLabel = new JLabel("나는 당신을 사랑합니다.");
		s = WalkingLabel.getText();
		
		setLayout(new FlowLayout());
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(WalkingLabel);
		
		Thread tm = new Thread(new thr());
		tm.start();
		
		setVisible(true);
	}
	
	class thr implements Runnable{

		@Override
		public void run() {
			while(true) {
				WalkingLabel.setText(s.substring(0, i));
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					return;
				}
				i++;
				if(i>13) {
					i = 0;
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		new Test03();
	}
	}
