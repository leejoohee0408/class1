package quiz;

public class MovieExam {

	public static void main(String[] args) {
		
//		new Movie(); // 이걸로 생성 못하고
//		new Movie("무파사"); // 제목을 넣어야 한다 
//		new Movie("무파사",2025);
		
		// 생성자로 전달한 값 두개를 저장할 필드를 만들기
		// 생성자에서는 전달받은 값 두개로 필드값을 변경
		// 그 필드의 내용을 바꾸는 메소드 만들기
		Movie c  = new Movie("매트릭스", 100);
		System.out.println(c.title);
		System.out.println(c.year);
		
		// 내가 한것
//		Movie c  = new Movie("a", 100);
//		System.out.println(c);
		
		
		//title의 값을 바꿀수 있다
//		c.setTitle("네오의 사랑");
		c.setTitle(null);
		System.out.println(c.title);
		
//		Movie(){
//			
//		}
		//위에 것에 관한것
		Movie c2  = new Movie();
		System.out.println(c2.title);
		c2.setTitle("브라질"+",한국");
		System.out.println(c2.title);
		
		
		// 클래스의 모든 정보를 출력하는 메소드
		// print
		// 다음의 코드를 대신해주는 메소드
		System.out.println(c.title);
		System.out.println(c.year);
		c.print();
		
	}

}
