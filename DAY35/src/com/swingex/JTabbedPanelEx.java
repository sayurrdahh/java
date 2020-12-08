package com.swingex;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JTabbedPanelEx extends JFrame{

	ImageIcon icon1, icon2, tabicon;
	JButton b1, b2;
	JTabbedPane jp;
	
	public JTabbedPanelEx() {

	super("JTabbedPanel");
	
	//��ư�� �ʿ��� �̹��� ������ ��ü ����
	icon1 = new ImageIcon("src/image/one.jpg"); //�����ִ� �̹��� ������ ��
	icon2 = new ImageIcon("src/image/two.jpg");
	
	//JTabbedPane�� �ʿ��� ������ ��ü ���� 
	tabicon = new ImageIcon("src/image/two.jpg");
	
	b1 = new JButton("����1",icon1);
	b2 = new JButton("����2",icon2);
	
	//JTabbedPane ��ü ����
	jp = new JTabbedPane();
	
	jp.addTab("��1", new ImageIcon(" "), b1);
	jp.addTab("��2", new JPanel().add(new JTextArea(7,20)));
	jp.addTab("��3", tabicon, b2, "�ǿ� �߰��� ����");
	
	add(jp);
	
	setBounds(300,300,300,300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
	
	public static void main(String[] args) {

		new JTabbedPanelEx();
		
	}

}
