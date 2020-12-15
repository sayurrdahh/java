package CHAPTER11;

import javax.swing.*;
import java.awt.*;

public class Test003_2 extends JFrame {

class MyPanel extends JPanel{
	private ImageIcon icon1 = new ImageIcon("src/images/three.jpg");
	private ImageIcon icon2 = new ImageIcon("src/images/four.jpg");
	private Image im1 = icon1.getImage();
	private Image im2 = icon2.getImage();
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(im1, 0, 0, getWidth(), getHeight()/2, this);
		g.drawImage(im2, 0, getHeight()/2, getWidth(), getHeight()/2, this);
	}
	
}
	public Test003_2() {
		super("두 이미지 밑으로 나란히 출력");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
	}
	
	public static void main(String[] args) {
		new Test003_2();
	}

}
