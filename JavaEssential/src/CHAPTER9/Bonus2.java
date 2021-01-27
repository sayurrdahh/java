package CHAPTER9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bonus2 extends JFrame implements ActionListener {

	private JButton btn [] = new JButton [16];
	private String yunsan [] = {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","*","/"};
	JTextField t1 = new JTextField(15);
	JTextField t2 = new JTextField(15);
	
	public Bonus2() {

		super("간단한 계산기");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		  JPanel p1 = new JPanel(new FlowLayout()); 
		  p1.setBackground(Color.gray);
		  JPanel p2 = new JPanel(new GridLayout(4,4,5,5));
			 
		  add("North",p1);
		  add("Center",p2);
		  
		  p1.add(new JLabel("수식")); 
		  p1.add(t1); 
		  p1.add(new JLabel("결과")); 
		  p1.add(t2);
		  
		  for(int i=0;i<16;i++) {
			  btn[i] = new JButton(yunsan[i]);
			  btn[i].addActionListener(this);
			  p2.add(btn[i]);
		  }
		  
		  for(int i=0;i<16;i++) {
			  if(i<12)
				 btn[i].setBackground(Color.LIGHT_GRAY);
			  
			  else
				  btn[i].setBackground(Color.cyan);
		  }
			
			}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case "0" : t1.setText(t1.getText()+"0"); break;
		case "1" :t1.setText(t1.getText()+"1"); break;
		case "2" :t1.setText(t1.getText()+"2");break;
		case "3" :t1.setText(t1.getText()+"3");break;
		case "4" :t1.setText(t1.getText()+"4");break;
		case "5" :t1.setText(t1.getText()+"5");break;
		case "6" :t1.setText(t1.getText()+"6");break;
		case "7" :t1.setText(t1.getText()+"7");break;
		case "8" :t1.setText(t1.getText()+"8");break;
		case "9" :t1.setText(t1.getText()+"9");break;
		case "+" :t1.setText(t1.getText()+"+");break;
		case "-" :t1.setText(t1.getText()+"-");break;
		case "*" :t1.setText(t1.getText()+"*");break;
		case "/" :t1.setText(t1.getText()+"/");break;
		case "CE" : t1.setText(""); break;
		case "계산" :
			if(t1.getText().indexOf("+")!=-1) {
				String[] arr = t1.getText().split("\\+");
				Double a =Double.parseDouble(arr[0]); 
				Double b =Double.parseDouble(arr[1]);
				t2.setText(Double.toString(a+b));
			}else
			if(t1.getText().indexOf("-")!=-1) {
				String[] arr1 = t1.getText().split("\\-");
				Double a =Double.parseDouble(arr1[0]); 
				Double b =Double.parseDouble(arr1[1]);
				t2.setText(Double.toString(a-b));
			}else
			if(t1.getText().indexOf("*")!=-1) {
				String[] arr2 = t1.getText().split("\\*");
				Double a =Double.parseDouble(arr2[0]); 
				Double b =Double.parseDouble(arr2[1]);
				t2.setText(Double.toString(a*b));
			}else
			if(t1.getText().indexOf("/")!=-1) {
				String[] arr3 = t1.getText().split("\\/");
				Double a =Double.parseDouble(arr3[0]); 
				Double b =Double.parseDouble(arr3[1]);
				t2.setText(Double.toString(a/b));
			}
		}
		
		/*
		 * String s = e.getActionCommand(); if(s.equals("CE")) { String ns="";
		 * t1.setText(ns); }
		 */
	}

	public static void main(String[] args) {
		new Bonus2();
	}

}
