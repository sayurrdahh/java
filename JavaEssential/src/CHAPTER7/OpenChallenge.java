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

	v.add(new Word("love","���"));
	v.add(new Word("lol","���׿��극����"));
	v.add(new Word("sensei","��ȯ"));
	v.add(new Word("timo","�ְ�Ϳ����è��"));
	v.add(new Word("animal","����"));
	v.add(new Word("emotion","����"));
	v.add(new Word("SE","�ý��ۿ����Ͼ�"));
	v.add(new Word("grade","����"));
	v.add(new Word("King","��"));
	v.add(new Word("Sorry","�̾�"));
}
	
	public static void game(){
		
		Scanner sc = new Scanner(System.in);
		Vector<String> s = new Vector<String>();
		
		System.out.println("���� ���� �׽�Ʈ�� �����մϴ�. 1~4 �� �ٸ� �Է½� �����մϴ�.");
		while(true) {
			int n = (int)Math.random()*v.size();//���� �ε��� 
			Word w1 = v.get(n); //�� �ε����� ���Ͱ�
			String s1 = w1.getEng(); //�� �ε����� ���Ͱ����� ���
			System.out.println(s1+"?"); //���� ? 

			s.add(w1.getKor());
			//������ ���� 4���� �־���ϰ�, ��ġ�� �ȵǰ�, ������ ���־���Ѵ�.
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
