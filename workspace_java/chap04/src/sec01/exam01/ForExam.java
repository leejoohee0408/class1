package sec01.exam01;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {

		int sum = 0;

		// 1씩 증가하는 것을 5번 하고싶다
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum :" + sum);

		// 1 + 2 + 3 + 4 + 5
		// 참고로 1 ~ n까지의 합
		// n*(n + 1) /2
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum :" + sum);

		int i = 1;
		sum = 0;
		sum = sum + i; // 1
		i++;// i를 1더 더한다
		sum = sum + i; // 2
		i++;// i를 1더 더한다
		sum = sum + i; // 3
		i++;// i를 1더 더한다
		sum = sum + i; // 4
		System.out.println(sum);

		/*
		 * 반복문을 만드는 원리 1. 반복 되는 것 찾기 ctrl + c, v 했을때 바뀌지 않는 것
		 * 
		 * 2. 반복 되지 않은 것 찾기 규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있다 그럴경우 변수를 활용해서 더이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 조건
		 * 
		 * 4. 종료 조건
		 * 
		 * for : 반복 횟수를 아는 경우 while : 반복 횟수를 모르는 경우
		 * 
		 */

		int sum2 = 0;
		for (int e = 1; e <= 5; e++) {
//확인용	System.out.println("e :" + e);
			sum2 = sum2 + e;
//확인용	System.out.println("sum2 :" + sum2);

		}
		System.out.println("최종sum2 :" + sum2);

		// 1~10까지 출력
		for (int q2 = 1; q2 <= 10; q2++) {
			System.out.println(q2);
		}

		long s = 0;

		for (long q3 = 1; q3 <= 100; q3++) {
			s = q3 + s;
		}
		System.out.println("합" + s);

		int sum5 = 0;
		int i5 = 1;
		sum5 = sum5 + i5;
		i5 += 1; // 2
		sum5 = sum5 + i5;
		i5 += 1;// 3
		sum5 = sum5 + i5;
		i5 += 1;// 4
		sum5 = sum5 + i5;
		i5 += 1;// 4
		sum5 = sum5 + i5;

		int sum6 = 0;
		for (int i6 = 1; i6 <= 100; i6 += 1) {
			sum6 = sum6 + i6;
		}
		System.out.println("sum6의 값은 :" + sum6);

		// 개구리가 좋아하는 깜짝이야 퀴즈
		// 10~ 1 출력하시오
		int i7 = 10;
		for (int i8 = 10; i8 >= 1; i8--) {
			System.out.println(i8);
		}

		// 깜짝 놀라는 퀴즈 2
		// 1 ~ 20 까지 짝수만 출력하시오

		for (int qw2 = 2; qw2 <= 20; qw2 = qw2 + 2) {

			System.out.println("1~20 :" + qw2);
		}

		// 1 ~ 20 까지 3의 배수만 출력하시오

		for (int qw3 = 0; qw3 <= 20; qw3 = qw3 + 3) {

			System.out.println("1 ~ 20 까지 3의 배수:" + qw3);
		}

		// 1 ~ 5 까지 모두 출력하면서 홀/짝
		// 1 : 홀수
		// 2 : 짝수
		for (int wq2 = 1; wq2 <= 5; wq2++) {
			if ((wq2 % 2) == 0) {
				System.out.println(wq2 + "= 짝");
			} else {
				System.out.println(wq2 + "= 홀");
			}
			// 다른방법
			String ea = "홀수";
			if (wq2 % 2 == 0) {
				ea = "짝수";
//			} else {			이밑에 꺼는 string에 홀수를 안했을때 쓴다
//				ea = "홀수";
			}

		}
		// 1 ~ 20까지 홀수의 합
		int wq4 = 0;
		for (int wq3 = 1; wq3 <= 20; wq3 = wq3 + 2) {
			wq4 += wq3;

		}
		System.out.println("1~20 홀수 합 :" + wq4);

		// 1 ~ 20까지 홀수의 개수
		int cnt = 0;
		for (int wq5 = 1; wq5 <= 20; wq5 = wq5 + 2) {
			cnt += 1;
		}
		System.out.println("1~20 홀수 개수 :" + cnt);

		// 1 ~ 10까지 옆으로 3개씩 출력
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 10

		for (int ii = 1; ii <= 10; ii++) {
			System.out.print(ii + " ");
			if (ii % 3 == 0) {
				System.out.println();
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

		// 구구단 2단 출력
		// 2 x 1 =2
		// 2 x 2 =4
//		System.out.println("구구단 2단 출력");
//		System.out.println(2*1 =2);
//		System.out.println(2*2 =4);
//		System.out.println(2*3 =6);
//		System.out.println(2*4 =8);
//		System.out.println(2*5 =10);
//		System.out.println(2*6 =12);
//		System.out.println(2*7 =14);
//		System.out.println(2*8 =16);
//		System.out.println(2*9 =18);
		System.out.println("2 x 1 =2");
		System.out.println("2 x 2 =4");
		int qq6 = 1;
		int qqq6 = 2;
		System.out.println("2 x " + qq6 + " = " + (2 * qq6));
		qq6++;
		qqq6 += 2;
		System.out.println("2 x " + qq6 + " = " + (2 * qq6));

		// 다른방법
		System.out.println("---------q6----------");
		for (int q = 1; q <= 9; q++) {
			System.out.println("2 x " + q + " = " + (2 * q));
		}

		// 1부터 n까지 합을 구하기 & 짝수 구하기
		System.out.println("n을 입력 :");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum8 = 0;
		for (int q = 1; q <= n; q++) {
			sum8 += q;
		}
		System.out.println("1 ~ " + n + "까지 합은 :" + sum8);

		// 구구단 전부 출력
		/*
		 * 2단 출력 -------- 3단 출력
		 * 
		 */
		for (int q = 1; q <= 9; q++) {
			System.out.println("2 x " + q + " = " + (2 * q));
		}
		for (int q = 1; q <= 9; q++) {
			System.out.println("3 x " + q + " = " + (3 * q));
		}

		int q9 = 2;
		for (int q = 1; q <= 9; q++) {
			System.out.println(q9 + " x " + q + " = " + (q9 * q));

		}
		q9++;
		for (int q = 1; q <= 9; q++) {
			System.out.println("q9 x " + q + " = " + (q9 * q));
		}

		for (int dan = 2; dan <= 9; dan++) {// 첫번째 숫자
			// 마무리 하고 다음으로 넘어갈때 나옴
			System.out.println(" -- " + dan + "단--");

			for (int q = 1; q <= 9; q++) {// 두번째 숫자
				// 위에 있는거랑 같이 결과값 나옴
				System.out.println(dan + " x " + q + " = " + (dan * q));
			}
		}

		// 한줄에 1단씩 출력
		// 2 x 1=2 2 x 2 =4... 2 x 9=18
		// 3 x 1=3 3 x 2 =6... 3 x 9=27

		for (int ii2 = 2; ii2 <= 9; ii2++) {
			System.out.println(" ");
			for (int ii3 = 1; ii3 <= 9; ii3++) {
				System.out.print("," + ii2 + "x" + ii3 + "=" + (ii2 * ii3));

			}

		}
		System.out.println("");
		// 두 ~세 단씩 옆으로 출력
		// 2x1=2 3x1=3
		// ... ...
		// 2x9=18 3x9=27

		for (int ii2 = 2; ii2 <= 2; ii2++) {
			System.out.println("------" + ii2 + "단----");

			for (int ii4 = 3; ii4 <= 3; ii4++) {

				for (int ii3 = 1; ii3 <= 9; ii3++) {
					System.out.println(ii2 + "x" + ii3 + "=" + (ii2 * ii3) + "," + ii4 + "x" + ii3 + "=" + (ii4 * ii3));

				}

			}

		}
		for (int ii2 = 4; ii2 <= 4; ii2++) {
			System.out.println("------" + ii2 + "단----");

			for (int ii4 = 5; ii4 <= 5; ii4++) {

				for (int ii3 = 1; ii3 <= 9; ii3++) {
					System.out.println(ii2 + "x" + ii3 + "=" + (ii2 * ii3) + "," + ii4 + "x" + ii3 + "=" + (ii4 * ii3));

				}

			}

		}

		int k = 1;
		int m = 2;
		int m2 = 3;
		System.out.println(m + "x" + k + "=" + (m * k) + " " + (m2) + "x" + k + "=" + (m2 * k) + "");
		System.out.println(m + "x" + k + "=" + (m * k) + " " + (m + 1) + "x" + k + "=" + ((m + 1) * k) + "");

		k++;
		System.out.println(m + "x" + k + "=" + (m * k) + " " + (m + 1) + "x" + k + "=" + ((m + 1) * k) + "");

		k++;
		System.out.println(m + "x" + k + "=" + (m * k) + " " + (m + 1) + "x" + k + "=" + ((m + 1) * k) + "");

		// 2,3단 출력
		// 시작 : 1
		// 종료 : 9
		for (int k2 = 1; k2 <= 9; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m * k2) + " " + (m + 1) + "x" + k2 + "=" + ((m + 1) * k2) + "");
		}

		m += 2;
		for (int k2 = 1; k2 <= 9; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m * k2) + " " + (m + 1) + "x" + k2 + "=" + ((m + 1) * k2) + "");
		}

		m += 2;
		for (int k2 = 1; k2 <= 9; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m * k2) + " " + (m + 1) + "x" + k2 + "=" + ((m + 1) * k2) + "");
		}

		m += 2;
		for (int k2 = 1; k2 <= 9; k2++) {
			System.out.println(m + "x" + k2 + "=" + (m * k2) + " " + (m + 1) + "x" + k2 + "=" + ((m + 1) * k2) + "");
		}

		// 시작 : 2
		// 종료 : 9
		System.out.println("---2단씩 출력---");
		for (int p = 2; p <= 9; p += 2) {
			for (int k2 = 1; k2 <= 9; k2++) {
				System.out.println(p + "x" + k2 + "=" + (p * k2) + " " + 
			                  (p + 1) + "x" + k2 + "=" + ((p + 1) * k2) + "");
				
			}
			System.out.println();
		}

		//0단계
		/*
		 +
		 +
		 +
		 +
		 + 이렇게 + 5개를 나오게 해라
		 */
		System.out.println("0단계");
		for(int w =1; w<=5; w++) {
			System.out.println("+");
		}
		//1단계
		/*
		+++++
		 */
		System.out.println("1단계");
		for(int w =1; w<=5; w++) {
			System.out.print("+");
		}
		System.out.println("");
		//2단계
		/*
		 +++++
		 +++++
		 +++++
	
		 */
		System.out.println("2단계");
		for(int w =1; w<=3; w++) {
			for(int ww =1; ww<=5; ww++) {
				System.out.print("+");	
			
			}
			System.out.println("");
		}
		//3단계
		/*
		+ + + + +
		
		 */
		System.out.println("3단계");
		for (int q = 1; q <= 5; q++) {
			System.out.print("+"+".");
			
		}
		System.out.println(" ");
		/*
		 
		 1
		 22
		 333
		 4444
		 55555
		 
		 */
		System.out.println("3.5단계");
		for(int ii = 1; ii <=1; ii++) {
			System.out.print("1");
		}
		System.out.println();
		for(int ii = 1; ii <=2; ii++) {
			System.out.print("2");
		}
		System.out.println();
		for(int ii = 1; ii <=3; ii++) {
			System.out.print("3");
		}
		System.out.println();
		for(int ii = 1; ii <=4; ii++) {
			System.out.print("4");
		}
		System.out.println();
		for(int ii = 1; ii <=5; ii++) {
			System.out.print("5");
		}
		System.out.println();
		// 4단계
		/*
		 
		 +
		 ++
		 +++
		 ++++
		 +++++
		 
		 */
		System.out.print("4단계");
		System.out.println();
		for (int ii = 1; ii <= 5; ii++) {
           for (int i2 = 1; i2 <= ii; i2++) {
               System.out.print("+");
           }
        System.out.println();
       }
		
				
		//5단계
		/*
		 +____
		 ++___
		 +++__
		 ++++_
		 +++++
		 */
		System.out.println("5단계");
		for(int ii = 1; ii <=1; ii++) {
			System.out.print("+");
		for(int i2 = 1; i2 <=4; i2++) {	
			System.out.print("_");
		}
		}
		System.out.println();
		for(int ii = 1; ii <=2; ii++) {
			System.out.print("+");
		}
		System.out.println();
		for(int ii = 1; ii <=3; ii++) {
			System.out.print("+");
		}
		
		System.out.println();
		for(int ii = 1; ii <=4; ii++) {
			System.out.print("+");
		}
		System.out.println();
		for(int ii = 1; ii <=5; ii++) {
			System.out.print("+");
		}
		System.out.println();
		
		
		
		
		//6단계
		/*
		 ____+
		 ___++
		 __+++
		 _++++
		 +++++
		 
		 */
		
		// 7단계
		/*
		 
		 ____+
		 ___+++
		 __+++++
		 _+++++++
		 +++++++++
		 
		 */

		// 8단계
		/*
		 
		 ____+____
		 ___+++___
		 __+++++__
		 _+++++++_
		 +++++++++
		 
		 */

		// 9단계
		// 입력 받은 만큼 출력
		
		
		
		
		
		
		
		//주말에 풀기
		// 주사위 두개로 나올 수 있는 모든 조합 출력
		/*
		 *  2: [1,1]
		 *  3: [1,2] [2,1]
		 *  4: [1,3] [2,2] [3,1]
		 */ 
		// 중복을 제거한 경우의 수
		/*
		 *  2: 1가지
		 *  3: 1가지
		 *  4: 2가지
		 */
		
		//로또 : 1~45의 숫자 중
				//중복되지 않은 수 6개 고르기
		
	}
}
