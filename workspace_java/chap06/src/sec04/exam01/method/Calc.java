package sec04.exam01.method;

public class Calc {

	//전원, false: 꺼짐, true: 켜짐
	boolean isOn = false;
	
	// 전원을 켜는
	// isOn = true 바꿔주는
	// 메소드 선언
	void powerOn() {
		isOn = true;
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		isOn = false;
		System.out.println("전원이 꺼짐");
	}
	
	/**
	 * 더하기
	 * 두 수를 입력 받아서 더한 결과를 돌려줌
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int
	 * @author : todair@naver.com
	 * 
	 */
	int plus(int x, int y) {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
		
		int result = x + y;
		
		return result;
		
	}
	
	/**
	 * 나누기
	 * 두 정수를 받아서
	 * 나누기한 결과를
	 * 돌려준다
	 * 	// 10, 4 전달 시 2.5 돌려받음
	 * 
	 * 	메소드명 ; divide
	 * 	전달인자 : int x, int y
	 * 	리턴타입 : double
	 */
	
	double plus2(double x, double y) {

		double result = x / y;
		
		
		return result;
	
	
	}
	
	
	
	// 배열을 전달할때 얕은복사에 관하여
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// ...가변인자
	// 다른데서 사용할때 : sum2(1,2,3,4)
	// 내부에서 사용할때 values는 배열 취급
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
