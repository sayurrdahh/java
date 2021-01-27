package CHAPTER9;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Bonus1 extends JFrame implements MouseWheelListener {

	JLabel la = new JLabel("Love Java");

	public Bonus1() {
	
	super("마우스 휠을 사용하여 글씨 크기 변경");
	setLayout(new FlowLayout());
	la.setFont(new Font("Arial",Font.PLAIN,10));
	add(la);
	
	la.addMouseWheelListener(this);

	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

		int n = e.getWheelRotation();
		Font f = la.getFont();
		int size = f.getSize();
		
		if(n<0&&size>5) {
			la.setFont(new Font("Arial",Font.PLAIN, size-5));
		} else {
			la.setFont(new Font("Arial",Font.PLAIN, size+5));			
		}
	}

	public static void main(String[] args) {
		new Bonus1();
	}

}
