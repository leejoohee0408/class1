package quiz;

public class Gugudan {
	
	
//	3단
	void pp(int t) {
		for(int q=1; q<=9; q++) {
			System.out.println(t+"x"+q+"="+(q*t));
	
		}
	}
	
	
	
//	2단~9단 x,y쪽에 출력하는곳에 원하는 몇단을 쓰면 나온다
	void p(int x, int y) {
		for(int q=x; q<=y; q++) {
			
			System.out.println(q+"단");
			pp(q);
		}
		
	}
	
	//위에것을 오버로딩을 해서 간단히 만드는것	
	void p(int x) {
		p(x,9);
	
	}
	//위에것을 오버로딩을 해서 간단히 만드는것	
	void p() {
		p(2,9);
	
	}
	
	
	
}
