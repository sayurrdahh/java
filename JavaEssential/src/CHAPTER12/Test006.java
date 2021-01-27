package CHAPTER12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test006 extends JFrame {

	public Test006() {
		super("버블 게임");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel chicken = new JLabel(new ImageIcon("src/images/chicken.jpg"));
				int x = e.getX();
				int y = e.getY();
				chicken.setBounds(x, y, 50, 50);
				add(chicken);
				repaint();
				
				Thread t = new Thread(new gochicken(chicken));
				if(t==null||!t.isAlive()) {
					t = new Thread(new gochicken(chicken));
					t.start();
				}
			}
			});
		setSize(400,400);
		setVisible(true);
	}	
		
	private class gochicken implements Runnable{
		
		private JLabel chicken;
		
		public gochicken(JLabel chicken) {
			this.chicken = chicken;
		}
		
		@Override
		public void run() {
			
			while(true) {
				int x = chicken.getX();
				int y = chicken.getY()-5;
				chicken.setLocation(x,y);
				if(chicken.getY()+chicken.getHeight()<0)
					remove(chicken);
		
				try {
					Thread.sleep(20);
				}catch(InterruptedException e) {return;}
				catch(ArrayIndexOutOfBoundsException ee) {return;}
			}
		}
		  
		
	}
	
	public static void main(String[] args) {
		new Test006();
	}

}
