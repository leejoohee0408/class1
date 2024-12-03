package sec01.exam01;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		//while문 에서 break 사용방법
		System.out.println("자 인생은 도박");
		int qq = 0; //개수
		while(true) {
			int num = (int) (Math.random() * 6) +1; // 1~6 까지
			System.out.println(num);				// num의 값
			qq +=1;  //개수
			
			if(num == 6) { // num가 6일때 멈춤
				break;
			
				
			}
			//여기에 qq +=1;를 하면 if에 6으로 했으면
			//if에서 멈춘거의 뒤에 것들을 카운트한다
		}
		System.out.println("프로그램 종료: 총 :"+qq+"번");
		
		for (int i=1; i<10; i+=2) {
			System.out.println(i);
			
			if(i >= 5) { //혹시 몰라서
				break;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("i: "+i);
			
			for(int j=0; j<3; j++) {
				if(j >=2) { // 2이상일때 브레이크
					break;
				}
				System.out.println("j: "+j);
			}
			System.out.println();
		}
		
		boolean isStop = false;//false를 isStop라고 했다
		
		for(int i=0; i<5; i++) {
			System.out.println("i: "+i);
	
			for(int j=0; j<30; j++) {
				if(j >=2) { // 2이상일때 브레이크
					isStop =true; //직전에 true인것을 만듬
					break;
				
				}
			System.out.println("j: "+j);
			}
			if(isStop) { //그 true인 것을 이용해서 브레이크
			break;
			}
			System.out.println();
	
		}
		
			for(int i=1; i<=10; i++) {
					if(i % 2 == 0) { 		//짝수
							System.out.println(i);
					}
			}
			for(int i=1; i<=10; i++) {
					if(i % 2 == 0) { 	//홀수
						continue;	//위에 나오는것을 패스해서 			
				}					//짝수말고 홀수만 출력
				System.out.println(i);
			}
			
			/*
			 * 1. 예금
			 * 예금액이 음수 불가
			 * 
			 * 2. 출금
			 * 출금액 음수 불가
			 * 잔고보다 큰 금액 불가
			 * 
			 * 
			 */
//			boolean run = true;
//			int balance =0;
//			Scanner scanner = new Scanner(System.in);
//			
//			
//			while(run) {
//				System.out.println("---------------------");
//				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//				System.out.println("---------------------");
//				System.out.println("선택> ");
//				
//				balance =scanner.nextInt();
//				if(balance <=1) {
//					System.out.println("예금액>");
//				}else if(balance <=2) {
//					System.out.println("출금액>");
//				}else if(balance <=3) {
//						System.out.println("잔고>");
//				}		
//				if(balance <= 4) {
//					break;
//				}
//					
//				
//			}
//			System.out.println("프로그램 종료");
//			
			
			
			Scanner scan = new Scanner(System.in);
			int balanc =10000;
			
			do {
				System.out.println("---------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("---------------------");
				System.out.println("선택> ");
				int men = scan.nextInt();
				
				if(men == 1) {
					System.out.println("예금액 : ");
					int input = scan.nextInt();
					if(input >0) {
						balanc += input;
					}else {
						System.out.println("예금액을 확인해주세요");
					}
				}else if(men == 2 ) {
					System.out.println("출금액 : ");
					int output = scan.nextInt();
					if(output <0 || balanc < output) {
						System.out.println("출금액을 확인해주세요");
					}else {
						System.out.println("출금액 :"+ output);
						balanc -= output;
						
						System.out.println("출금 후 잔액 :"+  balanc);
					}
				}else if(men ==3 ) {
					System.out.println("잔액 :" + balanc);
				}else if(men ==4 ) {
					System.out.println("종료합니다");
					break;
				}
			}while (true);
			
			
	
	}

}
