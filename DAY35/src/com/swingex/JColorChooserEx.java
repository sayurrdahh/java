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
	
	//JMenuBar ��ü ����
	mb = new JMenuBar();
	
	//JMenu ��ü ���� 
	mnuselect = new JMenu("����");
	//JMenuItem ��ü ����
	mnucolor = new JMenuItem("����");
	
	l = new JLabel("���â");
	jta = new JTextArea();
	
	//�޴��� �޴��׸��� �߰� 
	mnuselect.add(mnucolor);
	
	//�޴��� �޴��ٿ� �߰�
	mb.add(mnuselect);
	
	//�����ӿ� �޴��� �߰�
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
			//JColorChooser ��ü�� ����
			JColorChooser chooser =  new JColorChooser();
			Color color = chooser.showDialog(this, "������ ������", Color.blue);
			l.setText("������ ������"+color);
			 jta.setBackground(color); 			
			
		}
	}

	public static void main(String[] args) {

		new JColorChooserEx();
	}

}
