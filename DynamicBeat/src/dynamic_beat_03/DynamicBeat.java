package dynamic_beat_03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import dynamic_beat_03.Music;

public class DynamicBeat extends JFrame{

	private Image screenImage;
	private Graphics screenGraphics;
	
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));
	
	private ImageIcon exitButtonEI = new ImageIcon(Main.class.getResource("../images/offbutton.png"));
	private ImageIcon exitButtonBI = new ImageIcon(Main.class.getResource("../images/onbutton.png"));
	
	private JButton exitButton = new JButton(exitButtonBI);

	private int mouseX, mouseY;
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); //컴퓨터의 정중앙에 뜨게한다 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		exitButton.setBounds(1245,0,30,30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false); //버튼 테두리 없앰
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			exitButton.setIcon(exitButtonEI);
			exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
			public void mouseExited(MouseEvent e) {
			exitButton.setIcon(exitButtonBI);
			exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			System.exit(0);
			}
		});

		add(exitButton);		
		
		menuBar.setBounds(0,0,1280,30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();			
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x-mouseX,y-mouseY);
			}
		});
		add(menuBar);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();
		Music introMusic = new Music("introMusic.mp3",true);
		introMusic.start();
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0,0,null); //0,0 의 위치에 
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g); //고정된 이미지 넣을때 사용
		this.repaint();
	}
	
	
}
