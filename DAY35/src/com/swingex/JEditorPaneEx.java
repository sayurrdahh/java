package com.swingex;

import java.awt.*;
import java.io.*;
import java.util.Locale;

import javax.swing.*;

public class JEditorPaneEx extends JFrame {

	public JEditorPaneEx() throws IOException {

		super("JEditorPane");
		
		JEditorPane editorPane = new JEditorPane(); //�������� ������ ���������� Ȱ���ϴ� �� 
		editorPane.setEditable(false); //��Ȱ��ȭ ��Ű�� ��.
		editorPane.setPage("http://www.daum.net");
		JScrollPane sp = new JScrollPane(editorPane);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //�����ٸ� �׻� �������� ����
		sp.setPreferredSize(new Dimension(800,600)); //JScrollPane�� ����� ���� 800 ���� 600 ũ��� ����
		add(sp); 
		
		pack(); //ũ�� �ڵ� ����?
		setLocation(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	
	}
		
	
	public static void main(String[] args) throws IOException{

		new JEditorPaneEx();
	}

}
