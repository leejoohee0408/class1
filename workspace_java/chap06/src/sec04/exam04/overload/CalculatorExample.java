package sec04.exam04.overload;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.execute();

		
		// 메소드의 리턴을 사용하거나 말거나 그건 사용측 마음이다
		calc.plus(1, 2);//다음줄이 되면 3이라는 결과값은 청소된다
		
		calc.plus(10.5, 20.3);
		
		int a = 10;
		double b = 20.3;
		calc.plus(a, b);
		
		System.out.println("문자");
		System.out.println(1);
		System.out.println(1.5);
	}

}
