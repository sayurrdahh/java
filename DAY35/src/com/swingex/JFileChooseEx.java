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

		//Frame�� ������� ������
		// ���Ӱ� JFrame�� LOOK & FEEL�� ���� �����Ǵ� ������ ������ �������� ������
		//���������: ��輱, �������� �޴�, Ÿ��Ʋ ���� �ǹ���
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFileChooser");
		
		setLayout(new BorderLayout());
		
		jta = new JTextArea(5,20);
		jta.setMargin(new Insets(5,5,5,5));
		
		//JFileChooser ��ü�� ����
		fc = new JFileChooser();
		openButton = new JButton("open");
		saveButton = new JButton("save");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);

		add(buttonPanel, BorderLayout.NORTH);
		add(jta, BorderLayout.CENTER);
		
		//�����ӿ� �г� �߰�
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
			// ���� ���̾� �ڽ��� �����ư�� Ŭ���� ���
			int returnval = fc.showOpenDialog(this);

			if(returnval == JFileChooser.APPROVE_OPTION) {
				// ���� ���̾�α� �ڽ����� ������ ������ ���� ��ü�� ��ȯ
				File file = fc.getSelectedFile();
				//jta �� ���� Ŭ������ getName() �޼ҵ带 �̿��ؼ� ���ϸ��� ���
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
