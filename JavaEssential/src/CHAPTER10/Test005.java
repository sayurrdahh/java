package CHAPTER10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.util.*;

public class Test005 extends JFrame implements ActionListener{
	
	JTextArea ta = new JTextArea(7,25);

	public Test005() {
	super("���� ����");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(320,200);
	setVisible(true);

	
	JMenuBar mb = new JMenuBar();
	JMenu jm = new JMenu("����");
	JMenuItem ml = new JMenuItem("����");
	ml.addActionListener(this);
	add(ta);

	jm.add(ml);
	mb.add(jm);
	
	setJMenuBar(mb);

}
	public static void main(String[] args) {
		new Test005();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(ta.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "�Էµ� �ؽ�Ʈ�� �����ϴ�.");
	}
	else {
		String filename = JOptionPane.showInputDialog("������ ���ϸ��� �Է��ϼ���.");
		if(filename==null)
			return;
		try {

		FileWriter fout = new FileWriter(filename);
		String s = ta.getText();
		StringTokenizer st = new StringTokenizer(ta.getText(),"\n");
		
		while(st.hasMoreTokens()) {
			fout.write(st.nextToken());
			fout.write("\r\n");
		}
		fout.close();
	}catch(IOException e1) {}
	
}
}
}