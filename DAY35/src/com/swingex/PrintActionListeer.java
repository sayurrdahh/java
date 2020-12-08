package com.swingex;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrintActionListeer implements ActionListener {

	JTable table;
	
	public PrintActionListeer(JTable table) {

	this.table = table;
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {

		//���� ������
		TableModel model = table.getModel();
		
		//�𵨿��� ��� ���� ������ ������
		// getRowCount() , getColumnCount();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		//�÷��� �̸��� �����ͼ� ���
		for(int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();
		//�����͸� ������
		//getValueAt(2,3); ���� ��ġ�� ���� ��ġ�� �ִ� �����͸� ������
		for(int row = 0; row<rowNum; row++) {
			for(int col = 0; col<colNum; col++) {
			Object obj = model.getValueAt(row, col);
			System.out.print(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}

}
