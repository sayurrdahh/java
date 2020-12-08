package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;


public class RemoveActionListener implements ActionListener {

	JTable table;
	public RemoveActionListener(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		//���̺��� ������ ���� �����ͼ� ������ ����
		int row = table.getSelectedRow();
		
		if(row ==-1) //������ ���� ������
			return;
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();

		//���̺��� ������ ���� �����Ҷ� 
		model.removeRow(row);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
