package com.swingex;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//프레임 분할(수평, 수직)
public class JSplitPaneEx extends JFrame {

	JSplitPane splitPane, splitPane1;
	
	
	public JSplitPaneEx() {

		super("JSplitPane");
	
		JTextArea jta1 = new JTextArea(20,10);
		JScrollPane jta1ScrollPane = new JScrollPane(jta1);

		JTextArea jta2 = new JTextArea(20,10);
		JScrollPane jta2ScrollPane = new JScrollPane(jta2);
		//두 개의 JScrollPane 객체 생성
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				jta1ScrollPane, jta2ScrollPane);
		//수직분할로 JSplitPane객체 생성
		// 수직으로 분할하면 상하로 나눠지는데, 위에는 jta1, 아래는 jta2를 추가하여 JSplitPane객체를 생성 
		
		JTextArea jta3 = new JTextArea(20,10);
		JScrollPane jta3ScrollPane = new JScrollPane(jta3);
		
		splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				splitPane, jta3ScrollPane);
	
		splitPane.setDividerLocation(100);
		//splitPane 의 분할자의 위치를 지정함
		
		splitPane.setPreferredSize(new Dimension(200,200));
		splitPane1.setPreferredSize(new Dimension(400,200));
		
		add(splitPane1);
		
		
		pack();//크기자동조정, setsize 할 필요 없음
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {

		new JSplitPaneEx();
	}

}
