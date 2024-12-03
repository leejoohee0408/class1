package sec01.exam01;

public class PyramidExam {

	public static void main(String[] args) {
		//0단계
				/*
				 +
				 +
				 +
				 +
				 + 이렇게 + 5개를 나오게 해라
				 */
				System.out.println("0단계");
				for(int i =1; i<=5; i++) {
					System.out.println("+");
				}
				//1단계
				/*
				+++++
				 */
				System.out.println("1단계");
				for(int i =1; i<=5; i++) {
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
				for(int i =1; i<=3; i++) {
					for(int j =1; j<=5; j++) {
						System.out.print("+");	
					
					}
					System.out.println("");
				}
				//3단계
				/*
				+ + + + +
				
				 */
				System.out.println("3단계");
				for(int i=1; i<=5; i++) {
					System.out.print("+");
					System.out.print(".");
				}
				System.out.println();
				//3.5단계
				/*
				 
				 1
				 22
				 333
				 4444
				 55555
				 
				 */
				System.out.println("3.5단계");
				for(int ii = 1; ii <=5; ii++) {
					for(int j = 1; j <=ii; j++) {
						System.out.print(ii);
					}
					System.out.println();
				}
			
				
				// 4단계
				//첫번째 줄에 + 하나
				//2번째 줄에 + 2개
				//3번째 줄에 + 3개 출력하교 엔터가 방법이다
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
				
				//4.5단계
				//1번중에 1이 5개
				//2번줄에 2가 4개
				/*
				 11111
				 2222
				 333
				 44
				 5
				 */
//				int k =1;
//				int m =5;
//			    for(int i = 1; i<=m; i++) {
//			    	System.out.print(k);
//			    }
//				System.out.println();
//				
//				k=k+1;
//				m--;
//				for(int i = 1; i<=m; i++) {
//			    	System.out.print(k);
//			    }
//				System.out.println();
//				
//				k=k+1;
//				m--;
//				for(int i = 1; i<=m; i++) {
//			    	System.out.print(k);
//			    }
//				System.out.println();
				
				//새로운 방법
				int k1 =1, m1 =5;
				for(int k =1, m =5; k1 <=5 && m1>=1; k++,k1++, m1--)
					for(int i = 1; i<=m; i++) {
				    	System.out.print(k);
				    }
					System.out.println();
				//원래 배운것
//					int k=1;
//					int m=6-k;
					//전체 5줄
					System.out.println("4.5단계");
					for(int k=1; k<=5; k++) {
						//한줄의 내용을 완성하는 반복문
						for(int i=1; i<=(6-k); i++) {
							System.out.print(k);	
						}
						System.out.println();//엔터
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
				for (int ii = 1; ii <= 5; ii++) {
		           for (int i2 = 1; i2 <= ii; i2++) {
		               System.out.print("+");
		           }
		           for(int i=1; i<=(5-ii); i++) {
						System.out.print("_");	
					}
		        System.out.println();
		       }
			
				//6단계
				/*
				 ____+
				 ___++
				 __+++
				 _++++
				 +++++
				 
				 */
				System.out.println("6단계");
				for (int ii = 1; ii <= 5; ii++) {
					for(int i=1; i<=(5-ii); i++) {
						System.out.print("_");	
					}
		           for (int i2 = 1; i2 <= ii; i2++) {
		               System.out.print("+");
		           }
		        System.out.println();
		       }
				
				// 7단계
				/*
				 
				 ____+
				 ___+++
				 __+++++
				 _+++++++
				 +++++++++
				 
				 */
				System.out.println("7단계");
				for (int ii = 1; ii <= 5; ii++) {
					for(int i=1; i<=(5-ii); i++) {
						System.out.print("_");	
					}
		           for (int i2 = 1; i2 <= (ii*2)-1; i2++) {
		               System.out.print("+");
		           }
		        System.out.println();
		       }

				// 8단계
				/*
				 
				 ____+____
				 ___+++___
				 __+++++__
				 _+++++++_
				 +++++++++
				 
				 */
				System.out.println("8단계");
				for (int ii = 1; ii <= 5; ii++) {
					for(int i=1; i<=(5-ii); i++) {
						System.out.print("_");	
					}
		           for (int i2 = 1; i2 <= (ii*2)-1; i2++) {
		               System.out.print("+");
		           }
		           for(int i=1; i<=(5-ii); i++) {
						System.out.print("_");	
					}
		        System.out.println();
		       }

				// 9단계
				// 입력 받은 만큼 출력
				System.out.println("8단계");
				int k =10;
				for (int ii = 1; ii <= k; ii++) {
					for(int i=1; i<=(k-ii); i++) {//왼쪽_
						System.out.print("_");	
					}
		           for (int i2 = 1; i2 <= (ii*2)-1; i2++) {//가운데++
		               System.out.print("+");
		           }
		           for(int i=1; i<=(k-ii); i++) {//오른쪽_
						System.out.print("_");	
					}
		        System.out.println();
		       }


	}

}
