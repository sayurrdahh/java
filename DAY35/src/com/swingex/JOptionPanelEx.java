package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPanelEx extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;
	// �޼��� ���̾�α�, Ȯ�� ���̾�α�, �Է� ���̾�α� , �ɼ� ���̾�α�
	String [ ] str = {"�α���","ȸ������"};
	
	
	
	public JOptionPanelEx() {

		super("JOptionPanel");
		setLayout(new FlowLayout());
	
		//���̾ƿ� ����
		b1 = new JButton("�޼��� ���̾˷α�");
		b2 = new JButton("���� ���̾˷α�");
		b3 = new JButton("��ǲ ���̾˷α�");
		b4 = new JButton("�ɼ� ���̾˷α�");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	
		pack();
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1) {
			//�̺�Ʈ�� �߻��� ������Ʈ�� b1
			JOptionPane.showMessageDialog(
					this, //MessageDialog�� �����ϰ� �ִ� �θ� ������Ʈ
					"�޼��� ���̾�α� �Դϴ�.",//�޼��� 
					"�޼���",//�޼����� ����
					JOptionPane.INFORMATION_MESSAGE); //�޽��� Ÿ�� ����
			}
		else if(e.getSource()==b2) {
			JOptionPane.showConfirmDialog(
					this, 
					"���� ���̾�α� �Դϴ�.",//�޼��� 
					"Ȯ��",//�޼����� ����
					JOptionPane.YES_NO_CANCEL_OPTION); //�޽��� Ÿ�� ����
			}	
		else if(e.getSource()==b3) {
			JOptionPane.showInputDialog(
					this,
					"�Է� ���̾�α�",
					"�Է�",
					JOptionPane.YES_NO_OPTION);
		}		else if(e.getSource()==b4) {
			JOptionPane.showOptionDialog(
					this, //�θ�������Ʈ 
					"�ɼ� ���̾�α�", //�޽���
					"�ɼ�",  //���̾�α� ����
					JOptionPane.YES_NO_CANCEL_OPTION,  //�ɼ�Ÿ��
					JOptionPane.INFORMATION_MESSAGE, //�޽���Ÿ��
					null, //������
					str, //����ڰ� ������ �� �ִ� ��ü �迭(str)
					str[0]); //�⺻������ ������ ��ü
			}
		
		
		
	}

	public static void main(String[] args) {
		new JOptionPanelEx();
	}

}
