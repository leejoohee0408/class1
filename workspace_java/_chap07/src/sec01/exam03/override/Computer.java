package sec01.exam03.override;

public class Computer extends Calc {

	@Override // 부모에 해당 메소드가 똑같이 있는지 검사해줌
	int plus(int a, int b) {
		int reuslt = a + b;
		System.out.println("문의하신 정답은 ");
		System.out.println(reuslt+"입니다 이것도 몰라");
		return reuslt;
	}
	
//	시프트 + 알트 +  s +  v하면 오버라이드가 나온다
//	내가 원하는건 체크를 해라
//	@Override
//	int plus(int x, int y) {
//		// TODO Auto-generated method stub
//		return super.plus(x, y);
//	}
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle 실행");
		return Math.PI * r * r;
	}

	

	
	

	
	
	
}
