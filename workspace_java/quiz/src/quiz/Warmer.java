package quiz;

public class Warmer {

	//생성자
//	Warmer(){
//		
//	}
	//메소드
	//String onOff;
	
	
	// 하나로 합쳤다 킨거랑 끈거랑 String onOff에 저장
		String onOff;
		String onOf2;
		//이건 위에있는 String onOff;을 this.onOff로 해서 전달받음
		void display() {
			
			System.out.println(this.onOff);
			System.out.println(this.onOf2);
		}
		
//	전원 켜기기능 
	void powerOn() {
		System.out.println("켜기요");
//		String onOff = "켜기";
		this.onOff ="켜기";
		this.onOf2="저온";
		// 지역변수라서 이 메소드 또는 이 {} 안에서만 사용 가능
		// display 메소드에서 참조할 수 없음
		// 그래서 필드에 String onOff 만들고
		// 거기에 저장해야겠다
	}

	// 전원 끄기기능
		void powerOut() {
			System.out.println("끄기요");
			this.onOff="끄기";
			this.onOf2="발열없음";
			// 지역변수라서 이 메소드 또는 이 {} 안에서만 사용 가능
					// display 메소드에서 참조할 수 없음
					// 그래서 필드에 켜기에 저장했던 String onOff 만들고
					// 거기에 저장해야겠다
		}
		
	// 저온 발열 기능 (단, 전원이 켜져 있을때만)
		void low() {
			if("켜기".equals(this.onOff)) {
				System.out.println("저온으로 따뜻하게");
				
			}else if("끄기".equals(this.onOff)){
				System.out.println("전원이 꺼져있습니다 ");
				
			}
			
		}
	// 고온 발열 기능 (단, 전원이 켜져 있을때만)
		void up() {
			if("켜기".equals(this.onOff)) {
				System.out.println("고온으로 따뜻하게");
			}else if("끄기".equals(this.onOff)){
				System.out.println("전원이 꺼져있습니다");	 
				
			}
			
		}
		
				
		
		
		
		
		
	// 발열 중지 기능 
	// 상태 표시 기능 (전원 상태와 발열 상태 출력)
	
		
	
		
		
		
	
	
	
//	String i = "전원 켜기"; // 전원 켜기
//	String i2 = "전원 끄기"; // 전원 끄기
//	String i3 = "저온 발열기능"; // 저온 발열기능
//	String i4 = "고온 발열기능"; // 고온 발열기능
//	String i5 = "발열 중지기능";// 발열 중지기능
//	String i6 = "상태 표시기능"; // 상태 표시기능
	
	// 참이면 전원이 켜져 있고
	// 거짓이면 전원을 끈다
	
//	void it(String s, String s2, String s3,String s4,String s5){
//		if (i.equals(s)) {
//			System.out.println("전원 켜기");
//			// s+s2 = //전원켜기고 저온 발열기능
//	        } else if (i3==s+s2) {
//	        	System.out.println("저온 발열기능");
//	        } else if (i4==s+s3) {
//	        	System.out.println("고온 발열기능");
//	        } else if (i5==s+s4) {
//	        	System.out.println("발열 중지기능");
//	        } else if (i6==s+s5) {
//	        	System.out.println("상태 표시기능");	
//	            }else {
//	            	System.out.println("전원끄기");
//	            	 
//	            }
//		}
	
}
