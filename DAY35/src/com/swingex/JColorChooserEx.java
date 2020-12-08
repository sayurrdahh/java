package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JColorChooserEx extends JFrame implements ActionListener {

	JMenuBar mb;
	JMenu mnuselect;
	JMenuItem mnucolor;
	
	JLabel l;
	JTextArea jta;

	public JColorChooserEx() {

	super("JColorChooser");
	
	//JMenuBar 객체 생성
	mb = new JMenuBar();
	
	//JMenu 객체 생성 
	mnuselect = new JMenu("선택");
	//JMenuItem 객체 생성
	mnucolor = new JMenuItem("색상");
	
	l = new JLabel("출력창");
	jta = new JTextArea();
	
	//메뉴에 메뉴항목을 추가 
	mnuselect.add(mnucolor);
	
	//메뉴를 메뉴바에 추가
	mb.add(mnuselect);
	
	//프레임에 메뉴가 추가
	setJMenuBar(mb);
	
	add("North",l);
	add("Center", jta);
	
	
	setBounds(300,300,300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mnucolor.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == mnucolor ) {
			//JColorChooser 객체를 생성
			JColorChooser chooser =  new JColorChooser();
			Color color = chooser.showDialog(this, "색상을 고르세요", Color.blue);
			l.setText("선택한 색상은"+color);
			 jta.setBackground(color); 			
			
		}
	}

	public static void main(String[] args) {

		new JColorChooserEx();
	}

}
