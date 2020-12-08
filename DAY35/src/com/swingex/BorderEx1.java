package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx1 extends JFrame {

	private JButton[] jb = new JButton[6];
	
	public BorderEx1() {

	super("Border");
	Container con = this.getContentPane();
	//레이아웃 설정
	con.setLayout(new GridLayout(3, 2, 5, 5));
	//행과 열의 크기를 잡고 컴포넌트 사이의 간격의 설정함E
	for(int i=0;i<6;i++) {
		jb[i] = new JButton((i+1)+"번 버튼");
		con.add(jb[i]);
	}
	//EmptyBorder :아무런 선이나 그림이 없는 빈 공간만 차지하는 경계선
	//EmptyBorder 객체 생성 -- 생성자를 통해서 보더(경계선) 설정
	EmptyBorder eb = new EmptyBorder(10,10,10,10);
	jb[0].setBorder(eb);
	
	LineBorder lb = new LineBorder(Color.pink, 5);
	jb[1].setBorder(lb);
	
	EtchedBorder eb1 = new EtchedBorder();
	jb[2].setBorder(eb1);
	
	//BevelBorder: 약간 경사지게 3차원 효과를 낼 수 있는 경계선
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
