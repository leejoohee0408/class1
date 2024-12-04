package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.println(a + ", "+ b);
		 b = 12;
		 System.out.println(a + ", "+ b);
		 
		 String c ="이주희";
		 // = 을 기준으로 오른쪽이 먼저 실행된다
		 // "최민수"를 힙heap에 영역의 비어있는 번지에 할당
		 // 스택stack 영역의 변수 c에 그 번지가 기록된다
		 System.out.println("c : "+ c);
		 
		 System.out.println(a == b);
		 // == 무조건 stack의 값을 비교한다
		 
		 // 무조건 힙영역의 새로운 번지에 할당하는 방법
		 String d = new String("이주희"); 
		 System.out.println(d);
		 System.out.println(c == d);
		 // == 무조건 stack의 값을 비교한다
		System.out.println(c.equals(d)); 
	     // String 값의 비교는 equals()를 사용한다
		
		String e = "이주희";
		System.out.println(c == e);
		 
//		a =null;
		// 기본 타입은 null을 넣을 수 없다
		
		// null은 참조하는 주소가 없는 상태
		String f = "휴먼";
		System.out.println("f == null : "+ (f == null));
		System.out.println("f != null : "+ (f != null));
		
		 f = null;	// f = ""와 다릅니다
			System.out.println("f == null : "+ (f == null));
			System.out.println("f != null : "+ (f != null));
		 
		 System.out.println("f + \"abc\" : " + (f +"abc"));
		 
		 //초기화나 값이 할당되지 않은 경우 사용은 못한다
		// String  g;
		 //이것은 null이라는 값을 할당한 것
		 String  g = null;
		 System.out.println("g == null"+ (g == null));
		
		 //지금 한게 널이 이미 아닌데 널이 아닌것을 입력한거니까
		 //의미 좃도 없음 신경쓰지 마셈
		 //결과값이 안나오는게 정상
		 if(g != null) { //방어코딩
		 System.out.println("g.equals : "+ g.equals(c));
		 } 
		 
		 
		 
		 
		 
		 
		 
	}

}
