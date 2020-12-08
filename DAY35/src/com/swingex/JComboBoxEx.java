package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JComboBoxEx extends JFrame{

	public JComboBoxEx() {

	super("JComboBox");
	//레이아웃 설정
	setLayout(new FlowLayout());
	
	//아이템 설정
	String [] citems = {"one", "two", "three","four","five"};
	//String 배열로 JComboBox 객체 생성 
	JComboBox combo = new JComboBox(citems);
	add(combo);
	
	DefaultComboBoxModel cmodel = new DefaultComboBoxModel();
	
	cmodel.addElement("chicken");
	cmodel.addElement("potato");

	combo = new JComboBox();
	//콤보박스에 모델을 설정하면 콤보 자료 추가 
	combo.setModel(cmodel);
	
	DefaultComboBoxModel cxmodel = 
			(DefaultComboBoxModel)combo.getModel();
	//getModel() 메소드로 DefaultComboBoxModel 객체를 반환 받음
	
	//getModel() 메소드로 반환받은 DefaultComboBoxModel 객체의 
	//addElement() 메소드로 자료추가 
	
	cxmodel.addElement("Coke");
	cxmodel.addElement("Coffee");
	cxmodel.addElement("Juice");
	
	add(combo);
	
	
	
	
	setBounds(300,200,300,100);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		new JComboBoxEx();
	}

}
