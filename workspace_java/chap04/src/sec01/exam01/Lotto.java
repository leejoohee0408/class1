package sec01.exam01;

public class Lotto {

	public static void main(String[] args) {
		
	//주말에 풀기
	// 주사위 두개로 나올 수 있는 모든 조합 출력
	/*
	 *  2: [1,1]
	 *  3: [1,2] [2,1]
	 *  4: [1,3] [2,2] [3,1]
	 */ 

for (int i = 2; i <= 12; i++) {
    System.out.print(i + ": ");
    boolean a = true; 
    for (int b = 1; b <= 6; b++) {
        int c = i - b; 
        if (c >= 1 && c <= 6) { 
            if (!a) {
                System.out.print(" ");
            }
        
            System.out.print("[" + b + "," + c + "]");
            a = false;
        }
    }
    System.out.println(); 
}


	// 중복을 제거한 경우의 수
	/*
	 *  2: 1가지
	 *  3: 1가지
	 *  4: 2가지
	 *
	 */

	//로또 : 1~45의 숫자 중
	//중복되지 않은 수 6개 고르기

for (int i=0; i<6; i++ ) {
	int ii = (int)(Math.random()*45)+1;
	if(ii == ii-1) {
	}else {
		System.out.println(ii);
	}
		
	
}


	
	}

}
