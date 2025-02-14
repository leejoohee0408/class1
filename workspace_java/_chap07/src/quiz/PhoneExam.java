package quiz;

public class PhoneExam {

	public static void main(String[] args) {
		
//		Phone q = new Phone();
//		
//		q.onOff();
//		System.out.println("전원 상태: " + (q.power ? "켜짐" : "꺼짐"));
//		
//		q.call("010-9917-1063");
//		
//		q.bell();
//		
//		q.onOff();
//		System.out.println("전원 상태: " + (q.power ? "켜짐" : "꺼짐"));
		
		
		PhoneCalc q = new PhoneCalc();
		q.onOff();
		q.kko(0,0);
		q.call("010-9917-1063");
		q.onOff();
		
		
		

	}

}
