package com.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//자주 사용하는 메뉴를 버튼 형태의 모양으로 보여주는 컴포넌트
public class JToolBarEx extends JFrame {

	public JToolBarEx() {

	super("JToolBar");

	JToolBar tbar = new JToolBar();
	tbar.setMargin(new Insets(5,5,5,5));
	//가장자리의 여백을 설정하는 메소드 setMargin()
	//Insets 클래스의 생성자를 이용하여 상 좌 하 우 순으로 여백설정
	
	
	
	JPanel p = new JPanel(new GridLayout(1,0));
	
	JButton bt1 = new JButton("Java");
	JButton bt2 = new JButton("Jsp");
	JButton bt3 = new JButton("Spring");
	
	p.add(bt1);
	p.add(bt2);
	p.add(bt3);
	
	//패널을 툴바에 add() 메소드를 이용하여 추가
	tbar.add(p);
	
	add("North",tbar);
	
	
	setBounds(300,300,200,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new JToolBarEx();
	}

}
