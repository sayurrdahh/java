package CHAPTER12;

import java.util.Calendar;
import java.awt.*;
import javax.swing.*;

public class Test004 extends JFrame{
	private Calendar c;
	private int hour, min, second;
	private JLabel time;
	
	public Test004() {
		super("디지털 시계 만들기");
		setSize(500,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		time = new JLabel();		
        time.setFont(new Font("Arial", Font.PLAIN, 70));
        time.setBounds(30, 10,300, 300);
        add(time);
    	
    	
	    Thread th= new Thread(new thread());
    	th.start();
    	
    	
		setVisible(true);
	}
	
	private class thread implements Runnable{

		@Override
		public void run() {
			while(true) {
				c = Calendar.getInstance(); //현재년도 날짜 시간 값을 가진 객체 얻기
				hour = c.get(Calendar.HOUR_OF_DAY);
				min = c.get(Calendar.MINUTE);
				second = c.get(Calendar.SECOND);
				String clockText = Integer.toString(hour);
				clockText = clockText.concat(":");	// 문자열과 문자열을 합친 값을 리턴한다 
				clockText = clockText.concat(Integer.toString(min));
				clockText = clockText.concat(":");	// 문자열과 문자열을 합친 값을 리턴한다 
				clockText = clockText.concat(Integer.toString(second));
				time.setText(clockText);
		}
		
	}
	}
	
	public static void main(String[] args) {
		new Test004();
	}

}
