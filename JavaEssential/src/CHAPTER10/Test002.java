package CHAPTER10;

import java.awt.*;
import javax.swing.*;

public class Test002 extends JFrame{

	public Test002() {
		setTitle("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
		JMenuBar mb = new JMenuBar();
		JMenu [] menu = new JMenu[4];
		String [] menuName = { "����", "����", "����", "�Է�" };
		
		for(int i = 0; i < menu.length; i++) {
			menu[i] = new JMenu(menuName[i]);
			mb.add(menu[i]);
			if(menu[i].getText().equals("����")) {
				menu[i].add(new JMenuItem("ȭ��Ȯ��"));
				menu[i].addSeparator();
				menu[i].add(new JMenuItem("������"));
			}
		}
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
	
		new Test002();
		
	}
}
