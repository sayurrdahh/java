package CHAPTER4;

public class Book {
	String title; //필드
	String author; //필드
	
	public Book(String t) { //생성자 1 
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) { //생성자 2
		title = t;
		author = a;
	}
	

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생텍쥐페리"); //생성자 2호출
		Book loveStory = new Book("춘향전"); //생성자 1호출
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+ " "+loveStory.author);
	}

}
