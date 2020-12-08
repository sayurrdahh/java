package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx1 extends JFrame {

	private JButton[] jb = new JButton[6];
	
	public BorderEx1() {

	super("Border");
	Container con = this.getContentPane();
	//���̾ƿ� ����
	con.setLayout(new GridLayout(3, 2, 5, 5));
	//��� ���� ũ�⸦ ��� ������Ʈ ������ ������ ������E
	for(int i=0;i<6;i++) {
		jb[i] = new JButton((i+1)+"�� ��ư");
		con.add(jb[i]);
	}
	//EmptyBorder :�ƹ��� ���̳� �׸��� ���� �� ������ �����ϴ� ��輱
	//EmptyBorder ��ü ���� -- �����ڸ� ���ؼ� ����(��輱) ����
	EmptyBorder eb = new EmptyBorder(10,10,10,10);
	jb[0].setBorder(eb);
	
	LineBorder lb = new LineBorder(Color.pink, 5);
	jb[1].setBorder(lb);
	
	EtchedBorder eb1 = new EtchedBorder();
	jb[2].setBorder(eb1);
	
	//BevelBorder: �ణ ������� 3���� ȿ���� �� �� �ִ� ��輱
	BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
	jb[3].setBorder(bb);
	
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {

		new BorderEx1();
	}

}
