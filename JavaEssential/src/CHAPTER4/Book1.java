package CHAPTER4;

public class Book1 {
String title;
String author;

void show() {System.out.println(title+" "+author);}

public Book1() { //������
	this("",""); //this()�� �������� ù��° �������� ���Ǿ�� �Ѵ� / ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���ȴ�.
	System.out.println("������ ȣ���");
}

public Book1(String title) { //������
	this(title,"���ڹ̻�"); //this()�� �������� ù��° �������� ���Ǿ�� �Ѵ� /���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���ȴ�.
}

public Book1(String title, String author) { //������
	this.title = title;
	this.author = author;
	
}
	public static void main(String[] args) {
		Book1 littlePrince = new Book1("�����","�������丮"); //��ü ����
		Book1 lovestory = new Book1("������");
		Book1 emptyBook = new Book1();
		lovestory.show();
	}

}
