package sec05.exam02._static;

public class CalcExam {

	public static void main(String[] args) {
		
		System.out.println(Calc.pi);
	Calc c = new Calc();
	c.color = "purple";
	System.out.println(c.pi);
	
		
//		Calc.pi = 3.33;
//		System.out.println(Calc.pi);
		
		Calc c2 = new Calc();
		c2.color = "purple";
		System.out.println(c2.pi);
		
		Calc.pi = 2;
		System.out.println(c2.pi);
		
		Calc.printPi();
		
		/*Print페이지에서
		 * void println(String s) {
			System.out.println(s);
			}
		Calc페이지에서
		static	Print out =	new Print();을 하고
		여기서 Calc.out.println("글씨");를 해서 출력을 하면 글씨라고 나온다
		지금한건 System.out.println의 작동법을 알려준것이다 이름만 바꾼것임.
		*/		
		Calc.out.println("글씨");
		
		c.printPi2();
		
//		test();
		CalcExam ce = new CalcExam();
		ce.test();
//		ce.main(new String[] {"abc"});
		
//		CalcExam.main(new String[] {"abc"});
	}
	
//	static void test() {
//		
//	}
		void test() {
		
	}

}
