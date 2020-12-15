package CHAPTER11;
import javax.swing.*;
import java.awt.*;

public class Test001_4 extends JFrame {
	
	public Test001_4() {
		super("격자 그리기");
		setContentPane(new Mypanel());
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	}
	class Mypanel extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		
			for(int i=1;i<10;i++) {
				g.drawLine(getWidth()/10*i, 0, getWidth()/10*i,getHeight());
				g.drawLine(0, getHeight()/10*i,getWidth(),getHeight()/10*i);
			}
		
		}
	}
	public static void main(String[] args) {
		new Test001_4();
	}

}
