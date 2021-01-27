package dynamic_beat_08;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import dynamic_beat_03.Music;

public class DynamicBeat extends JFrame{

	private Image screenImage;
	private Graphics screenGraphics;
	
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
	
	private ImageIcon easyButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/easy_pressed.png"));
	private ImageIcon easyButtonBasicImage = new ImageIcon(Main.class.getResource("../images/easy.png"));
	private ImageIcon hardButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/hard_pressed.png"));
	private ImageIcon hardButtonBasicImage = new ImageIcon(Main.class.getResource("../images/hard.png"));
	
	
	
	private JButton exitButton = new JButton(exitButtonBI);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);
	private JButton easyButton = new JButton(easyButtonBasicImage);
	private JButton hardButton = new JButton(hardButtonBasicImage);


	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));

	private Image Background = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();

	private int mouseX, mouseY;
	
	private boolean isMainScreen = false;
	
	ArrayList<Track> trackList = new ArrayList<Track>();

	private Music selectedMusic;
	private Image titleImage; //= new ImageIcon(Main.class.getResource("../images/firstmusic.png")).getImage();
	private Image selectedImage; // = new ImageIcon(Main.class.getResource("../images/erf_start_image.jpg")).getImage();

	private int nowSelected = 0;
	
	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); //��ǻ���� ���߾ӿ� �߰��Ѵ� 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
		
		trackList.add(new Track("firstmusic.png", "erf_start_image.jpg", "erf_game_image.jpg", "erf.mp3", "erf.mp3"));
		trackList.add(new Track("secondmusic.png", "groovyhiphop_start_image.jpg", "groovyhiphop_game_image.jpg", "groovyhiphop.mp3", "groovyhiphop.mp3"));
		trackList.add(new Track("thirdmusic.png", "highoctane_start_image.jpg", "highoctane_game_image.jpg", "highoctane.mp3", "highoctane.mp3"));
		
		exitButton.setBounds(1245,0,30,30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false); //��ư �׵θ� ����
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
	
		add(exitButton);	//�޴��ٺ��� �տ� �־����	
		
		
		startButton.setBounds(40,200,400,100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false); //��ư �׵θ� ����
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
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			introMusic.close();
			selectTrack(0);
			startButton.setVisible(false);
			quitButton.setVisible(false);
			leftButton.setVisible(true);
			rightButton.setVisible(true);
			easyButton.setVisible(true);
			hardButton.setVisible(true);
			
			Background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
			isMainScreen = true;
			}
		});
	
		add(startButton);	//�޴��ٺ��� �տ� �־����	
		
	
		quitButton.setBounds(40,330,400,100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false); //��ư �׵θ� ����
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
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			System.exit(0);
			}
		});
	
		add(quitButton);	//�޴��ٺ��� �տ� �־����	
		
		
		leftButton.setBounds(140,310,64,64);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false); //��ư �׵θ� ����
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
		}
		@Override
			public void mousePressed(MouseEvent e) {
			Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
			buttonPressedMusic.start();
			//���� ��ư �̺�Ʈ
			selectLeft();
			}
		});
	
		add(leftButton);
		
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
			}
			@Override
				public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
				buttonPressedMusic.start();
				//������ ��ư �̺�Ʈ
				selectRight();
				}
			});
		
			add(rightButton);
			
			easyButton.setVisible(false);
			easyButton.setBounds(375,580,250,67);
			easyButton.setBorderPainted(false);
			easyButton.setContentAreaFilled(false); //��ư �׵θ� ����
			easyButton.setFocusPainted(false);

			easyButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					easyButton.setIcon(easyButtonEnteredImage);
					easyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
					buttonEnteredMusic.start();
				}
				@Override
					public void mouseExited(MouseEvent e) {
					easyButton.setIcon(easyButtonBasicImage);
					easyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
				@Override
					public void mousePressed(MouseEvent e) {
					Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
					buttonPressedMusic.start();
					gamestart(nowSelected, "easy");
					}
				});
			
				add(easyButton);

				hardButton.setVisible(false);
				hardButton.setBounds(655,580,250,67);
				hardButton.setBorderPainted(false);
				hardButton.setContentAreaFilled(false); //��ư �׵θ� ����
				hardButton.setFocusPainted(false);

				hardButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						hardButton.setIcon(hardButtonEnteredImage);
						hardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
						Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
						buttonEnteredMusic.start();
					}
					@Override
						public void mouseExited(MouseEvent e) {
						hardButton.setIcon(hardButtonBasicImage);
						hardButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
						public void mousePressed(MouseEvent e) {
						Music buttonPressedMusic = new Music("buttonPressedMusic.mp3",false);
						buttonPressedMusic.start();
						gamestart(nowSelected, "Hard");
						//���̵� ����� �̺�Ʈ
						}
					});
				
					add(hardButton);
					
				
				
			
		
		leftButton.setVisible(false);
		rightButton.setVisible(false);
		rightButton.setBounds(1080,310,64,64);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false); //��ư �׵θ� ����
		rightButton.setFocusPainted(false);
	
		
		
		
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
		g.drawImage(screenImage, 0,0,null); //0,0 �� ��ġ�� 
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		if(isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 70, null);
		}
		paintComponents(g); //������ �̹��� ������ ���
		this.repaint();
	}
		public void selectTrack(int nowSelected) {
			if(selectedMusic != null)
				selectedMusic.close();
			titleImage = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSelected).getTitleImage())).getImage();
			selectedImage = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSelected).getStartImage())).getImage();
			selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(),true);
			selectedMusic.start();
		
		
		}
		
		public void selectLeft() {
			if(nowSelected ==0)
				nowSelected = trackList.size()-1;
			else
				nowSelected--;
			selectTrack(nowSelected);
		}
		
		public void selectRight() {
			if(nowSelected == trackList.size()-1)
				nowSelected =0;
			else
				nowSelected++;
			selectTrack(nowSelected);
		}

		public void gamestart(int nowSelected, String difficulty) {
			if(selectedMusic != null)
				selectedMusic.close();
			isMainScreen = false;
			leftButton.setVisible(false);
			rightButton.setVisible(false);
			easyButton.setVisible(false);
			hardButton.setVisible(false);
			Background = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSelected).getGameImage())).getImage();
			
		}
}
