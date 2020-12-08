package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPanelEx extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	// 메세지 다이얼로그, 확인 다이얼로그, 입력 다이얼로그 , 옵션 다이얼로그
	String [ ] str = {"로그인","회원가입"};
	
	
	
	public JOptionPanelEx() {

		super("JOptionPanel");
		setLayout(new FlowLayout());
	
		//레이아웃 설정
		b1 = new JButton("메세지 다이알로그");
		b2 = new JButton("컨펌 다이알로그");
		b3 = new JButton("인풋 다이알로그");
		b4 = new JButton("옵션 다이알로그");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	
		pack();
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) {
			//이벤트가 발생한 컴포넌트는 b1
			JOptionPane.showMessageDialog(
					this, //MessageDialog를 소유하고 있는 부모 컨포넌트
					"메세지 다이얼로그 입니다.",//메세지 
					"메세지",//메세지의 제목
					JOptionPane.INFORMATION_MESSAGE); //메시지 타입 지정
			}
		else if(e.getSource()==b2) {
			JOptionPane.showConfirmDialog(
					this, 
					"컨펌 다이얼로그 입니다.",//메세지 
					"확인",//메세지의 제목
					JOptionPane.YES_NO_CANCEL_OPTION); //메시지 타입 지정
			}	
		else if(e.getSource()==b3) {
			JOptionPane.showInputDialog(
					this,
					"입력 다이얼로그",
					"입력",
					JOptionPane.YES_NO_OPTION);
		}		else if(e.getSource()==b4) {
			JOptionPane.showOptionDialog(
					this, //부모컴포넌트 
					"옵션 다이얼로그", //메시지
					"옵션",  //다이얼로그 제목
					JOptionPane.YES_NO_CANCEL_OPTION,  //옵션타입
					JOptionPane.INFORMATION_MESSAGE, //메시지타입
					null, //아이콘
					str, //사용자가 선택할 수 있는 객체 배열(str)
					str[0]); //기본적으로 선택할 객체
			}
		
		
		
	}

	public static void main(String[] args) {
		new JOptionPanelEx();
	}

}
