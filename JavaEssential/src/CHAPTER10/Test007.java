package CHAPTER10;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Test007 extends JFrame implements MouseListener, MouseMotionListener{

	private JLabel jl;
	private int x,y;
	public Test007() {
		super("�̹��� �巡��");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container c = getContentPane();
	//	c.setLayout(null); �Ƚᵵ �����̴���?
		ImageIcon img = new ImageIcon("src/images/one.jpg");
		jl = new JLabel(img);
		jl.setLocation(100, 100);
		jl.setSize(img.getIconWidth(),img.getIconWidth());//�̰� ���ϸ� �Ⱥ��δ�.
		jl.addMouseListener(this);
		jl.addMouseMotionListener(this);
		add(jl);
	}
	
	public static void main(String[] args) {
		new Test007();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int distanceX = e.getX() - x; //�巡���� ���콺 ��ġ - ���콺�� �������� ��ġ
		int distanceY = e.getY() - y; //10,10���� 20,20���� �̵��ߴ��ϸ� 20-10 
		jl.setLocation(jl.getX()+ distanceX, jl.getY() + distanceY);
		//jlabel�� �� ��ġ 10+�Ÿ� 10 = 20 ; �ᱹ ���콺 �̺�Ʈ ��ġ�� �Ȱ��� �����̰� �Ǵ� ��
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

}
