package CHAPTER9;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test006 extends JFrame implements MouseListener {
	JLabel [] la = new JLabel[12];
	public Test006() {
		super("3X4 color frame");
		setLayout(new GridLayout(4,3));

		for(int i=0;i<12;i++) {
			la[i] = new JLabel(Integer.toString(i));
			add(la[i]);
			la[i].setBackground(Color.white);
			la[i].setOpaque(true);
			la[i].addMouseListener(this);
		}

		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel la = (JLabel) e.getSource();
		
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		la.setBackground(new Color(r,g,b));
		la.setOpaque(true);
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

	public static void main(String[] args) {
		new Test006();
	}

}
