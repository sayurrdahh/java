package com.swingex;

import javax.swing.*;
import java.awt.event.*;

public class JProgressBarEx extends JFrame implements ActionListener {

	private JProgressBar progressBar1;
	private JButton startButton;
	private int currentValue ;
	//��ư�� ���������� ���� ��ȭ
	public JProgressBarEx() {
		
		super("JProgressBarEx()");
		
		startButton = new JButton("Start");
		progressBar1 = new JProgressBar(0, 100);
		//�ּҰ��� �ִ밪�� ������ ���α׷����� ��ü ����
		progressBar1.setValue(0);
		//���α׷������� �ʱⰪ ����
		progressBar1.setStringPainted(true);
		//���α׷����� ���� ������� 
	
		JPanel panel = new JPanel();
		panel.add(startButton);
		panel.add(progressBar1);
		add(panel);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���۹�ư�� �̺�Ʈ ���
		startButton.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		currentValue += 10;
		//	currentValue���� 10��ŭ ���� 

		progressBar1.setValue(currentValue);
		//	���α׷����� ���� �����Ŵ 

		if(currentValue == 100) currentValue=0;
		//���� ���� 100�� �Ǹ� �ٽ� ���� ���� 0���� ����
		
		
	}

	public static void main(String[] args) {

		new JProgressBarEx();
	}

}
