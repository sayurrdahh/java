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
		super("��� ����");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new gamepanel());
		
	    tt = new Thread(new targetThread());
        tt.start();
		
        pack();
		setVisible(true);
	}
	
	
	//�׸�� ���� ����Ʈ�� �ȸ���� jlabel�� �ϸ� ������ ! 
//1. ġŲ Ŭ������ ���� �����
	//2. ġŲ Ŭ���� �̹����� ��� �����̰� �Ѵ�. 
	//3. �������̶� ������ ó������ �ٽ� �����̰��Ѵ�.? 
	//4. ������ �׸� ���� x��ǥ ~x��ǥ+50 / y =50 �̸� ������? ó������?
	
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
				    if(t == null || !t.isAlive()) { //�����尡 ����ִ��� Ȯ��
                        t = new Thread(new bulletThread()); //������ �����
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
	                
	                if(y < 0) { //y�� ������ ������ ����� �ʱ���ġ�� �缳��
	                    red.setLocation(getPreferredSize().width/2-12, getPreferredSize().height-50);
	                    break;
	                }
	                //�̹��� �� ��ġ ( �̹��� �� x,y��ǥ~ ���� ���� ���Ѱ� �ؼ� �̹����� ũ�� �ȿ� �Ѿ� ��ǥ�� ����
	                else if((x > imgla.getX() && x < imgla.getX() + imgla.getWidth()) &&  
	                        (y > imgla.getY() && y < imgla.getY() + imgla.getHeight())) {
	                    tt.interrupt(); //������ �ߴ��� �ν�
	                    
	                    imgla.setLocation(0, 0); //�̹��� �� ��ġ 0���� ����
	                    red.setLocation(getPreferredSize().width/2-12, getPreferredSize().height-50); //�Ѿ� ��ġ �ʱ�� ���� 
		                   
	                    break;
	                }
	                else {
	                    red.setLocation(x, y); 
	                }
	                
	                try {
	                    Thread.sleep(20); //20ms
	                }
	                catch(InterruptedException e) { return; } //���ܰ� �߻��ϸ� ������ ����
	            }
	        }
	    }
	 
	 private class targetThread implements Runnable {
	        public void run() {
	            while(true) {
	                int x = imgla.getX() + 5; //�����θ� �����̱� 
	                int y = imgla.getY();
	                
	                if(x > getWidth()) {
	                    x = 0;
	                } 
	                
	                imgla.setLocation(x, y);
	                
	                try {
	                    Thread.sleep(20);
	                }
	                catch(InterruptedException e1) {
	           // interrupt������ ��� ���� �ٽý���
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
