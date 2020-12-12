package CHAPTER10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.xml.crypto.KeySelector.Purpose;

public class Test008 extends JFrame implements MouseListener{

	private JLabel [] label = new JLabel[10];
	int n = 0;
	
	public Test008() {
		super("Ten 레이블 클릭 ");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		
		for(int i=0;i<10;i++) { //jlabel 10개 만들기 
			label[i] = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*220)+30; //30~250사이의 랜덤
			int y = (int)(Math.random()*220)+30; //30~250사이의 랜덤
			label[i].setLocation(x,y);
			label[i].setSize(20,20);
			label[i].setForeground(Color.magenta);
			label[i].addMouseListener(this);
			con.add(label[i]);
		}
	
	}
	public static void main(String[] args) {
		new Test008();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		JLabel la = (JLabel)e.getSource();
		if(label[n]==la) {
			la.setVisible(false);
			n++;
			if(n==10) {
				new Test008();
				dispose(); //안쓰면 새로 시작할때  창이 또 생김
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
