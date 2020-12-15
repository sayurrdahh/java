package CHAPTER11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test001_3 extends JFrame{

	public Test001_3() {
		super("¸¶¸§¸ð");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new M());
		
	}
	
	class M extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			int x[] = {this.getWidth()/2,0,this.getWidth()/2,this.getWidth()};
			int y[] = {0,this.getHeight()/2,this.getHeight(),this.getHeight()/2};
			g.drawPolygon(x, y, 4);
			
		}
	}

	public static void main(String[] args) {
		new Test001_3();
	}

}
