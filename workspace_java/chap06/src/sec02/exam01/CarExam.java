package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		String m = myCar.model;
		System.out.println(m);
		
		Car myCar2 = new Car();
		myCar2.model = "롤스로이스 고스트";
		System.out.println("myCar2.model :"+myCar2.model);
		System.out.println("myCar.model :"+myCar.model);
		
		System.out.println("myCar.speed :"+myCar.speed);
		System.out.println("myCar :"+myCar);    
		
		
		
		
		
		
		
		
		
		
		
	}

}
