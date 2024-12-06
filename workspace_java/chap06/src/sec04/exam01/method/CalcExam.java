package sec04.exam01.method;

public class CalcExam {
	
	// 전달인자 선언의 ()
	public static void main(String[] args) {
		
		
		Calc calc = new Calc();
		calc.powerOn(); // 실행의 ()
		System.out.println("calc.isOn : "+calc.isOn);
		
		calc.powerOff();
		System.out.println("calc.isOn : "+calc.isOn);
		
		int b =7;
		//plus은 메모장 정리
		int a = calc.plus(b, 10);
		
		
		Calc calc2 = new Calc();
		
		
		double c =100000;
		double d =40000;
		double a2 = calc2.plus2(c,d);
		System.out.println(a2);
		
		
		//1배열로 해버리기
		Calc[] e = new Calc[10];
		e[0] = new Calc();
		
		//2배열로 해버리기
		Calc[] g = {new Calc(),new Calc()};
		
	boolean e0 = e[0].isOn;
	
	
	
	
	int[] f = {1,2,3,4,5};
	int f1 = calc.sum1(f);
	System.out.println("f1 :"+f1);
	
	
	
	int f2 = calc.sum2(f);
	int f3 = calc.sum2(1,2,3,4,5);
	System.out.println("f2 : "+f2);
	System.out.println("f3 : "+f3);
	}

}
