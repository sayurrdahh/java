package CHAPTER11;

import javax.swing.*;
import java.awt.*;

public class Test003_1 extends JFrame{

	class t3 extends JPanel{

		private ImageIcon icon1 = new ImageIcon("src/images/three.jpg");
		private ImageIcon icon2 = new ImageIcon("src/images/two.jpg");
		private Image image1 = icon1.getImage();
		private Image image2 = icon2.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image1, 0, 0, getWidth()/2, getHeight(),this);
			g.drawImage(image2, getWidth()/2, 0, getWidth()/2, getHeight(),this);
			
		}
	}
	
	public Test003_1() {

		super("두 이미지 나란히");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(new t3());
	}
	
	public static void main(String[] args) {
		new Test003_1();
	}
	

}
