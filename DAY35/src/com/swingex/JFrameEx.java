package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameEx extends JFrame {

	public JFrameEx() {

		super("JFrame");
		
		JButton bt1 = new JButton("Hello Swing North");
		JButton bt2 = new JButton("Hello Swing Center");
		
		//JFrame 프레임에서 getContentPane() 메소드를 통해서 contentPane객체를 얻어옴
		Container con = getContentPane();

		con.add(BorderLayout.NORTH,bt1);
		//con.add("North",bt1);
		add(bt2); //두번째까지만 생략 가능하고 그다음부터는 다시 잡아줘야한다
		
		setSize(200, 200);
		setVisible(true);
		
		//윈도우 창 강제 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new JFrameEx();
		
	}

}
