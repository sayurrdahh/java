package CHAPTER10;

import java.awt.*;
import javax.swing.*;

public class Test002 extends JFrame{

	public Test002() {
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
		JMenuBar mb = new JMenuBar();
		JMenu [] menu = new JMenu[4];
		String [] menuName = { "파일", "편집", "보기", "입력" };
		
		for(int i = 0; i < menu.length; i++) {
			menu[i] = new JMenu(menuName[i]);
			mb.add(menu[i]);
			if(menu[i].getText().equals("보기")) {
				menu[i].add(new JMenuItem("화면확대"));
				menu[i].addSeparator();
				menu[i].add(new JMenuItem("쪽윤곽"));
			}
		}
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
	
		new Test002();
		
	}
}
