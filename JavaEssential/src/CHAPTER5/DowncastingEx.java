package CHAPTER5;

public class DowncastingEx { //�ٿ�ĳ�����̶� ��ĳ���õ� ���� �ٽ� ������� �ǵ����� ��

	public static void main(String[] args) {
		Person p = new Student("���繮"); //��ĳ���� �߻� 
		Student s;
		
		s = (Student)p;  //�ٿ�ĳ����
		
		System.out.println(s.name);
		s.grade = "A";
		

	}

}
