package com.swingex;

import java.awt.event.*;
import javax.swing.*;

public class ConfirmButtonActionListener implements ActionListener {

	JTextField text;
	JLabel label;
	
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		
		this.text = text;
		this.label = label;
	
	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		String name = text.getText();
		label.setText("Hello "+name);
	}

}
