package CHAPTER10;

import java.awt.*;

import javax.swing.*;

public class Test001 extends JFrame {
public Test001() {

super("Four Images");
setLayout(new GridLayout(1,4,10,10));

ImageIcon img = new ImageIcon("src/images/one.jpg");
JLabel il = new JLabel(img);
add(il);

add(new JLabel(new ImageIcon("src/images/two.jpg")));
add(new JLabel(new ImageIcon("src/images/three.jpg")));
add(new JLabel(new ImageIcon("src/images/four.jpg")));


setSize(600,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		new Test001();
	}

}
