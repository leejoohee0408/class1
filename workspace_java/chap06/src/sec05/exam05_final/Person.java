package sec05.exam05_final;

public class Person {

	final String nation = "Korea";
	final String ssn;
	
	//	상수
	static	final double pi = 3.14;
	
	//	생성자
	Person(){
		this.ssn = "1234";
	}
	
	//	메소드(내가 사용하는거라서 이걸쓰지마라 위에 생성자에서 해라)
	void test() {
//		this.ssn = "1234";
	}
}
