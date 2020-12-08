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
	
	//버튼에 필요한 이미지 아이콘 객체 생성
	icon1 = new ImageIcon("src/image/one.jpg"); //갖고있는 이미지 넣으면 됨
	icon2 = new ImageIcon("src/image/two.jpg");
	
	//JTabbedPane에 필요한 아이콘 객체 생성 
	tabicon = new ImageIcon("src/image/two.jpg");
	
	b1 = new JButton("사진1",icon1);
	b2 = new JButton("사진2",icon2);
	
	//JTabbedPane 객체 생성
	jp = new JTabbedPane();
	
	jp.addTab("탭1", new ImageIcon(" "), b1);
	jp.addTab("탭2", new JPanel().add(new JTextArea(7,20)));
	jp.addTab("탭3", tabicon, b2, "탭에 추가한 사진");
	
	add(jp);
	
	setBounds(300,300,300,300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}
	
	public static void main(String[] args) {

		new JTabbedPanelEx();
		
	}

}
