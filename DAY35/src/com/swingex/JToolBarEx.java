package com.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//���� ����ϴ� �޴��� ��ư ������ ������� �����ִ� ������Ʈ
public class JToolBarEx extends JFrame {

	public JToolBarEx() {

	super("JToolBar");

	JToolBar tbar = new JToolBar();
	tbar.setMargin(new Insets(5,5,5,5));
	//�����ڸ��� ������ �����ϴ� �޼ҵ� setMargin()
	//Insets Ŭ������ �����ڸ� �̿��Ͽ� �� �� �� �� ������ ���鼳��
	
	
	
	JPanel p = new JPanel(new GridLayout(1,0));
	
	JButton bt1 = new JButton("Java");
	JButton bt2 = new JButton("Jsp");
	JButton bt3 = new JButton("Spring");
	
	p.add(bt1);
	p.add(bt2);
	p.add(bt3);
	
	//�г��� ���ٿ� add() �޼ҵ带 �̿��Ͽ� �߰�
	tbar.add(p);
	
	add("North",tbar);
	
	
	setBounds(300,300,200,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new JToolBarEx();
	}

}
