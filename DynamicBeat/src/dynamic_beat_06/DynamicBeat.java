package dynamic_beat_06;

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

	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));

	private Image titleImage = new ImageIcon(Main.class.getResource("../images/firstmusic.png")).getImage();

	
	private Image selectedImage = new ImageIcon(Main.class.getResource("../images/erf_start_image.jpg")).getImage();

	private JButton exitButton = new JButton(exitButtonBI);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);

	private int mouseX, mouseY;
	
	private boolean isMainScreen = false;
	
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
			leftButton.setVisible(true);
			rightButton.setVisible(true);
			Background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
			isMainScreen = true;
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
		
		
		leftButton.setVisible(false);
		leftButton.setBounds(140,310,64,64);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false); //버튼 테두리 없앰
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			leftButton.setIcon(leftButtonEnteredImage);
			leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
			public void mouseExited(MouseEvent e) {
			leftButton.setIcon(leftButtonBasicImage);
			leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			//왼쪽 버튼 이벤트
			}
		});
	
		add(leftButton);
		
		rightButton.setVisible(false);
		rightButton.setBounds(1080,310,64,64);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false); //버튼 테두리 없앰
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			rightButton.setIcon(rightButtonEnteredImage);
			rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
			public void mouseExited(MouseEvent e) {
			rightButton.setIcon(rightButtonBasicImage);
			rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			//오른쪽 버튼 이벤트
			}
		});
	
		add(rightButton);
		
		
		
		
		
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
		if(isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 70, null);
		}
		paintComponents(g); //고정된 이미지 넣을때 사용
		this.repaint();
	}
	
	
}
