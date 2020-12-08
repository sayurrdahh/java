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
      model.addElement("���");
      model.addElement("��");
      model.addElement("����");
      model.addElement("��");
      list2.setSelectedIndex(1);
      
      Vector vListData = new Vector();
      JList list3 = new JList(vListData);
      JScrollPane scroll = new JScrollPane(list3);
      vListData.add("�౸");
      vListData.add("�߱�");
      vListData.add("��");
      vListData.add("�豸");
      vListData.add("����");
      vListData.add("����");
      vListData.add("����");
      vListData.add("1");
      vListData.add("2");
      vListData.add("3");
      vListData.add("4");
      
      //jList�� �߰��� student Ŭ������ ���� Ŭ������ ����
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
      
      model.addElement(new Student("100","ȫ�浿","��ǻ�Ͱ��а�"));
      model.addElement(new Student("200","ȫ��","�����а�"));
      model.addElement(new Student("300","�浿","�Ͼ��Ϲ��а�"));
      model.addElement(new Student("400","ȫ��","������Ű��а�"));
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