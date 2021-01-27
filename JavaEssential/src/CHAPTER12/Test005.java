package CHAPTER12;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Test005 extends JFrame{


	private JLabel black = new JLabel();
	private JLabel red = new JLabel();
	private JLabel imgla = new JLabel();
    private Thread tt;
	
	public Test005() {
		super("사격 게임");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new gamepanel());
		
	    tt = new Thread(new targetThread());
        tt.start();
		
        pack();
		setVisible(true);
	}
	
	
	//네모는 굳이 페인트로 안만들고 jlabel로 하면 좋을듯 ! 
//1. 치킨 클래스를 따로 만든다
	//2. 치킨 클래스 이미지를 계속 움직이게 한다. 
	//3. 빨간색이랑 닿으면 처음부터 다시 움직이게한다.? 
	//4. 빨간색 네모가 닭의 x좌표 ~x좌표+50 / y =50 이면 닿은것? 처음부터?
	
	private class gamepanel extends JPanel {

		
		public gamepanel() {
		setPreferredSize(new Dimension(400,400));
		setLayout(null);

		imgla = new JLabel(new ImageIcon("src/images/chicken.jpg"));			
		imgla.setBounds(0, 0, 50, 50);
		add(imgla);
		
		black.setOpaque(true);
		black.setBackground(Color.black);
		black.setBounds(getPreferredSize().width/2-20, getPreferredSize().height-40, 40, 40);
		add(black);
		
		red.setOpaque(true);
		red.setBackground(Color.red);
		red.setBounds(getPreferredSize().width/2-5,getPreferredSize().height-50,10,10);
		add(red);
		
		addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				Thread t = new Thread(new bulletThread());
				if(e.getKeyChar()=='\n') {
				    if(t == null || !t.isAlive()) { //쓰레드가 살아있는지 확인
                        t = new Thread(new bulletThread()); //쓰레드 재실행
                        t.start();
				    }
				}
			}
		});
		 requestFocus();
         setFocusable(true);
		

		}
		
		
	}
	
	 private class bulletThread implements Runnable {
		
			
		 public void run() {
	        	
	        
	        	
	  	            while(true) {
	                int x = red.getX();
	                int y = red.getY() - 5;
	                
	                if(y < 0) { //y가 프레임 밖으로 벗어나면 초기위치로 재설정
	                    red.setLocation(getPreferredSize().width/2-12, getPreferredSize().height-50);
	                    break;
	                }
	                //이미지 라벨 위치 ( 이미지 라벨 x,y좌표~ 가로 세로 더한값 해서 이미지라벨 크기 안에 총알 좌표가 들어가면
	                else if((x > imgla.getX() && x < imgla.getX() + imgla.getWidth()) &&  
	                        (y > imgla.getY() && y < imgla.getY() + imgla.getHeight())) {
	                    tt.interrupt(); //스레드 중단을 인식
	                    
	                    imgla.setLocation(0, 0); //이미지 라벨 위치 0으로 돌림
	                    red.setLocation(getPreferredSize().width/2-12, getPreferredSize().height-50); //총알 위치 초기로 돌림 
		                   
	                    break;
	                }
	                else {
	                    red.setLocation(x, y); 
	                }
	                
	                try {
	                    Thread.sleep(20); //20ms
	                }
	                catch(InterruptedException e) { return; } //예외가 발생하면 스레드 종료
	            }
	        }
	    }
	 
	 private class targetThread implements Runnable {
	        public void run() {
	            while(true) {
	                int x = imgla.getX() + 5; //옆으로만 움직이기 
	                int y = imgla.getY();
	                
	                if(x > getWidth()) {
	                    x = 0;
	                } 
	                
	                imgla.setLocation(x, y);
	                
	                try {
	                    Thread.sleep(20);
	                }
	                catch(InterruptedException e1) {
	           // interrupt됐을때 잠깐 쉬고 다시시작
	                    try {
                        Thread.sleep(500);
	                    }
	                    catch(InterruptedException e2) {}
	                }
	            }
	        }
	    }
	
	
	public static void main(String[] args) {
		new Test005();
	}

}
