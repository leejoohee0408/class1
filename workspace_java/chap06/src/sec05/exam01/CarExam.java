package sec05.exam01;

public class CarExam {

	public static void main(String[] args) {
			
	//Car이라는 생성자에 삽입		
		Car c1 = new Car("롤스로이스");
		Car c2 = new Car("카이엔");
		
		
		//printModel에 삽입한것을 출력	
		c1.printModel();
		c2.printModel();
		
		c1.speed = 1000;
		System.out.println(c1.speed);
		
		int speed;
		speed = 900;
		System.out.println(speed);
		
		System.out.println(c1.model);
		
		c1.model = "롤스로이스 팬텀";
		System.out.println(c1.model);
		
			

	}

}
