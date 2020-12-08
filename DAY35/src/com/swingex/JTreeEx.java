package com.swingex;

import javax.swing.*;
import java.util.*;

public class JTreeEx extends JFrame{

	Object [] gen = {"프로그래밍","시스템","디자인"};
	
	Vector<Vector> node1 = new Vector<Vector>() {
	
	@Override
	public String toString() {
		return "Lesson";
	}
	};

	Vector<String> node2 = new Vector<String>() {
		
	@Override
	public String toString() {
		return "Java";
	}
	};
	
	Vector<String> node3 = new Vector<String>() {
		
	@Override
	public String toString() {
		return "Xml";
	}
	};
	
	public JTreeEx() {

	node1.addElement(node2);
	node1.addElement(node3);
	
	node2.addElement("HTML");
	node2.addElement("CSS");
	node2.addElement("JavaScript");
	
	node3.addElement("Servlet");
	node3.addElement("JSP");
	
	gen[0] = node1;
	//자원바꾸기, gen배열이 첫번째 위치에 존재하는 프로그램
	
	JTree tree = new JTree(gen);
	
	tree.setRootVisible(true);
	
	JScrollPane js = new JScrollPane(tree);
	
	add(js);
	
	setBounds(300,150,400,350);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {

		new JTreeEx();
	}

}
