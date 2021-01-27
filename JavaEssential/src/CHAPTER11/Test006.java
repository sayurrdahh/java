package CHAPTER11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test006 extends JFrame {

	public Test006() {
		super("그래픽 이미지 10% 확대 축소하기");
		
		setContentPane(new my());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	//	setLocationRelativeTo(getOwner());
		setSize(500,500);
		setVisible(true); //셋콘텐트패인 밑으로?
	}
	
	class my extends JPanel{
		private Image img = new ImageIcon("src/images/image1.jpg").getImage(); //이미지 아이콘의 이미지 불러오기
		private int x = img.getWidth(this), y= img.getHeight(this);

		public my() {
	
			addKeyListener(new KeyAdapter() {
				
				@Override
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
			setFocusable(true);
			requestFocus();
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, x, y, this);
		}
		
	}
	
	public static void main(String[] args) {
		new Test006();
	}

}
