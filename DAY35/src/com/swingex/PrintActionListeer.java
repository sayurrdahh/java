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

		//모델을 가져옴
		TableModel model = table.getModel();
		
		//모델에서 행과 열의 개수를 가져옴
		// getRowCount() , getColumnCount();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		//컬럼의 이름을 가져와서 출력
		for(int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();
		//데이터를 가져옴
		//getValueAt(2,3); 행의 위치와 열의 위치에 있는 데이터를 가져옴
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
