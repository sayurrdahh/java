package CHAPTER9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test003 extends JFrame implements MouseMotionListener, MouseListener {
	Container c  = getContentPane();
	public Test003() {

		super("µå·¡±ëµ¿¾È »ö ¹Ù²î±â");
		
		c.setBackground(Color.green);
		c.addMouseMotionListener(this);
		c.addMouseListener(this);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Test003();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		c.setBackground(Color.yellow);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		c.setBackground(Color.green);
	}

}
