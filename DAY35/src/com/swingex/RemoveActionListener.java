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

		//테이블에서 선택한 행을 가져와서 변수에 저장
		int row = table.getSelectedRow();
		
		if(row ==-1) //선택한 행이 없으면
			return;
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();

		//테이블에서 선택한 행을 삭제할때 
		model.removeRow(row);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
