package dynamic_beat_13;

import java.io.*;
import javazoom.jl.player.Player;

public class Music extends Thread{

	private Player player;
	
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/"+name).toURI()); //위치를 가져온다
			fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis); 
			player = new Player(bis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getTime() { //현재 실행되고있는 음악의 위치?알려줌 0.001초단위까지 알려줌 
		if(player ==null)
			return 0; 
		return player.getPosition();
	}
	
	public void close() { //항상 종료할 수 있도록 함
		isLoop = false ;
		player.close();
		this.interrupt(); 
	}
	
	@Override
	public void run() {
		try {
			do {
			player.play(); //곡 실행
			fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis); 
			player = new Player(bis);
			}while(isLoop); //만약에 isloop가 true값이라면 무한반복
		}catch(Exception e) {System.out.println(e.getMessage());
			}
	}
	
	
}
