package CHAPTER11;
import javax.swing.*;
import java.awt.*;

public class Test001 extends JFrame {
public Test001() {
	
	super("»ï»ö¿ø");
	setSize(150,150);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setContentPane(new Circle());
	
}
class Circle extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 80, 80, 330, 120);

		g.setColor(Color.blue);
		g.fillArc(20, 20, 80, 80, 90, 120);

		g.setColor(Color.red);
		g.fillArc(20, 20, 80, 80, 210, 120);	
	}
	
	
}
	public static void main(String[] args) {
		new Test001();
	}

}
