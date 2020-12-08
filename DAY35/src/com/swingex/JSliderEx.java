package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderEx extends JFrame{

	JSlider red = new JSlider(JSlider.HORIZONTAL,0,255,0);
	//슬라이더 방향, 최소값, 최대값,초기설정값
	JSlider green = new JSlider(JSlider.HORIZONTAL,0,255,0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL,0,255,0);
	JLabel rgb = new JLabel("RGB(0,0,0)",JLabel.CENTER);
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0,1));
	JPanel cen = new JPanel(new GridLayout(0,1));
	JPanel p2 = new JPanel(); //색이 표시되는 부분
	
	int r, g, b;
	
	public JSliderEx() {
		
	super("JSliderEx");
	
	//setMajorTickSpacing() : 주눈금 설정
	// setMinorTickSpacing() : 작은 눈금 설정
	// setPaintTicks(true)
	// setPaintLabels(true)
	red.setMajorTickSpacing(50);
	red.setMinorTickSpacing(5);
	red.setPaintTicks(true);
	red.setPaintLabels(true);
	
	green.setMajorTickSpacing(50);
	green.setMinorTickSpacing(5);
	green.setPaintTicks(true);
	green.setPaintLabels(true);
	
	blue.setMajorTickSpacing(50);
	blue.setMinorTickSpacing(5);
	blue.setPaintTicks(true);
	blue.setPaintLabels(true);
	
	
	
	JLabel rlabel = new JLabel("RED");
	JLabel glabel = new JLabel("GREEN");
	JLabel blabel = new JLabel("BLUE");

	rlabel.setForeground(Color.red);
	glabel.setForeground(Color.green);
	blabel.setForeground(Color.blue);


	rgb.setFont(new Font("돋움체",Font.BOLD,24));
	
	west.add(rlabel);
	west.add(glabel);
	west.add(blabel);

	cen.add(red);
	cen.add(green);
	cen.add(blue);
	
	p1.add("West",west);
	p1.add("Center",cen);
	
	
	add("North", rgb);
	add("South",p1);
	add("Center",p2);
	
	setBounds(300, 200, 400, 300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	red.addChangeListener(new Sevent());
	green.addChangeListener(new Sevent());
	blue.addChangeListener(new Sevent());
	}

	class Sevent implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			// 눈금이 바뀔때마다 이 메소드가 호출됨
			JSlider source = (JSlider)e.getSource();
			
			if(e.getSource() == red) {
				r=source.getValue();
			}
		
			if(e.getSource() == green) {
				g=source.getValue();
			}
			if(e.getSource() == blue) {
				b=source.getValue();
			}
			
			p2.setBackground(new Color(r,g,b));
			rgb.setText("RGB("+r+","+g+","+b+")");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {

		new JSliderEx();
	}

}
