package LottoExam;

import java.util.Random;

public class LottoExam {

	public static void main(String[] args) {
		
				//로또 : 1~45의 숫자 중
				//중복되지 않은 수 6개 고르기
				
				
		System.out.println("-------로또 기모찌--------");		
		
		
				
				
		 int[] q = new int[6]; // 중복되지 않는 6개의 숫자를 저장할 배열
	        Random r = new Random();
	        
	         // 배열에 숫자를 추가한 개수를 추적
	        for (int qq=0;qq < 6;) {
	            int ii = r.nextInt(45) + 1; // 1부터 45까지의 랜덤 숫자 생성
	            boolean ww = false; // 중복 여부 체크
	            
	            // 배열에 이미 숫자가 있는지 확인
	            for (int i = 0; i < qq; i++) {
	                if (q[i] == ii) {
	                    ww = true; // 중복된 숫자 발견
	                    break; // 중복된 숫자가 있으면 더 이상 체크하지 않음
	                }
	            }
	            
	            // 중복되지 않으면 배열에 추가
	            if (!ww) {
	                q[qq] = ii;
	                qq++;
	            }
	        }

	        // 결과 출력
	        System.out.println("중복되지 않은 수 6개:");
	        for (int num : q) {
	            System.out.println(num);
	        }		
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
