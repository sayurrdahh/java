package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx2 extends JFrame {

	private JTextField jtf = new JTextField();
	private Icon icon = new ImageIcon("src/img/one.jpg");
	private Icon icon1 = new ImageIcon("src/img/two.jpg");
	
	private JButton jbt = new JButton("»Æ¿Œ",icon);
	private JLabel jl = new JLabel("Test", JLabel.CENTER);
	
	
	
	public BorderEx2() {

		super("BorderEx2");
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North",jtf);
		
		TitledBorder tb = new TitledBorder(new EtchedBorder(),"ID",TitledBorder.LEFT,TitledBorder.TOP);
		jtf.setBorder(tb);
		
		con.add("Center",jbt);
		
		MatteBorder mb = new MatteBorder(30,30,30,30,icon1);
		jbt.setBorder(mb);
		
		setSize(300,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {

		new BorderEx2();
	}

}
