package CHAPTER7;

import java.util.*;

class Word{
	private String eng, kor;
	
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public String getKor() {
		return kor;
	}
	
	
}



public class OpenChallenge {
	Vector<Word> v = new Vector<Word>();
	public OpenChallenge() {

	v.add(new Word("love","사랑"));
	v.add(new Word("lol","리그오브레전드"));
	v.add(new Word("sensei","경환"));
	v.add(new Word("timo","최고귀여운롤챔프"));
	v.add(new Word("animal","동물"));
	v.add(new Word("emotion","감정"));
	v.add(new Word("SE","시스템엔지니어"));
	v.add(new Word("grade","성적"));
	v.add(new Word("King","왕"));
	v.add(new Word("Sorry","미안"));
}
	
	public static void game(){
		
		Scanner sc = new Scanner(System.in);
		Vector<String> s = new Vector<String>();
		
		System.out.println("영어 어휘 테스트를 시작합니다. 1~4 외 다른 입력시 종료합니다.");
		while(true) {
			int n = (int)Math.random()*v.size();//랜덤 인덱스 
			Word w1 = v.get(n); //그 인덱스의 벡터값
			String s1 = w1.getEng(); //그 인덱스의 벡터값에서 영어값
			System.out.println(s1+"?"); //영어 ? 

			s.add(w1.getKor());
			//무작위 보기 4개가 있어야하고, 겹치면 안되고, 정답이 들어가있어야한다.
			for(int i=0;i<3;i++) {
				int m = (int)Math.random()*v.size();
				Word w2 = v.get(m);
				String s2 = w2.getKor(); 
				if(!s.contains(s2)) 
					s.add(s2);
				else 
					i = i-1;
			}
			
			for(int i=0;i<4;i++) {
				int r =  (int)Math.random()*s.size();
				System.out.print("("+s.get(r)+") ");
			}
			System.out.print(" : >");
		
	
				
			
			
			
		}
	}
	public static void main(String[] args) {
		
		game();
	}

}
