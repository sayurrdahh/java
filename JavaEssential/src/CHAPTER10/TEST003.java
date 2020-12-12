package CHAPTER10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TEST003 extends JFrame implements ItemListener {
	Container c = getContentPane();
	JRadioButton Red = new JRadioButton("Red");
	JRadioButton Blue = new JRadioButton("Blue");

	public TEST003() {

	super("Two RadioButton");
	setVisible(true);
	setSize(200,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	c.setLayout(new FlowLayout());
	
	ButtonGroup g = new ButtonGroup();
	g.add(Red);
	g.add(Blue);
	
	Red.addItemListener(this);
	Blue.addItemListener(this);
	
	c.add(Red);
	c.add(Blue);
	
	}
	public static void main(String[] args) {

		new TEST003();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem()==Red)//이벤트의 발생원을 리턴합니다.
			c.setBackground(Color.red);
		
		else if(e.getItem()==Blue)
			c.setBackground(Color.blue);

	}

}
