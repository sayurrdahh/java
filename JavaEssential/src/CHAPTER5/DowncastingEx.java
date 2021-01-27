package CHAPTER5;

public class DowncastingEx { //다운캐스팅이란 업캐스팅된 것을 다시 원래대로 되돌리는 것

	public static void main(String[] args) {
		Person p = new Student("이재문"); //업캐스팅 발생 
		Student s;
		
		s = (Student)p;  //다운캐스팅
		
		System.out.println(s.name);
		s.grade = "A";
		

	}

}
