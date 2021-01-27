package CHAPTER9;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Test004 extends JFrame implements KeyListener{

	JLabel la = new JLabel("Love Java");

	
	public Test004() {

	super("+,-키로 폰트 크기조절");
	setLayout(new FlowLayout());
	la.setFont(new Font("Arial",Font.PLAIN,10));
	add(la);

	la.addKeyListener(this);
	
	la.setFocusable(true);
	la.requestFocus();
	
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test004();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Font f = la.getFont();
		int size = f.getSize();
		if(e.getKeyChar()=='+')
		la.setFont(new Font("Arial",Font.PLAIN,size+5));
		if(e.getKeyChar()=='-'&&size>5)
		la.setFont(new Font("Arial",Font.PLAIN,size-5));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
