package sec05.exam02._static;

public class Calc {

	String color;
	//static을 쓰면 new를 하지않고 가져올수있다	
//	static double pi = 3.14;
	static double pi ;
	
	static{
		pi = 3.141592;
//		color = ""; static이 아니므로 사용 불가
	}
	
	Calc(){
		pi = 3.141592;
	}
	Calc(double pi){
		Calc.pi = pi;
	}
	
	static	Print out =	new Print();
	
	static void printPi() {
//		System.out.println("pi:" + this.pi);
		System.out.println("pi:" + pi);
	}
//	static void printColor() {
////		System.out.println("color:" + this.color);
//		System.out.println("color:" + color);
//	}
	
	void printPi2() {
//		System.out.println("pi:" + this.pi);
		System.out.println("pi:" + pi);
	}
}
