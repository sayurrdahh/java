package CHAPTER9;

import java.awt.event.*;
import javax.swing.*;


public class Test007 extends JFrame implements ActionListener {
	
	private String text [] = {"+2","-1","%4"}; //��ư�� ���� ����
	private JLabel la = new JLabel(); //���ڰ� ���ϴ� ��
	private JButton btn [] = new JButton [text.length];
	
	public Test007() {
		
		super("0���� �����");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int a = (int)(Math.random()*60+1); //1~60���� ��������
		la.setText(Integer.toString(a));
		
		JPanel p1 = new JPanel();		
		p1.add(la); //�гο� ���� �ø���
		add("North",p1); //���� �ø� �г��� �ø���
		
		JPanel p2 = new JPanel();		
		add("South",p2); //2�г��� �ؿ� ����. ��ư�� �� �г�
		
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
		this.setTitle("0���� �����");

		int a = Integer.parseInt(la.getText());//������ ������ �˾Ƴ�
		switch(e.getActionCommand())//�̺�Ʈ�� �߻���Ų ��ü�� ���ڿ��� �����´�
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
		la.setText(Integer.toString(a)); //������ ���ڿ��� ����� ���̺� ���
		if(a==0) {
			this.setTitle("����");
			for(int i=0;i<text.length;i++)
				btn[i].setEnabled(true); //��ư �� Ȱ��ȭ
		a = (int)(Math.random()*60+1); //1~60���� ��������
		la.setText(Integer.toString(a));
		} else { //n�� 0�� �ƴҶ� 
			if(btn[0].isEnabled()==false &&
			btn[1].isEnabled()==false &&
			btn[2].isEnabled() ==false) setTitle("����");
		}
	}
}
