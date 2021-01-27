package CHAPTER4;

public class Book1 {
String title;
String author;

void show() {System.out.println(title+" "+author);}

public Book1() { //생성자
	this("",""); //this()는 생성자의 첫번째 문장으로 사용되어야 한다 / 같은 클래스의 다른 생성자를 호출할 때 사용된다.
	System.out.println("생성자 호출됨");
}

public Book1(String title) { //생성자
	this(title,"작자미상"); //this()는 생성자의 첫번째 문장으로 사용되어야 한다 /같은 클래스의 다른 생성자를 호출할 때 사용된다.
}

public Book1(String title, String author) { //생성자
	this.title = title;
	this.author = author;
	
}
	public static void main(String[] args) {
		Book1 littlePrince = new Book1("어린왕자","생택쥐페리"); //객체 생성
		Book1 lovestory = new Book1("춘향전");
		Book1 emptyBook = new Book1();
		lovestory.show();
	}

}
