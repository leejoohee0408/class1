package sec06.exam06.getset;

public class Car {
	
private int speed;
private boolean stop;
	
// 이렇게 마음대로 만들어도 되는데
	public int test() {
		return speed;
	}

	// getter는 보통 필드 값을 리턴하는 기능
	// 메소드명 : get + 필드명(첫글자만 대문자)
	// 전달인자 : 없음
	// 리턴타입 : 필드의 타입
	public int getSpeed() {
//		this.speed++;
		return this.speed;
	}
	
	// setter는 보통 필드 값을 수정하는 기능
		// 메소드명 : set + 필드명(첫글자만 대문자)
		// 전달인자 : 필드의 타입으로된 변수하나
		// 리턴타입 : 없음
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
