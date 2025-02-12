package sec05.exam01;

public class Car {
	
	//필드	
	String model;
	int speed;
		
	//생성자
	Car(String model){
		this.model = model;
	}
	
	
	
	//메소드명 : printModel
	//전달인자 : 없음
	//리턴타입 : 없음
	//필드의 model을 출력
	void printModel() {
		System.out.println(this.model);
	}
}
