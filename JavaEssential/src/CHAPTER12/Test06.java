package CHAPTER12;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class Test06 extends JFrame {
    public Test06() {
        this.setTitle("버블 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        Container c = getContentPane();
        c.setLayout(null);
        
        c.addMouseListener(new MouseListener(){
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();
                JLabel img = new JLabel(new ImageIcon("images/bubble.jpg"));
                img.setBounds(p.x, p.y, 50, 50);
                c.add(img);
                repaint();
                
                Thread t = new Thread(new thread(img));
                t.start();
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseClicked(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
 
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    private class thread implements Runnable {
        private JLabel img;
        private final int bubble_move = 5;
        
        public thread(JLabel img) {
            this.img = img;
        }
        
        public void run() {
            while(true) {
                int x = img.getX();
                int y = img.getY();
                
                img.setLocation(x, y - bubble_move);
                
                if(img.getY() + img.getHeight() < 0) {
                    remove(img);
                }
                
                try {
                    Thread.sleep(20);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
    public static void main(String[] args) {
        new Test06();
    }
}
 