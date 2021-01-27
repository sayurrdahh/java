package dynamic_beat_01;

import java.awt.*;
import javax.swing.*;
import dynamic_beat_03.Music;

public class DynamicBeat extends JFrame{

	private Image screenImage;
	private Graphics screenGraphics;
	
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); //컴퓨터의 정중앙에 뜨게한다 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
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
		this.repaint();
	}
	
	
}
