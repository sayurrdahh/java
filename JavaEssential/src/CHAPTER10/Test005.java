package CHAPTER10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.util.*;

public class Test005 extends JFrame implements ActionListener{
	
	JTextArea ta = new JTextArea(7,25);

	public Test005() {
	super("파일 저장");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(320,200);
	setVisible(true);

	
	JMenuBar mb = new JMenuBar();
	JMenu jm = new JMenu("파일");
	JMenuItem ml = new JMenuItem("저장");
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
			JOptionPane.showMessageDialog(null, "입력된 텍스트가 없습니다.");
	}
	else {
		String filename = JOptionPane.showInputDialog("저장할 파일명을 입력하세요.");
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