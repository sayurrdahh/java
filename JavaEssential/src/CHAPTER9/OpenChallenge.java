package CHAPTER9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OpenChallenge extends JFrame implements KeyListener{

	
	JLabel la[] = new JLabel[3];
	JLabel la4 = new JLabel();
	
	public OpenChallenge() {
		super("Open Challenge 9");
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
		
		add("Center",p1);
		add("South",p2);
		
		Font f1 = new Font("돋움", Font.ITALIC, 28);

		
		for(int i=0;i<3;i++) {
			la[i] = new JLabel("0");
			la[i].setFont(f1);
			la[i].setPreferredSize(new Dimension(60,30));
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setForeground(Color.yellow);
			la[i].setOpaque(true);
			la[i].setBackground(Color.magenta);	
			p1.add(la[i]);
		}
	
		la4.setText("시작합니다");
		p2.add(la4);
		
		addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		new OpenChallenge();
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) 
		{

		int x = (int)(Math.random()*5);
		int y = (int)(Math.random()*5);
		int z = (int)(Math.random()*5);
		
			if(e.getKeyChar()=='\n') {
				
				la[0].setText(Integer.toString(x));
				la[1].setText(Integer.toString(y));
				la[2].setText(Integer.toString(z));
				
				if(x==y&&y==z)
					la4.setText("축하합니다!!");
				else
					la4.setText("아쉽군요..");
			}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
