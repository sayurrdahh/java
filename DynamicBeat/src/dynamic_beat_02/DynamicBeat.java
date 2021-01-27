package dynamic_beat_02;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); //컴퓨터의 정중앙에 뜨게한다 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
