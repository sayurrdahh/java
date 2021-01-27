package CHAPTER9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test002 extends JFrame implements KeyListener {
	Container c = getContentPane();
	public Test002() {
		super("키 누르기");


		c.setBackground(Color.cyan);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode()==e.VK_R) {
			c.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		c.setBackground(Color.cyan);

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Test002();
	}

}
