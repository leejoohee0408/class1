package text;

public class Song {
	
	String title; //제목
	String singer;	//가수명
	int like;		//좋아요 수
	
	
	/**
	 * 제목을 전달 받아서
	 * title을 변경하는 메소드 만들기
	 * 메소드명 : setTitle 
	 * 
	 * @param String을 받는 이유는 제목꺼를 받기때문
	 * @return void
	 */
	//메소드 선언
	//리턴타입 메소드명(전달인자들){ }
	
	
	void setTitle(String t) {
		title = t;
	}
	
	//생성자
	Song(){
		System.out.println("실행");
		
	}
	
	// void에 바꿀 setTitle로 넣고 ()안에 바꾸기전의 것인 String title을 넣고
	// String 앞에 있는 제목인 title을 넣는다
//	void setTitle (String title) {
//		this.title = title;
//	}
	
	
	//double 두개를 더하기 한 결과를 돌려주는 메소드 plus를 만드시오
	
	
//	double plus(double a, double b) {
//		return a+b;
//	}
	
	//double로 plus라는 메소를 생성하고 double로 a,b을 만들고
	//a+b한것을 double ll로 변환하고
	//void가 아니여서 return을 무조건 넣어서 실행
	double plus(double a, double b) {
	double ll	= a+b;
	System.out.println("결과 : "+ ll);
		return ll;
	}

}
