package com.swingex;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;

public class JButtonEx extends JFrame{
   
   private Icon icon1 = new ImageIcon("src/img/one.jpg");
   private Icon icon2 = new ImageIcon("src/img/two.jpg");
   private Icon icon3 = new ImageIcon("src/img/one.jpg");
   private Icon icon4 = new ImageIcon("src/img/two.jpg");
   
   JRadioButton[] jb = new JRadioButton[4];
   private ButtonGroup bg = new ButtonGroup();
   
   public JButtonEx() {
      
      super("JButton");
      Container con = this.getContentPane();
      con.setLayout(new GridLayout(2,2));
      
      for(int i = 0; i<4; i++) {      
         jb[i] = new JRadioButton(i+1+"번 버튼", icon1);
         con.add(jb[i]);
         jb[i].setToolTipText(i+1+"번째 버튼이다. 눌러 주세요....");
         jb[i].setMnemonic(i+49);
         
         jb[i].setRolloverIcon(icon2);
         jb[i].setPressedIcon(icon3);
         jb[i].setSelectedIcon(icon4);
         bg.add(jb[i]);
         
         
         bg.add(jb[i]);
      }
  
      pack();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
   public static void main(String[] args) {
      
      new JButtonEx();
   
   }

}