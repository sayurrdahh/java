package CHAPTER10;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Test009 extends JFrame implements MouseListener{
	
	HashMap<String, String> h = new HashMap<String,String>();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	int n=0;
	JLabel j1 = new JLabel("영어");
	JLabel j2 = new JLabel("한글");
	JLabel j3 = new JLabel(); ; //저장된 단어 개수
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JButton b1 = new JButton("저장");
	JButton b2 = new JButton("찾기");
	JButton b3 = new JButton("삭제");
	JButton b4 = new JButton("모두보기");
	JTextArea ta = new JTextArea(10,30);
	
	public Test009() {
		super("단어 사전 만들기");
		setSize(400,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.gray);
		setLayout(new FlowLayout());
	
		
		b1.setOpaque(true);
		b1.setBackground(Color.yellow);
		b2.setOpaque(true);
		b2.setBackground(Color.green);
		b3.setOpaque(true);
		b3.setBackground(Color.magenta);
		b4.setOpaque(true);
		b4.setBackground(Color.blue);
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		
		p1.add(j1);
		p1.add(t1);
		p1.add(j2);
		p1.add(t2);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		p3.add(j3);
		p3.add(ta);
		
		add("North",p1);
		add("Center",p2);
		add("South",p3);
		
	}
	public static void main(String[] args) {
		new Test009();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		if(b1==b) {
			if(!h.containsKey(t1.getText())) {
				h.put(t1.getText(), t2.getText());
				ta.append("삽입 ("+t1.getText()+","+t2.getText()+")\n");
				n++;
				j3.setText(Integer.toString(n));
				
			}
			else {
				h.put(t1.getText(), t2.getText());
				ta.append("변경 ("+t1.getText()+","+t2.getText()+")\n");
			}
		}
		if(b2==b) {
			if(h.containsKey(t1.getText())) {
				t2.setText(h.get(t1.getText()));
			}
		}
		if(b3==b) {
			if(h.containsKey(t1.getText())) {
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key = it.next();
					String value = h.get(key);
					ta.append("삭제 ("+key+","+value+")\n");
					h.remove(key,value);
					n--;
					j3.setText(Integer.toString(n));
				}
		
			}
		}
		if(b4==b) {
			ta.setText("");
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()) {
				String key = it.next();
				String value = h.get(key);
				ta.append("단어 ("+key+","+value+")\n");
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
