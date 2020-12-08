package com.swingex;

import java.awt.*;
import javax.swing.*;

public class WindowExam01 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("시험 응시자 명단");
		
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		

		String colNames[] = {"이름","나이","성별"};
		
		Object data[][] = {
				{"홍길동",50,'남'},
				{"둘리",30,'여'},
				{"고동",40,'남'},
		};
		
		JTable table = new JTable(data, colNames);
		//데이터 항목이 있는 2차원 배열, 컬럼이 있는 1차원 배열
		
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane,BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);
		//버튼을 컨테이너팬에 추가
		
		button.addActionListener(new PrintActionListeer(table));
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
