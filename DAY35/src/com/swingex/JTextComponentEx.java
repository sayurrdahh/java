package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.*;
import java.util.*;


public class JTextComponentEx extends JFrame{

   public JTextComponentEx() {

      super("JTextComponent");
      
      JPanel panel1 = new JPanel();
      JTextField field = new JTextField(5);
      
      class NumberDocument extends PlainDocument{
         
         public void insertString(int offset,String value , AttributeSet a)
               throws BadLocationException{
            
            char[] valueArr = value.toCharArray();
            
            for (int i = 0; i < valueArr.length; i++) {
               if(!Character.isDigit(valueArr[i])) {
                  getToolkit().beep();
                  return;
               }
            }
            
            super.insertString(offset, value, a);
         }
      }
      
      JTextField numberField = new JTextField(2);
      
      JPasswordField passfield = new JPasswordField(5);
      
      pack();
      setLocation(300, 200);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {

      new JTextComponentEx();
   }

}