package CHAPTER11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Test006 extends JFrame {

	public Test006() {
		super("�׷��� �̹��� 10% Ȯ�� ����ϱ�");
		
		setContentPane(new my());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	//	setLocationRelativeTo(getOwner());
		setSize(500,500);
		setVisible(true); //������Ʈ���� ������?
	}
	
	class my extends JPanel{
		private Image img = new ImageIcon("src/images/image1.jpg").getImage(); //�̹��� �������� �̹��� �ҷ�����
		private int x = img.getWidth(this), y= img.getHeight(this);

		public my() {
	
			addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						x = x + x/10;
						y = y + y/10;
					}
					else if(e.getKeyChar() == '-') {
						x = x - x/10;
						y = y - y/10;
					}
						repaint();
					}
			
			});
			setFocusable(true);
			requestFocus();
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, x, y, this);
		}
		
	}
	
	public static void main(String[] args) {
		new Test006();
	}

}
