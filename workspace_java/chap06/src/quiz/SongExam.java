package quiz;

public class SongExam {

	public static void main(String[] args) {
		
		
		// Song 클래스를 생성
		// 제목과 가수명을 넣고
		// 제목, 가수명, 좋아요수 출력
		
		
		Song c  = new Song(); //song에 있는것을 c로 옮겼다
		c.title ="home"; //song안에 있는 제목인 title을 넣는다
		c.singer = "g-d"; //song안에 있는 가수명singer을 넣는다
		
		System.out.println(c.title);
		System.out.println(c.singer);
		System.out.println(c.like);
		
		
		
		Song c2  = new Song();
		c2.title ="apt";
		c2.singer = "로제";
		System.out.println(c2.title);
		System.out.println(c2.singer);
		System.out.println(c2.like);
		
		
		
		//song3은
		//setTitle() 이용하기
		//Song 제목인 titl를 setTitle로 변경해놨고 그걸 c3에 넣는다
		Song c3  = new Song();
		c3.setTitle("wh");
		
		//plus 메소드안에 있는것을 3.5, 7.5로 넣어서 a에 넣는다
		double a =c3.plus(3.5, 7.5);
		//a에 넣은것을 출력
		System.out.println(a);
		
		
	}

}
