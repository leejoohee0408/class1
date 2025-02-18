package Phone;

public class PhoneExam {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.call("010-9917-1063");
		p1.call1("010-9917-1063");
		System.out.println("--------------------------");
		Phone1 p2 = new Phone1();
		p2.call("010-9917-1063");
		p2.call1("010-9917-1063");
		p2.mj("010-9917-1063");
		System.out.println("---------------------------");
		SmartPhone p3 = new SmartPhone();
		p3.call("010-9917-1063");
		p3.call1("010-9917-1063");
		p3.mj("010-9917-1063");
		p3.itn("010-9917-1063");
		
	}

}
