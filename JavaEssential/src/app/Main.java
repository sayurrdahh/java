package app;

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
