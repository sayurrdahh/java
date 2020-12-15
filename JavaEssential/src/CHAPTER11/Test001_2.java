package CHAPTER11;

import javax.swing.*;//jframe
import java.awt.*;//graphic

public class Test001_2 extends JFrame{

	public Test001_2() {
		super("»ï»ö¿ø");
		setSize(200,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new fiveCircle());
	}
	
	class fiveCircle extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawOval(20, 20, 40, 40);
			
			g.setColor(Color.black);
			g.drawOval(70, 20, 40, 40);

			g.setColor(Color.red);
			g.drawOval(120, 20, 40, 40);
			
			g.setColor(Color.yellow);
			g.drawOval(43, 40, 40, 40);
			
			g.setColor(Color.green);
			g.drawOval(95, 40, 40, 40);
		}	
	}
	public static void main(String[] args) {
		new Test001_2();
	}

}
