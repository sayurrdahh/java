package com.swingex;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;

public class JFileChooseEx extends JPanel implements ActionListener{

	JButton openButton, saveButton;
	JTextArea jta;
	JFileChooser fc;
	
	public JFileChooseEx() {

		//Frame의 룩앤필을 설정함
		// 새롭게 JFrame이 LOOK & FEEL에 의해 제공되는 윈도우 수식을 갖출지를 설정함
		//윈도우수식: 경계선, 윈도우의 메뉴, 타이틀 등을 의미함
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFileChooser");
		
		setLayout(new BorderLayout());
		
		jta = new JTextArea(5,20);
		jta.setMargin(new Insets(5,5,5,5));
		
		//JFileChooser 객체를 생성
		fc = new JFileChooser();
		openButton = new JButton("open");
		saveButton = new JButton("save");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);

		add(buttonPanel, BorderLayout.NORTH);
		add(jta, BorderLayout.CENTER);
		
		//프레임에 패널 추가
		frame.add(this);
		
		frame.pack();
		frame.setLocation(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		openButton.addActionListener(this);
		saveButton.addActionListener(this);
	
	}
	
	public static void main(String[] args) {

		new JFileChooseEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == openButton) {
			// 파일 다이얼 박스의 열기버튼을 클릭한 경우
			int returnval = fc.showOpenDialog(this);

			if(returnval == JFileChooser.APPROVE_OPTION) {
				// 파일 다이얼로그 박스에서 선택한 파일을 파일 객체로 반환
				File file = fc.getSelectedFile();
				//jta 에 파일 클래스의 getName() 메소드를 이용해서 파일명을 출력
				jta.setText(file.getName()+"\n");
			} 
		} else if(e.getSource() == saveButton) {
			int returnval = fc.showSaveDialog(this);
			
			if(returnval == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				jta.setText(file.getName()+"\n");
			}
		}
	}
}
