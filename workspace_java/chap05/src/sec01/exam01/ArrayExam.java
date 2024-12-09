package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		
		/*
		 * 배열
		 * 한번에 여러 변수를 만드는 방법

			같은 타입만 선언할 수 있음

			생성할때 전체 크기를 지정해줘야 함

			생성된 여러 변수들은 index로 관리한다. (index는 0번으로 시작)
		 */
		
		// 선언방법
		int[] score;	// java 스타일
//		int [] score3;	// java 스타일
		int score2[];	// c 스타일
		
		// 변수 앞이 무조건 타입이라고 읽는 경우
		// score변수는 "int로 구성된 배열이다"
		
		// 배열은 참조타입
		score = null;
		
		
		//////////////////////////////////
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		
		/*
		 * 배열을 생성할 때 크기를 알려줘야 합니다.
		   첫번째[ ] (int[]) : int로 이루워진 **배열이다**
		   두번째[ ]  (new int[3]) : 배열의 **크기**, 즉 한번에 만들 **변수의 개수**
									 타입의 크기만큼 연달아서 메모리를 할당 해준다
                                     첫번째 주소를 변수에 저장
									 index 0부터 첫번째 변수를 활용할 수 있다.
									 index 0부터 시작한다
		   세번째[ ] (intArray[0]) : 만들어진 변수 중에서 첫번째 변수르 뜻함
		 */
		
		
		
		
		// 배열을선언하는 첫번째 방법
		// new 연산자로 배열생성
		// 3<intArray[0] 변수여서 이것도 가능
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
		intArray[2] = 70;
		System.out.println("intArray[0] :"+ intArray[0]);
		
		// 기본값은 0, false, null로 초기화된다
		System.out.println("intArray[2] :"+ intArray[2]);
		
		// 지금 있는게 아닌 다른것으로 적으면 오류
		// 0~2까지만 사용 가능한데 3으로 시도했다
		// java.lang.ArrayIndexOutOfBoundsException
//		System.out.println("intArray[3] :"+ intArray[3]);
		
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		// 랜덤도 int로 변환해서 하면 결과값을 가져올 수 있다
		int[] intArray2 = new int[] {90, (int)Math.random(), 70};
		int[] intArray2_1 = null;
		intArray2 = new int[] {90, (int)Math.random(), 70};
		
		
		// 배열을선언하는 세번째 방법
		// new int[]에 해당하는걸 생략가능
		// 단 선언과 동시에 초기화 하는 경우에만 사용 가능
		int[] intArray3 = {90, (int)Math.random(), 70};
		// 이거는 안된다
		// intArray3 = {90, (int)Math.random(), 70};
		
		
		//intArray3안에 배열 길이가 3개 있어서 3이 나온다
		System.out.println("intArray3의 길이 : "+ intArray3.length);
		
		//ntArray3안에 배열 길이가 3개 있어서 3이 나와야 하는데
		//참조타입으로(.length)를 안하면 [I@67205a84 이런게 나온다.
		System.out.println("intArray3: " + intArray3);
		
		
		String[] sArr = new String[14];
		
		sArr[0] = "이름1";
		sArr[1] = "이름2";
		
		int k =1;
		
		// sArr[2] = "이름3";
		k++;
		sArr[k] = "이름" + (k + 1);
		
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = "이름" + (i+1);
			
		}
	     // sArr의 모든 내용을 출력
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
			
		}
		
		// 깜짝이야 퀴즈
		//1 ~10까지 배열에 넣고
		//배열의 총 합 출력
		//배열의 평균값 출력
		int[] sArrr = new int[10];
		
		
		for(int ii=0; ii<sArrr.length; ii++) {
			sArrr[ii] = ii + 1;
			
		}
		int sum = 0;
		for(int ii=0; ii<sArrr.length; ii++) {
			sum = sum + sArrr[ii];
			
		}
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + (double)sum/sArrr.length);
		
		
		// 간단퀴즈
		//1~10까지 순선대로 저장된 배열을
		//10부터 1까지 거꾸로 출력
		
		
		int[] sArrr2 = new int[0];
		//sArrr.length가 10으로 해놨고
		//sArrr2.length가 0으로 해놨다 
		//1번째로 푸는법
		for(int ii2=sArrr.length-1; ii2>=sArrr2.length; ii2--) {
			System.out.println(sArrr[ii2]);
			
		}
		//2번째로 푸는법
		for(int ii2=0; ii2<sArrr.length; ii2++) {
			System.out.println(sArrr[sArrr.length-1 - ii2]);
			
		}
		
		// [3,4,7,5,1,4,6]
		/*
		 * 문제1. 홀수의 개수 구하기
		 * 문제2. 4보다 큰 수의 개수 구하기
		 * 문제3. 최대값 구하기
		 */
		
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		b[0] = a[0];
		   
		
//		문제1. 홀수의 개수 구하기
		System.out.println("---문제1---");
		int[] sA = new int[] {3,4,7,5,1,4,6};
		int cnt =0;
		for (int w = 0; w < sA.length; w++) {
			if ((sA[w] % 2) == 0) {
			} else {
				cnt += 1;
			}
		}
		System.out.println("홀수의 개수 : "+cnt);
		
		
//		  문제2. 4보다 큰 수의 개수 구하기
		System.out.println("---문제2---");
		int cnt2 =0;
		for(int w=0; w < sA.length;w++) {
			if(sA[w]>4) {
				cnt2 += 1;
			}
		}
		System.out.println("4보다 큰 수의 개수 : "+cnt2);
		
		
		
//		  문제3. 최대값 구하기
		// 앞에서 부터 하나씩
		// 첫번째 것을 기준으로
		// int 최소값을 기준으로
		// 다음것과 비교해서 큰것을 따로 저장해놓고
		// 저장한 것으로 그 다음것과 비교하는걸
		// 끝까지 반복
		System.out.println("---문제3---");
		//int max = Integer.MAX_VALUE;  이게 int 최대값 구하는법
		int max = Integer.MIN_VALUE; // -2147483648 이게 int 최소값 구하는법
		for(int w=0; w < sA.length;w++) {
			if(max < sA[w]) {
				max = sA[w];
			}
		}
		System.out.println("최대값 :"+max);	
		
		/*
		 *문제4. 두번째 큰 수 구하기
		 *5번부터 [3,4,7,5,1,4,6] 하지않기
		 *문제5. 배열을 하나씩 뒤(오른쪽)로 밀기
		 *	5-1 : 0으로 채우기
		 *	5-2 : 첫자리에 마지막 것 넣기
		 *문제6. 임시비밀번호 8자리 만들기
		 *	6-1 : 랜덤쓰기 숫자로
		 *	6-2 : 소문자로
		 *	*어려움6-3 :숫자2개이상, 대/소문자 조합 
		 *문제7. 예약
		 *	자리가 10개 있는 소극장 예약 시스템
		 *	자리 번호는 1 ~ 10번까지 번호의 자리가 있음
		 *	만약1 : 예약이 가능하다면 "n번자리 예약했습니다"
		 *	만약2 : 예약이 불가능 하다면 "이미 예약 되어있습니다"
		 *	메뉴 : "1.예약, 2.모든예약현황, 3.잔여좌석, 4.종료"
		 *문제8. 로또 6개를 배열에 저장
		 *	단, 중복 없이
		 */
		//문제4. 두번째 큰 수 구하기
		//최대값을 구한것에서
		//최대값만 빼게하기
		//한마디로 최대값이 아닌것을 하면 될듯?
		System.out.println("---문제4---");
		int second = sA[0];
		for(int w=0; w < sA.length;w++) {
			if(sA[w] != max && second < sA[w]) {
				second = sA[w];
			}
		}
		System.out.println("두번째 최대값 :"+second);	
		
		
//		문제5. 배열을 하나씩 뒤(오른쪽)로 밀기
//			5-1 : 0으로 채우기
//		 	5-2 : 첫자리에 마지막 것 넣기
		//	전략
		//	맨 앞에 것을 두번째에 놓을건데
		//	두번째를 임시 변수에 저장해두고
		//	앞에것을 두번째에 적고
		//	임시 변수를 세번째로 보낸다
		//	위 내용을 끝까지 반복
		System.out.println("---문제5---");
		int[] arr1 = {1,2,3,4,5};
//		arr1[0] = 0;	//원래 처음에 있던 값이 지워진다
//		int temp = arr1[0]; //[1] {1,2,3,4,5}
//		arr1[0] = 0;		//[1] {0,2,3,4,5}
//		
//		int tmep2 = arr1[1]; // [1][2] {0,2,3,4,5}
//		arr1[1] = temp;		 // [1][2] {0,1,3,4,5}
//		
//		temp = arr1[2];		// [3][2] {0,2,3,4,5}
//		arr1[2] = tmep2;	// [1][2] {0,1,2,4,5}
		//임시변수를 두개나 써야해서
		//못할건 아닌것으로 보이나 다른 방법 먼저 생각해보겠다
		
		// 맨 뒤에다 바로 앞의 값을 놓으면 어떨까?
		// {1,2,3,4,5}; >>> {1,2,3,4,4};
		// {1,2,3,4,4}; >>> {1,2,3,3,4};
		//1단계
//				for(int i =arr1.length-1; i>=0; i--) {
//					
//					if(i == 0) {
//							arr1[i] = 0;
//						}else {
//							arr1[i] = arr1[i-1];
//						}
//						//출력
//						for(int j=0; j<arr1.length; j++) {
//							System.out.print(arr1[j]);
//						}
//						System.out.println();
//				}
				
				//2단계부터는 반복문으로
				for(int m=0; m<arr1.length; m++) {
					for(int i =arr1.length-1; i>=0; i--) {
						
						if(i == 0) {
								arr1[i] = 0;
							}else {
								arr1[i] = arr1[i-1];
							}
							//출력
							for(int j=0; j<arr1.length; j++) {
								System.out.print(arr1[j]);
							}
							System.out.println();
					}
				}
		
		
		
		
		
		
		
		
		
//		문제6. 임시비밀번호 8자리 만들기
//		 	6-1 : 랜덤쓰기 숫자로
//		 	6-2 : 소문자로
//		 	*어려움6-3 :숫자2개이상, 대/소문자 조합 
			System.out.println("---문제6---");
			String[] arr2 = new String[8];
//	        문제6. 임시 비밀번호 8자리 만들기
//	                  6-1 : 숫자로 

	        for (int i=0; i<arr2.length; i++) {
	            arr2[i] = ""+(int)(Math.random()*10);
	        }
	        // 출력
	        for (int i=0; i<arr2.length; i++) {
	            System.out.print(arr2[i]);
	        }

	        System.out.println(" ");
//	                  6-2 : 소문자로
	                // 소문자?
	                // char에 소문자와 숫자의 관계
	                // 97~122 까지가 a~z
	                // 전략2
	                // String[ lower = {"a","b"...}
	                // index를 random으로..

	        for (int i=0; i<arr2.length; i++) {
	            int start = 97;
	            int end = 122;
	            int random = (int)(Math.random()*(end - start +1))+start;
	            char temp = (char)random;
	            arr2[i] = ""+temp;
	        }
	        // 출력
	                for (int i=0; i<arr2.length; i++) {
	                    System.out.print(arr2[i]);
	                }	
					
			
		//6-3
		// 전략1
		//일단 숫자2개 먼저 뽑고나서 정해진 개수의 대
		//전략2
		//숫자/대/소문자를 random으로 정하기
		//숫자를 몇개 뽑았는지 세어 놓았다가
		//마지막엣 두번째에서 숫자의 필수자리수 부족하면 뽑기
	                System.out.println();
	                int countNum = 0;
	                for(int i=0; i<arr2.length; i++) {
	        			//0~2
	        			//0 : 숫자
	        			//1 : 소문자
	        			//2 : 대문자
	        			int rand = ((int)(Math.random()*(0 - 2 +1)))+0;
	        			
	        			if(i>arr2.length-2) {
	        				if(countNum<2) {
	        					rand = 0;
	        				}
	        			}
	                	
	        			String str = "";
	        			
	        			if(rand ==0) {
	        				//숫자
	        				str = ""+(int)(Math.random()*10);
	        				countNum++;
	        			}else if(rand == 1){
	        				//소문자
	        				int start = 97;
	        				int end = 122;
	        				int random = ((int)(Math.random()*(end - start +1)))+start;
	        				char temp = (char)random;
	        				str = ""+temp;
	        			}else {
	        				//대문자
	        				int start = 65;
	        				int end = 90;
	        				int random = ((int)(Math.random()*(end - start +1)))+start;
	        				char temp = (char)random;
	        				str = ""+temp;
	        				
	        			}
	        			arr2[i] = str;
	        			
	        		}		
	                // 출력
	                for (int i=0; i<arr2.length; i++) {
	                    System.out.print(arr2[i]);
	                }	
		
					
//		 문제7. 예약
//		 	자리가 10개 있는 소극장 예약 시스템
//		 	자리 번호는 1 ~ 10번까지 번호의 자리가 있음
//		 	만약1 : 예약이 가능하다면 "n번자리 예약했습니다"
//		 	만약2 : 예약이 불가능 하다면 "이미 예약 되어있습니다"
//		 	메뉴 : "1.예약, 2.모든예약현황, 3.잔여좌석, 4.종료"
		
//전략
//10개 배열에 0:예약가능, 1:예약불가로 관리
	               System.out.println();
		System.out.println("---문제7---");
		
		
		
		
		
		
		
		
////		 문제8. 로또 6개를 배열에 저장
////		 	단, 중복 없이
//		System.out.println("---문제8---");
//	int	[] lotto = new int[6];
//	
//	lotto[0] =(int)(Math.random()*(45)) +1;
////	lotto[1] =(int)(Math.random()*(45)) +1;
//		do {
//			lotto[1] =(int)(Math.random()*(45)) +1;
//		}while(lotto[0] != lotto[1]);
//		
//		do {
//			lotto[1] =(int)(Math.random()*(45)) +1;
//		}while(lotto[0] != lotto[2] && lotto[1] != lotto[2]);
//		
//		// 2번 index 진행중
//		int index = 2;
//		boolean flag = false;
//		for(int i=0; i<index; i++) {
//			if(lotto[i] == lotto[index]) {
//				flag = true;
//				break;
//			}
//		}
//		if(flag){
//			//
//		}
		
		int[] lotto = new int[6];
        boolean flag = false;
        for(int j=0; j<lotto.length; j++) {
            do {
                lotto[j] = (int)(Math.random()*(45)) + 1;
                flag = false;
                for(int i=0; i<j; i++) {
                    if(lotto[i] == lotto[j]) {
                        flag = true;
                        System.out.println("중복발생");
                        break;
                    }
                }
            } while(flag);
        }
        System.out.println("--로또 번호--이주희--------------");
        for(int i=0; i<lotto.length; i++) {
            if(i != 0) {
                System.out.print(","+ lotto[i]);
            } else {
                System.out.print(lotto[i]);
            }
        }
		System.out.println();
		
		
		
		
		
		
		
		
		
		//첫 배열을 20으로 한 것
		int[] class1 = new int[20];
		int[] class2 = new int[20];
		int[] class3 = new int[20];
		int[] class4 = new int[20];
		
		//배열의 배열을 할거면 자식의 배열인 20도 입력해야한다
		int[][]천안 = new int[4][20];
		System.out.println("천안 : "+ 천안);
		System.out.println("천안[0] : "+ 천안[0]);
		System.out.println("천안[0][0] : "+ 천안[0][0]);

		// 서로 다른 크기를 가지는 2차원 배열
		int[][] test = { {1,2,3},{1,2,3,78}, {78} };
			
		
		
		//두번째에 배열에 마지막 것을 출력
		System.out.println("두번째에 마지막 :"+test[1][3]);
		
		//(배열개수) 배열변수에는 .length를 한다
		System.out.println("test.length :"+test.length);
		System.out.println("test[0].length :"+test[0].length);
		System.out.println("test[1].length :"+test[1].length);
		System.out.println("test[2].length :"+test[2].length);
		
		
		//3차원 배열
		int[][] 수원 = new int[4][20];
		int[][] 서울 = new int[4][20];
		
		int[][][] 휴먼 = new int[3][4][20]; 
		
		
		// 가상의 달력
		// 12개월이고 모든 달은 30일까지만 있는....
		// 한달은 1~30
		// 모든 날짜 채워 넣기
		// 따로 모든(또는 11월) 출력하기
		int[] tt = new int[30];	
		for(int i=0; i<tt.length; i++) {
			tt[i] = i+1;
		}
		for(int i=0; i<tt.length; i++) {
			System.out.print(tt[i]+",");
		}
		
		
		
		int[] tt2 = new int[30];	
		for(int i=0; i<tt.length; i++) {
			tt[i] = i+1;
		}
		
		int[][] tt3 = new int[12][30];
		for(int i=0; i<tt3[0].length; i++) {
			tt3[0][i] = i+1;
		}
		for(int i=0; i<tt3[1].length; i++) {
			tt3[1][i] = i+1;
		}
		
		for(int j=0; j<tt3.length; j++) {
			for(int i=0; i<tt3[j].length; i++) {
				tt3[j][i] = i+1;
			}
		}
		for(int j=0; j<tt3.length; j++) {
			for(int i=0; i<tt3[j].length; i++) {
			//	System.out.println("월:"+j+",i:"+i+",일"+tt3[j][i]);
			}
		}
		
		//
		String[] name1 = {"김","이", "박", "최"};
		//name1와 정확히 동일한 name2를 만드세요
		String[] name2 = new String [name1.length];
//		name2[0] = name1[0];
		for(int i=0; i < name1.length; i++) {
			name2[i] = name1[i];
			System.out.print(name2[i]);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
