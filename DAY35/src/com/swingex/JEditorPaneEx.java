package com.swingex;

import java.awt.*;
import java.io.*;
import java.util.Locale;

import javax.swing.*;

public class JEditorPaneEx extends JFrame {

	public JEditorPaneEx() throws IOException {

		super("JEditorPane");
		
		JEditorPane editorPane = new JEditorPane(); //여러가지 형태의 문서형식을 활용하는 것 
		editorPane.setEditable(false); //비활성화 시키고 들어감.
		editorPane.setPage("http://www.daum.net");
		JScrollPane sp = new JScrollPane(editorPane);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //수직바를 항상 나오도록 정함
		sp.setPreferredSize(new Dimension(800,600)); //JScrollPane의 사이즈를 가로 800 세로 600 크기로 정함
		add(sp); 
		
		pack(); //크기 자동 조절?
		setLocation(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	
	}
		
	
	public static void main(String[] args) throws IOException{

		new JEditorPaneEx();
	}

}
