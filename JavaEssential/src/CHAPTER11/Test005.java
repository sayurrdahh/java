package CHAPTER11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Test005 extends JFrame{

	class mypanel extends JPanel{
		
		private Vector<Point> vstart = new Vector<Point>(); 
		
		public mypanel() {
		
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Point startp = e.getPoint();
					vstart.add(startp);
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.magenta);
			for(int i=0;i<vstart.size()-1;i++) {
				Point s = vstart.elementAt(i);
				Point ss = vstart.elementAt(i+1);
				g.drawLine((int)s.getX(),(int)s.getY(), (int)ss.getX(),(int)ss.getY());
			}
		}
	}
	public Test005() {
		super("마우스로 페다각형 그리기");
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new mypanel());
	}
	public static void main(String[] args) {
	new Test005();	
	}
}
