package CHAPTER10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test006 extends JFrame implements ItemListener{
	
	JRadioButton j1 = new JRadioButton("demical");
	JRadioButton j2 = new JRadioButton("binary");
	JRadioButton j3 = new JRadioButton("octal");
	JRadioButton j4 = new JRadioButton("hex");

	JTextField src = new JTextField(8);
	JLabel jl = new JLabel("->");
	JTextField dest = new JTextField(8);

	public Test006() {
		super("Digit Changer");
		
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	
		add("North",src);
		add("North",jl);
		add("North",dest);
		
		ButtonGroup g = new ButtonGroup();

		g.add(j1);
		g.add(j2);
		g.add(j3);
		g.add(j4);
		
		j1.addItemListener(this);
		j2.addItemListener(this);
		j3.addItemListener(this);
		j4.addItemListener(this);
		
		add("Center",j1);
		add("Center",j2);
		add("Center",j3);
		add("Center",j4);
		
	}
	public static void main(String[] args) {
		new Test006();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem()==j2) {
			int n = Integer.parseInt(src.getText());
			dest.setText(Integer.toBinaryString(n));
		}
		if(e.getItem()==j3) {
			int n = Integer.parseInt(src.getText());
			dest.setText(Integer.toOctalString(n));
		}	
		if(e.getItem()==j4) {
			int n = Integer.parseInt(src.getText());
			dest.setText(Integer.toHexString(n));
		}
		if(e.getItem()==j1) {
			dest.setText(src.getText());
		}
	}

}
