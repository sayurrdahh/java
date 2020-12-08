package com.swingex;

import javax.swing.*;
import java.awt.event.*;

public class JProgressBarEx extends JFrame implements ActionListener {

	private JProgressBar progressBar1;
	private JButton startButton;
	private int currentValue ;
	//버튼을 누를때마다 값이 변화
	public JProgressBarEx() {
		
		super("JProgressBarEx()");
		
		startButton = new JButton("Start");
		progressBar1 = new JProgressBar(0, 100);
		//최소값과 최대값을 가지는 프로그래스바 객체 생성
		progressBar1.setValue(0);
		//프로그래스바의 초기값 설정
		progressBar1.setStringPainted(true);
		//프로그래스바 내의 진행률을 
	
		JPanel panel = new JPanel();
		panel.add(startButton);
		panel.add(progressBar1);
		add(panel);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//시작버튼에 이벤트 등록
		startButton.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		currentValue += 10;
		//	currentValue값이 10만큼 증가 

		progressBar1.setValue(currentValue);
		//	프로그래스바 값을 변경시킴 

		if(currentValue == 100) currentValue=0;
		//현재 값이 100이 되면 다시 현재 값을 0으로 설정
		
		
	}

	public static void main(String[] args) {

		new JProgressBarEx();
	}

}
