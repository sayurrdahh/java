package CHAPTER6;

public class Test003 {

	public static void main(String[] args) {

		while(true) {
			int x = (int)(Math.random()*3+1);
			int y = (int)(Math.random()*3+1);
			int z = (int)(Math.random()*3+1);
			
			System.out.println(x +"\t"+y+"\t"+z);
			if(x==y&&y==z) {
				System.out.println("¼º°ø");
				break;
			}
			
		}
	}

}
