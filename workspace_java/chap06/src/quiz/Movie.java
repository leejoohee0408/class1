package quiz;

public class Movie {
//	내가 한것들
//	String movie;
//	
//	void Movie(String movie) {
//		System.out.println("무파마");
//	}
//------------------------------------------------------------------------
	//생성자 
	//생성자 선언 : 클래스명 (전달인자들){ }
	
	// 생성자가 없으면
	// 기본생성자 : 클래스명 (){ }
	// 기본적으로 생김 : 클래스명 (){ }  
	// Movie(){ }이게 자동으로 생김
	// 생성자를 적으면 기본생성자는 생성되지 않음
	
	
//	Movie(){
//		System.out.println(1);
//	}
	
	//글자로 쓸거면 String으로 한다
//	Movie(String title){
//		System.out.println("title");
//	}
	//MovieExam에 이걸 넣으면 작동한다
//	new Movie("무파사"); // 제목을 넣어야 한다 
	
	///글자로 쓸거면 String으로 한다, 그리고 숫자는 int로
//	Movie(String title, int ii){
//		System.out.println(title+ ii);
//	}
	//MovieExam에 이걸 넣으면 작동한다
//	new Movie("무파사",2025);
	
	
		
// 생성자로 전달한 값 두개를 저장할 필드를 만들기
// 생성자에서는 전달받은 값 두개로 필드값을 변경
// 그 필드의 내용을 바꾸는 메소드 만들기
	String title; //영화제목
	int year;	  //개봉일
	//t와 y것을 title, year로 바꾸고 위로 저장했다
	Movie(String t, int y){
		title =t;
		year = y;
	}
	// 내가한것
	// 밖에 t, i를 만들어야 했다
//	Movie(String title, int ii){
//		String t = title;
//		int i = ii;
//		System.out.println(t+i);
//	}
	
	//title의 값을 바꿀수 있다
	void setTitle(String title) {
		if(title != null) {
			this.title = title;
			
		}else {
			System.out.println("정확히 입력하세요");
		}
	}
//	Movie c2  = new Movie();
//	System.out.println(c2.title);
//	c2.setTitle("브라질");
//	System.out.println(c2.title);
//	위에 것에 관한것
	Movie(){
		
	}
	
	void print() {
		System.out.println("제목 :"+this.title);
		System.out.println("개봉일 :"+this.year);
	}
	
	
	
}
