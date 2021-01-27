package CHAPTER11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class OpenChallenge extends JFrame{

	JMenuBar jb = new JMenuBar();
	JTextField jtf1 = new JTextField(5);
	JTextField jtf2 = new JTextField(5);
	JTextField jtf3 = new JTextField(5);
	JTextField jtf4 = new JTextField(5);
	JLabel la = new JLabel("apple "+jtf1.getText()+"%");
class mp extends JPanel{
	
	public mp() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					jtf1.setText(la.getText());
					
				}						
			}
		});
			
		}

	
	@Override
	protected void paintChildren(Graphics g) {
		super.paintChildren(g);
		g.setColor(Color.green);
		g.drawString(la.getText(),50, 60);
		g.setColor(Color.black);
		g.drawString("cherry "+jtf2.getText()+"%",150, 60);
		g.setColor(Color.red);
		g.drawString("strawberry "+jtf3.getText()+"%", 250, 60);
		g.setColor(Color.magenta);
		g.drawString("prune "+jtf4.getText()+"%", 380, 60);
		
	}
}
	
public OpenChallenge() {
	super("Open Challenge 11");
	setVisible(true);
	setSize(500,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setContentPane(new mp());

	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER,60,10));

	jb.setLayout(new FlowLayout());
	jb.setBackground(Color.gray);
	jb.add(new JLabel("apple"));
	jb.add(jtf1);
	jb.add(new JLabel("cherry"));
	jb.add(jtf2);
	jb.add(new JLabel("strawberry"));
	jb.add(jtf3);
	jb.add(new JLabel("prune"));
	jb.add(jtf4);
	add("North",jb);
	

}	
	public static void main(String[] args) {
		new OpenChallenge();

	}

}
