package CHAPTER5;

class Person {
	String name; //name �ʵ�
	String id;
	
	public Person(String name) { //������? 
		this.name = name; //this�� �ַ� �����ڿ� �޼ҵ��� �Ű� ���� �̸��� �ʵ�� ������ ���, �ν��Ͻ� ����� �ʵ����� ����ϰ��� �� �� ���ȴ�.
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student (String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("���繮");
		p=s; //��ĳ���� : ���� Ŭ����(student) ��ü�� ���� Ŭ����(person) Ÿ������ ��ȯ�Ǵ� ���� ��ĳ�����̶�� �Ѵ�.

		System.out.println(p.name);
	}

}
