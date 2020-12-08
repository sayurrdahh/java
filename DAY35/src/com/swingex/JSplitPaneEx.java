package com.swingex;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//������ ����(����, ����)
public class JSplitPaneEx extends JFrame {

	JSplitPane splitPane, splitPane1;
	
	
	public JSplitPaneEx() {

		super("JSplitPane");
	
		JTextArea jta1 = new JTextArea(20,10);
		JScrollPane jta1ScrollPane = new JScrollPane(jta1);

		JTextArea jta2 = new JTextArea(20,10);
		JScrollPane jta2ScrollPane = new JScrollPane(jta2);
		//�� ���� JScrollPane ��ü ����
		
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
				jta1ScrollPane, jta2ScrollPane);
		//�������ҷ� JSplitPane��ü ����
		// �������� �����ϸ� ���Ϸ� �������µ�, ������ jta1, �Ʒ��� jta2�� �߰��Ͽ� JSplitPane��ü�� ���� 
		
		JTextArea jta3 = new JTextArea(20,10);
		JScrollPane jta3ScrollPane = new JScrollPane(jta3);
		
		splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				splitPane, jta3ScrollPane);
	
		splitPane.setDividerLocation(100);
		//splitPane �� �������� ��ġ�� ������
		
		splitPane.setPreferredSize(new Dimension(200,200));
		splitPane1.setPreferredSize(new Dimension(400,200));
		
		add(splitPane1);
		
		
		pack();//ũ���ڵ�����, setsize �� �ʿ� ����
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {

		new JSplitPaneEx();
	}

}
