package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {
		
		//로또 : 1~45의 숫자 중
		//중복되지 않은 수 6개 고르기
		
		double rand = Math.random();
		/*
		 * 0 이상 1미만
		 */
		rand = Math.random();	//0 ~ 0.999999999
		double temp1 = rand * 45; //0 ~ 44.999999999
		int temp2 = (int)temp1; //0 ~ 44
		int lottol = temp2 + 1; //1 ~ 45
		System.out.println(lottol);
		
		rand = Math.random();	//0 ~ 0.999999999
		double temp3 = rand * 45; //0 ~ 44.999999999
		int temp4 = (int)temp3; //0 ~ 44
		int lottol3 = temp4 + 1; //1 ~ 45
		System.out.println(lottol3);
		
		rand = Math.random();	//0 ~ 0.999999999
		double temp22 = rand * 45; //0 ~ 44.999999999
		int temp23 = (int)temp22; //0 ~ 44
		int lottol33 = temp23 + 1; //1 ~ 45
		System.out.println(lottol33);
		
		rand = Math.random();	//0 ~ 0.999999999
		double temp33 = rand * 45; //0 ~ 44.999999999
		int temp24 = (int)temp33; //0 ~ 44
		int lottol4 = temp24 + 1; //1 ~ 45
		System.out.println(lottol4);
		
		rand = Math.random();	//0 ~ 0.999999999
		double temp44 = rand * 45; //0 ~ 44.999999999
		int temp25 = (int)temp44; //0 ~ 44
		int lottol5 = temp25 + 1; //1 ~ 45
		System.out.println(lottol5);
		
		rand = Math.random();	//0 ~ 0.999999999
		double temp55 = rand * 45; //0 ~ 44.999999999
		int temp26 = (int)temp55; //0 ~ 44
		int lottol6 = temp26 + 1; //1 ~ 45
		System.out.println(lottol6);
		
		
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
			
			
			
			
	for (int i=0; i<6; i++ ) {
			int ii = (int)(Math.random()*45)+1;
			if(ii == ii-1) {
			}else {
				System.out.println(ii);
			}
				
			
			
		}
		
		
		
		
		
		
		
	}

}
