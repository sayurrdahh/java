package dynamic_beat_05;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import dynamic_beat_03.Music;

public class DynamicBeat extends JFrame{

	private Image screenImage;
	private Graphics screenGraphics;
	
	private Image Background = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));
	
	private ImageIcon exitButtonEI = new ImageIcon(Main.class.getResource("../images/offbutton.png"));
	private ImageIcon exitButtonBI = new ImageIcon(Main.class.getResource("../images/onbutton.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	
	private JButton exitButton = new JButton(exitButtonBI);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);

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
			Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
			buttonEnteredMusic.start();

		}
		@Override
			public void mouseExited(MouseEvent e) {
			exitButton.setIcon(exitButtonBI);
			exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.exit(0);
			}
		});
	
		add(exitButton);	//메뉴바보다 앞에 있어야함	
		
		
		
		
		
		startButton.setBounds(40,200,400,100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false); //버튼 테두리 없앰
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			startButton.setIcon(startButtonEnteredImage);
			startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
			public void mouseExited(MouseEvent e) {
			startButton.setIcon(startButtonBasicImage);
			startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			startButton.setVisible(false);
			quitButton.setVisible(false);
			Background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();

			}
		});
	
		add(startButton);	//메뉴바보다 앞에 있어야함	
		
		
		
		
		
		quitButton.setBounds(40,330,400,100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false); //버튼 테두리 없앰
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			quitButton.setIcon(quitButtonEnteredImage);
			quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
			public void mouseExited(MouseEvent e) {
			quitButton.setIcon(quitButtonBasicImage);
			quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();

			}
		});
	
		add(quitButton);	//메뉴바보다 앞에 있어야함	
		
		
		
		
		
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

	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0,0,null); //0,0 의 위치에 
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		paintComponents(g); //고정된 이미지 넣을때 사용
		this.repaint();
	}
	
	
}
