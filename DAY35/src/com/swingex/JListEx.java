package com.swingex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class JListEx extends JFrame{

   public JListEx() {

      super("JList");
      
      setLayout(new FlowLayout());
      
      String[] listData = {"pk","hong","java","data","jsp"};
      
      JList list1 = new JList(listData);
      list1.setSelectedIndex(2);
      
      JList list2 = new JList(new DefaultListModel());
      DefaultListModel model = (DefaultListModel)list2.getModel();
      model.addElement("사과");
      model.addElement("배");
      model.addElement("포도");
      model.addElement("귤");
      list2.setSelectedIndex(1);
      
      Vector vListData = new Vector();
      JList list3 = new JList(vListData);
      JScrollPane scroll = new JScrollPane(list3);
      vListData.add("축구");
      vListData.add("야구");
      vListData.add("농구");
      vListData.add("배구");
      vListData.add("족구");
      vListData.add("수구");
      vListData.add("정구");
      vListData.add("1");
      vListData.add("2");
      vListData.add("3");
      vListData.add("4");
      
      //jList에 추가할 student 클래스를 내부 클래스로 생성
      class Student{
         String id;
         String name;
         String department;
         
         public Student(String id,String name , String department) {
            this.id = id;
            this.name = name;
            this.department = department;
            }
         
         @Override
         public String toString() {
            return name;
         }
      }
      
      JList list4 = new JList(new DefaultListModel());
      
      list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      model = (DefaultListModel)list4.getModel();
      
      model.addElement(new Student("100","홍길동","컴퓨터공학과"));
      model.addElement(new Student("200","홍동","역사학과"));
      model.addElement(new Student("300","길동","일어일문학과"));
      model.addElement(new Student("400","홍길","전자통신공학과"));
      list4.setSelectedIndex(0);

      add(list1);
      add(list2);
      add(scroll);
      add(list4);
      
      
      setBounds(300,200,300,220);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
   
   
   
   public static void main(String[] args) {

      new JListEx();
   }

}