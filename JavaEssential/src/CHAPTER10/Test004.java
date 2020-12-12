package CHAPTER10;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test004 extends JFrame implements ItemListener {

	JCheckBox j1 = new JCheckBox("버튼 비활성화");
	JCheckBox j2 = new JCheckBox("버튼 감추기");
	JButton jb = new JButton("test Button");
	
	public Test004() {

	super("CheckBox");
	setSize(300,150);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	
	j1.addItemListener(this);
	j2.addItemListener(this);
	
	add("North",j1);
	add("North",j2);
	add("Center",jb);
	
	}
	public static void main(String[] args) {
		new Test004();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getItem()==j1) {
			if(jb.isEnabled()==true)
			jb.setEnabled(false);
			else
				jb.setEnabled(true);
		}
		if(e.getItem()==j2) {
			if(jb.isVisible()==true)
			jb.setVisible(false);
			else
				jb.setVisible(true);
		}
		
	}

}
