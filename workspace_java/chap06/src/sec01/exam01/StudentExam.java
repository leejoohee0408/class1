package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		System.out.println(s1 == s2); // 달라서 false
		
		Student s3 = null; // s3에 null을 해서 s1이랑 같은곳을 볼수 있다
		s3 = s1;
		System.out.println(s1 == s3); // 같아서 true
		
		s2 = null;
		
		//객체의 데이터가 저장되는 곳이 필드라고 한다. 
		
		//클래스 안에 있는것을 메소드라고 한다
		
		/*
		 * new 할때 무조건 생성되는 것을 생성자라고 한다
		 * 메소드의 일종이다
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
