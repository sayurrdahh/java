package CHAPTER11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test004 extends JFrame {

	private int x,y;
	
	public Test004() {
		super("이미지 위에 원 드래깅");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(new Mypanel());
		
	}
	public static void main(String[] args) {
		new Test004();
	}
	
	class Mypanel extends JPanel {
		private Point p = null;//point 정수 정밀도로 지정되는 (x, y) 좌표 공간에서의 위치를 나타내는 점입니다.
		public Mypanel() {
		

			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					p = e.getPoint();
					repaint();//화면이 다시 그려지도록 하려면 repaint()를 호출하면 됩니다. repaint()는 AWT쓰레드에게 화면을 다시 그릴 것을 요청합니다. 
				}
			}); 
		}
		private ImageIcon icon = new ImageIcon("src/images/four.jpg");
		private Image im = icon.getImage();
		
		//동영상은 사진의 연속인것처럼
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.green);

			if(p==null) return;
			g.fillOval(p.x, p.y, 20, 20);
		}
		
	}
}


	