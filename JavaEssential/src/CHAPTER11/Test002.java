package CHAPTER11;
import javax.swing.*;
import java.awt.*;
public class Test002 extends JFrame{
public Test002() {
	super("이미지 그리기");
	setLayout(new FlowLayout());
	setSize(300,300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setContentPane(new image());
	JButton b = new JButton("Hello");
	add(b);
}

class image extends JPanel {
	private ImageIcon icon = new ImageIcon("src/images/three.jpg"); //이미지 로딩
	private Image im = icon.getImage(); //이미지객체
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		
	}
	
}
	public static void main(String[] args) {
		new Test002();
	}

}
