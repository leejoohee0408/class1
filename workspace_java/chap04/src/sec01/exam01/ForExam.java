package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// 1씩 증가하는 것을 5번 하고싶다
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum :"+ sum);
		
		// 1 + 2 + 3 + 4 + 5
		//참고로 1 ~ n까지의 합
		//n*(n + 1) /2
		sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println("sum :" + sum);
		
		int i = 1;
		sum = 0;
		sum = sum + i; //1
		i++;//i를 1더 더한다
		sum = sum + i; //2
		i++;//i를 1더 더한다
		sum = sum + i; //3
		i++;//i를 1더 더한다
		sum = sum + i; //4
		System.out.println(sum);
		
		/*
		 * 반복문을 만드는 원리
		 * 1. 반복 되는 것 찾기 
		 * ctrl + c, v 했을때 바뀌지 않는 것
		 * 
		 * 2. 반복 되지 않은 것 찾기
		 * 규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있다
		 * 그럴경우 변수를 활용해서 더이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 조건
		 * 
		 * 4. 종료 조건
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 * 
		 */
		
		int sum2 = 0;
		for (int e=1; e<=5; e++) {
//확인용	System.out.println("e :" + e);
			sum2 = sum2 +e;
//확인용	System.out.println("sum2 :" + sum2);
				
		}
		System.out.println("최종sum2 :" + sum2);
		
		
		
		
		
		//1~10까지 출력
		for(int q2=1; q2<=10; q2++) {
			System.out.println(q2);
		}
		
		long s =0;
		
		for(long q3=1; q3<=100; q3++) {
			s = q3 +s ;
		}
		System.out.println("합"+ s);
		
		
		int sum5 =0;
		int i5 =1;
		sum5 = sum5 + i5;
		i5 += 1; //2
		sum5 = sum5 +i5;
		i5 += 1;//3
		sum5 = sum5 +i5;
		i5 += 1;//4
		sum5 = sum5 +i5;
		i5 += 1;//4
		sum5 = sum5 +i5;
		
		int sum6 =0;
		for(int i6 =1;i6 <= 100; i6 += 1) {
			sum6 = sum6 +i6;
		}
		System.out.println("sum6의 값은 :" + sum6);
		
		//개구리가 좋아하는 깜짝이야 퀴즈
		//10~ 1 출력하시오
		int i7 = 10;
		for(int i8 =10; i8 >= 1; i8--) {
			System.out.println(i8);
		}
		
		//깜짝 놀라는 퀴즈 2
		//1 ~ 20 까지 짝수만 출력하시오
		
		for(int qw2=2; qw2<=20; qw2=qw2+2) {
			
			
			System.out.println("1~20 :"+qw2);
		}
		
		
		//1 ~ 20 까지 3의 배수만 출력하시오 
		
		for(int qw3=0; qw3<=20; qw3=qw3+3) {
			
			
			System.out.println("1 ~ 20 까지 3의 배수:"+qw3);
		}
		
		// 1 ~ 5 까지 모두 출력하면서 홀/짝
		// 1 : 홀수
		// 2 : 짝수
		for(int wq2=1; wq2<=5; wq2++) {
			if((wq2 % 2) == 0) {
				System.out.println(wq2 + "= 짝" );
			} else {
				System.out.println(wq2 + "= 홀" );
			}
		}		
		//1 ~ 20까지 홀수의 합
		int wq4 = 0;
		for(int wq3=1; wq3<=20;wq3=wq3+2) {
			wq4 += wq3;
			
		}
		System.out.println("1~20 홀수 합 :"+wq4);
		
		//1 ~ 20까지 홀수의 개수
		int cnt =0;
		for(int wq5=1; wq5<=20;wq5=wq5+2) {
		 cnt += 1;
		}
		System.out.println("1~20 홀수 개수 :"+cnt);
		
		//1 ~ 10까지 옆으로 3개씩 출력
		//	1 2 3
		//	4 5 6
		//	7 8 9
		//	10
		
		for(int ii=1; ii<=10; ii++) {
			if((ii % 2 == 0) || (ii % 3 == 0)) {
				System.out.println(ii);
			}
		}
		
//		System.out.println("1 ~ 10까지 옆으로 3개씩 출력");
//		System.out.print(1);
//		System.out.print(2);
//		System.out.println(3);
//		System.out.print(4);
//		System.out.print(5);
//		System.out.println(6);
//		System.out.print(7);
//		System.out.print(8);
//		System.out.println(9);
//		System.out.println(10);
		
		
		//구구단 2단 출력
		// 2 x 1 =2
		// 2 x 2 =4
//		System.out.println("구구단 2단 출력");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);

	}

}
