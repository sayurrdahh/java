package CHAPTER9;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.math.*;

public class Test005 extends JFrame implements MouseListener {
	JLabel la = new JLabel("c");
	//Container c = getContentPane();

	
	public Test005() {
		super("클릭 연습");
	
		setLayout(null);
		la.setBounds(50, 50, 20, 20);
		la.addMouseListener(this);
		add(la);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setFocusable(true);
	requestFocus();
	
	}
	public static void main(String[] args) {
		new Test005();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		JLabel la = (JLabel) e.getSource();
		Container c = la.getParent();//라벨이 들어가는곳을 알려주는건가
		int xBound = c.getWidth() - la.getWidth();
		int yBound = c.getHeight() - la.getHeight();

		int x = (int) (Math.random()*xBound);
		int y = (int) (Math.random()*yBound);
		la.setLocation(x, y);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


}
