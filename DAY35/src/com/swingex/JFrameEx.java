package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameEx extends JFrame {

	public JFrameEx() {

		super("JFrame");
		
		JButton bt1 = new JButton("Hello Swing North");
		JButton bt2 = new JButton("Hello Swing Center");
		
		//JFrame �����ӿ��� getContentPane() �޼ҵ带 ���ؼ� contentPane��ü�� ����
		Container con = getContentPane();

		con.add(BorderLayout.NORTH,bt1);
		//con.add("North",bt1);
		add(bt2); //�ι�°������ ���� �����ϰ� �״������ʹ� �ٽ� �������Ѵ�
		
		setSize(200, 200);
		setVisible(true);
		
		//������ â ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new JFrameEx();
		
	}

}
