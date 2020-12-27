package CHAPTER12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OpenChallenge12 extends JFrame{

	private JLabel avatar;
	
	
	public OpenChallenge12() {
		setLayout(null);
		setContentPane(new GamePanel());
		setSize(400,400);
		Thread t = new Thread(new Monster());
		t.start();
		
		setVisible(true);
		
	}
	
	private class Monster extends Thread{

		private JLabel monster;
		
		public Monster() {
			
			int xx = (int)(Math.random()*(getWidth()-15));
			int yy = (int)(Math.random()*(getHeight()-15));
			monster = new JLabel("M");	
			monster.setBounds(xx, yy, 15, 15);
			monster.setForeground(Color.blue);
			add(monster);
			
		}
			public void run() {
				
				
				while(true) {
					if(avatar.getX()<monster.getX()) 
						monster.setLocation(monster.getX()-10, monster.getY());
					
					if(avatar.getX()>monster.getX())
						monster.setLocation(monster.getX()+10, monster.getY());
					
					if(avatar.getY()<monster.getY())
						monster.setLocation(monster.getX(), monster.getY()-10);
					
					if(avatar.getY()>monster.getY())
						monster.setLocation(monster.getX(), monster.getY()+10);
					monster.getParent().repaint();
					
					try {
					
						Thread.sleep(200);
					
					}catch(InterruptedException e) {return;}
				}
			}
		
		
		}
		
	
	private class GamePanel extends JPanel {

		
		public GamePanel() {
			
			setLayout(null);
			setSize(400,400);
			
			int x = (int)(Math.random()*(getWidth()-15));
			int y = (int)(Math.random()*(getHeight()-15));
			
			avatar = new JLabel("@");
			avatar.setBounds(x, y, 15, 15);
			avatar.setForeground(Color.red);
		
			add(avatar);

			addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar()=='q')
						System.exit(0);
					else if(e.getKeyCode()==e.VK_UP) {
						avatar.setLocation(avatar.getX(), avatar.getY()-5);
					}
					else if(e.getKeyCode()==e.VK_LEFT) {
							avatar.setLocation(avatar.getX()-5, avatar.getY());
					}
					else if(e.getKeyCode()==e.VK_RIGHT) {
							avatar.setLocation(avatar.getX()+5, avatar.getY());
					}	
					else if(e.getKeyCode()==e.VK_DOWN)
							avatar.setLocation(avatar.getX(), avatar.getY()+5);
				}
			});
			
		requestFocus();
			setFocusable(true);
			
		}

	}
	

	public static void main(String[] args) {
		new OpenChallenge12();
	}

}
