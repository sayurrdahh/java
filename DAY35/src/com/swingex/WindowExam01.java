package com.swingex;

import java.awt.*;
import javax.swing.*;

public class WindowExam01 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("���� ������ ���");
		
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		

		String colNames[] = {"�̸�","����","����"};
		
		Object data[][] = {
				{"ȫ�浿",50,'��'},
				{"�Ѹ�",30,'��'},
				{"��",40,'��'},
		};
		
		JTable table = new JTable(data, colNames);
		//������ �׸��� �ִ� 2���� �迭, �÷��� �ִ� 1���� �迭
		
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane,BorderLayout.CENTER);
		JButton button = new JButton("���");
		contentPane.add(button, BorderLayout.SOUTH);
		//��ư�� �����̳��ҿ� �߰�
		
		button.addActionListener(new PrintActionListeer(table));
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
