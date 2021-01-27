package CHAPTER12;

import java.awt.*;
import javax.swing.*;

	
public class Test02 extends JFrame{
	
	public Test02() {
		super("Test2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new Circle());
		
		Thread t = new Thread(new thread());
		t.start();
		
		setVisible(true);
		setSize(400,400);	
	}

	private class Circle extends JPanel  {
	
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int	x = (int)(Math.random()*(getWidth()-50));
			int y = (int)(Math.random()*(getHeight()-50));
			g.setColor(Color.magenta);
			g.drawOval(x,y, 50, 50);
		}
	}
	private class thread implements Runnable{
		public void run() {
			while(true) {
				repaint();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

	public static void main(String[] args) {
		new Test02();
	}

}
