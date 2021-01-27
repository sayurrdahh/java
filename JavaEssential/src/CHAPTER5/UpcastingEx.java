package CHAPTER5;

class Person {
	String name; //name 필드
	String id;
	
	public Person(String name) { //생성자? 
		this.name = name; //this는 주로 생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우, 인스턴스 멤버인 필드임을 명시하고자 할 때 사용된다.
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
		Student s = new Student("이재문");
		p=s; //업캐스팅 : 서브 클래스(student) 객체가 슈퍼 클래스(person) 타입으로 변환되는 것을 업캐스팅이라고 한다.

		System.out.println(p.name);
	}

}
