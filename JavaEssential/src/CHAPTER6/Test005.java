package CHAPTER6;

class Adder {
	private int x,y;
	public Adder(int x, int y) {
		this.x = x; this.y = y;
	}
	public int add() {return x+y;}
}
public class Test005 {

	public static void main(String[] args) {

		Adder adder = new Adder(2, 5);
		System.out.println(adder.add());
	}

}

/*util 패키지 Adder / app 패키지 Main가서 확인 가능
 * package util;

public abstract class Adder {
	public int x,y;
	public int add(int x, int y) {
		return x+y;
	}
}
-----------------------
 * package app;

import util.Adder;

public class Main extends Adder {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		Adder adder = new Main();
		System.out.println(adder.add(2, 5));

	}

}

 * 
 * */
