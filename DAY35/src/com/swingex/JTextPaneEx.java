package com.swingex;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionListener;

public class JTextPaneEx {

	public static void main(String[] args) {

		JFrame frame = new JFrame("HI");
		
		frame.setPreferredSize(new Dimension(200,70));
		frame.setLocation(500,400);
		Container con = frame.getContentPane();
		
		JTextField text = new JTextField();
		JButton button = new JButton("Ȯ��");
		JLabel label = new JLabel("Hello");
		
		con.add(text, BorderLayout.CENTER);
		con.add(button, BorderLayout.EAST);
		con.add(label, BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		button.addActionListener(listener);
		
		frame.pack(); //�������� ������ ũ��� ����� �޼ҵ�
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
