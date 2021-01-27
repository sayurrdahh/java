package CHAPTER11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test6 extends JFrame {
	
	public Test6() {
		this.setTitle("�׷��� �̹��� 10% Ȯ��, ��� ���α׷�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private Image img = new ImageIcon("src/images/image2.jpg").getImage();
		private int x = img.getWidth(this), y = img.getHeight(this);
		
		public MyPanel() {
			this.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						x = x + x/10;
						y = y + y/10;
					}
					else if(e.getKeyChar() == '-') {
						x = x - x/10;
						y = y - y/10;
					}
					repaint();
				}
			});
			
			this.setFocusable(true);
			this.requestFocus();
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 10, 10, x, y, this);
		}
	}
	
	public static void main(String[] args) {
		new Test6();
	}
}