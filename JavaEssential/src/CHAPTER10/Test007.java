package CHAPTER10;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Test007 extends JFrame implements MouseListener, MouseMotionListener{

	private JLabel jl;
	private int x,y;
	public Test007() {
		super("이미지 드래깅");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container c = getContentPane();
	//	c.setLayout(null); 안써도 움직이던데?
		ImageIcon img = new ImageIcon("src/images/one.jpg");
		jl = new JLabel(img);
		jl.setLocation(100, 100);
		jl.setSize(img.getIconWidth(),img.getIconWidth());//이걸 안하면 안보인다.
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
		int distanceX = e.getX() - x; //드래그한 마우스 위치 - 마우스를 눌렀을때 위치
		int distanceY = e.getY() - y; //10,10에서 20,20으로 이동했다하면 20-10 
		jl.setLocation(jl.getX()+ distanceX, jl.getY() + distanceY);
		//jlabel의 원 위치 10+거리 10 = 20 ; 결국 마우스 이벤트 위치랑 똑같이 움직이게 되는 것
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

}
