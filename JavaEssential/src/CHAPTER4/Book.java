package CHAPTER4;

public class Book {
	String title; //�ʵ�
	String author; //�ʵ�
	
	public Book(String t) { //������ 1 
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) { //������ 2
		title = t;
		author = a;
	}
	

	public static void main(String[] args) {
		Book littlePrince = new Book("�����","�������丮"); //������ 2ȣ��
		Book loveStory = new Book("������"); //������ 1ȣ��
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+ " "+loveStory.author);
	}

}
