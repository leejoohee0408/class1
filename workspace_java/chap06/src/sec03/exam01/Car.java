package sec03.exam01;

public class Car {

	/*
	 * ## 생성자
		클래스를 생성할 때 즉, new할 때 무조건 실행되는 메소드의 일종
		리턴타입이나 return문은 쓰지 않습니다.
		이유는 무조건 생성된 heap 영역의 주소를 돌려주기 때문에 고정값이라서.
		메소드 명에 해당하는 이름은 무조건 클래스 이름이여야 한다
		즉, 리턴타입이 없고 메소드명이 클래스명과 동일한 경우 생성자라고 한다.
	 */
	/*
	 * **기본생성자 :** 전달인자와 실행 내용이 없는 생성자
		public Car( ){ } 
		기본 생성자는 생략가능하다
		즉, 생성자를 적지 않으면 기본 생성자가 자동 완성된다. 
	 */
	
	
	String brand ="아반떼";
	//color에서 null이랑 int에 0이 원래 들어가는데 강조하기 위해서 보여줌
	//만약 null 앞에 건들지 말라고 하면 밑에있는 public Car안에 한다
	String color = null;
	int cc = 0;
	
	//System.out.println();을 쓸려면 public car()안에 넣어야 한다
	
	// 클래스를 new 생성할때
	// 1. 필드 먼저 선언됨
	// 2. 생성자 실행
//	public Car() {
	//public Car(int c)처럼 int를 하면 new Car(2);처럼 ()안에 숫자를 넣는다
	//public Car(String c)처럼 String를 하면 new Car("배");처럼 ()안에 문자를 넣는다
	
	public Car(int c) {
		cc =c;
		color = "흰색";
		System.out.println("Car(int) 생성 :"+c);
		test();
	}
	
 Car(String b){
	 brand = b;
	 System.out.println("Car(String) 생성 :"+brand);
 }
 
 Car(){
	 this("아반떼","흰색",1600);
	 System.out.println("Car() 생성자 실행");
 }
 
 Car(String b, String c, int cc2){
	// 다른 생성자 호출하는 방법
    //Car() 호출
	// 무조건 첫번째 줄에서 호출해야 한다. 
//	 this();
	 brand =b;
	 color = c;
	 cc = cc2;
	 System.out.println("Car(String b, String c, int cc2) 생성자 실행");
	 
	 
 }
 	Car(String brand, int cc){
 		int a = 10;
 		
 		String color = "파랑";
 		System.out.println(color);
 		System.out.println(this.color);
 		
 		this.brand = brand;
 		this.cc = cc;
 	}
 
 	void setBrand(String brand) {
 		this.brand = brand;
 	}
 
	void test() {
		color = "회색";
		System.out.println("test() 실행");
	}
	
	void init() {
		brand = "아반떼";
		color = "흰색";
		cc	  = 1600;
	}
	
}
