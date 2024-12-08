package jumal;



public class Jumal1208 {

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
				 */
		 
		 
		 
		 
		 
		 
				
				//로또 : 1~45의 숫자 중
						//중복되지 않은 수 6개 고르기

		 
		 
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
		 
		 
			for (int i=0; i<6; i++ ) {
				int ii = (int)(Math.random()*45)+1;
				if(ii == ii-1) {
				}else {
					System.out.println(ii);
				}
					
				
				
			}
		 
		 
		 
	}

}
