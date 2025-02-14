package quiz;

public class PhoneCalc extends Phone{

	@Override
	void onOff() {
		if(this.power == true) {
			System.out.println("전원 상태: " + (power ? "꺼짐" : "켜짐"));
			
		}else {
			System.out.println("전원 상태: " + (power ? "꺼짐" : "켜짐"));
		}
		super.onOff();
	}
	
	int kko(int x, int y) {
		if((x+y) == 0) {
			System.out.println("카카오에 접속 되었습니다");
		}else {
			System.out.println("카카오 접속이 불가합니다");
		}
		return x + y;
	}

	@Override
	void call(String number) {
		System.out.println(number+"를 입력했습니다");
		super.call(number);
	}
	

	
	
	
	
	
	
	
}
