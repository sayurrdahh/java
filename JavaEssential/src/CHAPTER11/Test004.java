package CHAPTER11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test004 extends JFrame {

	private int x,y;
	
	public Test004() {
		super("�̹��� ���� �� �巡��");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(new Mypanel());
		
	}
	public static void main(String[] args) {
		new Test004();
	}
	
	class Mypanel extends JPanel {
		private Point p = null;//point ���� ���е��� �����Ǵ� (x, y) ��ǥ ���������� ��ġ�� ��Ÿ���� ���Դϴ�.
		public Mypanel() {
		

			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					p = e.getPoint();
					repaint();//ȭ���� �ٽ� �׷������� �Ϸ��� repaint()�� ȣ���ϸ� �˴ϴ�. repaint()�� AWT�����忡�� ȭ���� �ٽ� �׸� ���� ��û�մϴ�. 
				}
			}); 
		}
		private ImageIcon icon = new ImageIcon("src/images/four.jpg");
		private Image im = icon.getImage();
		
		//�������� ������ �����ΰ�ó��
		
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


	