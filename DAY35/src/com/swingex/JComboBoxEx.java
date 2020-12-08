package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class JComboBoxEx extends JFrame{

	public JComboBoxEx() {

	super("JComboBox");
	//���̾ƿ� ����
	setLayout(new FlowLayout());
	
	//������ ����
	String [] citems = {"one", "two", "three","four","five"};
	//String �迭�� JComboBox ��ü ���� 
	JComboBox combo = new JComboBox(citems);
	add(combo);
	
	DefaultComboBoxModel cmodel = new DefaultComboBoxModel();
	
	cmodel.addElement("chicken");
	cmodel.addElement("potato");

	combo = new JComboBox();
	//�޺��ڽ��� ���� �����ϸ� �޺� �ڷ� �߰� 
	combo.setModel(cmodel);
	
	DefaultComboBoxModel cxmodel = 
			(DefaultComboBoxModel)combo.getModel();
	//getModel() �޼ҵ�� DefaultComboBoxModel ��ü�� ��ȯ ����
	
	//getModel() �޼ҵ�� ��ȯ���� DefaultComboBoxModel ��ü�� 
	//addElement() �޼ҵ�� �ڷ��߰� 
	
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
