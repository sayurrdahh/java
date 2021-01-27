package CHAPTER9;

import java.awt.event.*;
import javax.swing.*;


public class Test007 extends JFrame implements ActionListener {
	
	private String text [] = {"+2","-1","%4"}; //버튼에 들어가는 숫자
	private JLabel la = new JLabel(); //숫자가 변하는 라벨
	private JButton btn [] = new JButton [text.length];
	
	public Test007() {
		
		super("0으로 만들기");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int a = (int)(Math.random()*60+1); //1~60까지 랜덤숫자
		la.setText(Integer.toString(a));
		
		JPanel p1 = new JPanel();		
		p1.add(la); //패널에 라벨을 올린다
		add("North",p1); //라벨을 올린 패널을 올린다
		
		JPanel p2 = new JPanel();		
		add("South",p2); //2패널을 밑에 부착. 버튼이 들어갈 패널
		
		for(int i =0;i<text.length;i++) {
			btn[i] = new JButton(text[i]);
			btn[i].addActionListener(this);
			p2.add(btn[i]);
		}
	}
	
	public static void main(String[] args) {
		new Test007();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setTitle("0으로 만들기");

		int a = Integer.parseInt(la.getText());//현재의 정수를 알아냄
		switch(e.getActionCommand())//이벤트를 발생시킨 객체의 문자열을 가져온다
		{ 
		case "+2" :
			a+=2;
			btn[0].setEnabled(false);
			break;
		case "-1" :
			a -= 1;
			btn[1].setEnabled(false);
			break;
		case "%4" :
			a %= 4;
			btn[2].setEnabled(false);	
			break;
		}
		la.setText(Integer.toString(a)); //정수를 문자열로 만들어 레이블에 출력
		if(a==0) {
			this.setTitle("성공");
			for(int i=0;i<text.length;i++)
				btn[i].setEnabled(true); //버튼 다 활성화
		a = (int)(Math.random()*60+1); //1~60까지 랜덤숫자
		la.setText(Integer.toString(a));
		} else { //n이 0이 아닐때 
			if(btn[0].isEnabled()==false &&
			btn[1].isEnabled()==false &&
			btn[2].isEnabled() ==false) setTitle("실패");
		}
	}
}
