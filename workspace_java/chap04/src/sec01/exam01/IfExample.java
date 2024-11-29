package sec01.exam01;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		int sc = 70;
//		Scanner scan = new Scanner(System.in); 스캔해서 씀
//		int sc = scan.nextInt(); 스캔해서 쓴것을 int에 넣음
		if(sc>=90) {
			System.out.println("점수 90보다 큼");
			System.out.println("등급 A");
		}
		if(sc< 90) {
			System.out.println("점수 90보다 작음");
			System.out.println("등급 B");
		
		}
		
		if(sc>=90) {
			System.out.println("점수 90보다 큼");
			System.out.println("등급 A");
		} else {
			System.out.println("점수 90보다 작음");
			System.out.println("등급 B");
		}
		if(sc >= 90) {
			System.out.println("점수 90보다 큼");
			System.out.println("등급 A");
		} else if (sc< 90 && sc >= 80) {
			System.out.println("80~89사이");
			System.out.println("등급 B");
		} else if (sc< 80 && sc >= 70) {
			System.out.println("70~79사이");
			System.out.println("등급 C");
		} else {// 위에것들이 다 아닐경우 else것을 출력한다.
			System.out.println("70미만");
			System.out.println("등급 D");
		}
		//문제 1
		//z1이 x1과 y1사이에 있는지 확인
		int x1 = 15;
		int y1 = 20;
		int z1 = 17;
		if(z1 > x1 && y1 > z1){
			System.out.println("z1 승");
			}else {
				System.out.println("z1 패");
			}
		//홀짝 도박 쌉가능
		int x2 =1;
		if((x2 % 2) == 0) {
			System.out.println(x2 + "= 짝수" );
		} else {
			System.out.println(x2 + "= 홀수" );
		}
		//문제2
		/*
		 * 어제 온도가 -3도 였을때
		 * 오늘 온도(입력 받아도 됨)가
		 * 
		 * 1.오늘이 영하인지 영상인지
		 * 
		 * 2.만약 영하라면 "영하 1도 입니다"
		 * 영상이라면 "영상 2도 입니다"
		 * 
		 * 3."어제보다 온도가 높/낮습니다"
		 * "어제보다 온도가 낮습니다"
		 * 
		 * 4."어제보다 2도 높습니다"
		 */
		int t = -1; // 온도
		int yt = 3; // 어제 온도
		//1번
		if(t <= 0) {                    
			System.out.println("2.1번문제="+"영하");		
		}else {
			System.out.println("영상");	
		}
		//2번
		if(t <= 0) {                    
			System.out.println("2.2번문제="+"영하 1도 입니다");	
		}else {
				System.out.println("영상 2도 입니다");	
		}
		//3번
		if(t > yt) {
			System.out.println("2.3번문제="+"어제보다 온도가 높습니다");	
		}else {
				System.out.println("어제보다 온도가 낮습니다");	
		}
		//4번
		if(t > yt) {
			System.out.println("2.4번문제="+"어제보다 2도 높습니다");
		}else {
			System.out.println("어제보다 온도가 2도 낮습니다");
		}
	
		//문제 3
		/*
		 * 어떤 수가 있을때
		 * 
		 * "입력한 수는 100보다 큰/같은/작은 수이며"
		 * "양수이고" 
		 * "홀수입니다"
		 */
		int qq =101;
		if(qq>100) {
			System.out.println("3.1번 문제="+"크다");
		}else if(qq==100) {
		System.out.println("3.1번 문제="+"같다");	
		}else {
		System.out.println("3.1번 문제="+"작다");		
		}
		if((qq > 0)) {
			System.out.println("3.2번 문제"+"= 양수" );
		}else {	
			System.out.println("3.2번 문제"+"= 음수" );
		}
		if((qq % 2) == 0) {
			System.out.println("3.3번 문제:"+qq + "= 짝수" );
		} else {
			System.out.println("3.3번 문제:"+qq + "= 홀수" );
		}
		
		//문제 4
		/*
		 * a, b두 수가 있을때
		 * 둘중에 큰 값 출력
		 */
		int a =1;
		int b =2;
		if(b > a) {
			System.out.println("4번문제:"+b);
		if(a > b) {
				System.out.println("4번문제:"+a);
		}}
		//문제 5
		/*
		 * 숫자가
		 * 1일때 "일"
		 * 2일때 "이"
		 * 3일때 "삼"
		 * 다른 수일때 "그 외"
		 */
		int aa = 1;
		if(aa==1) {
			System.out.println("5번문제:"+"일");
		}else if(aa==2) {
			System.out.println("5번문제:"+"이");
		}else if(aa==3) {
			System.out.println("5번문제:"+"삼");
		}else {
			System.out.println("5번문제:"+"그 외");
		}
	
		
		//문제 6
		/*
		 * 월에 따라서
		 * 4계절을 출력
		 * 봄 : 3,4,5
		 * 여름 :6,7,8
		 * 가을 :9,10,11
		 * 겨울 :12,1,2
		 */
		
		int a2 = 3;
		if(a2>=3 && a2<=5) {
			System.out.println("6번문제:"+"봄");
		}else if(a2>=6 && a2<=8) {
			System.out.println("6번문제:"+"여름");
		}else if(a2>=9 && a2<=11) {
			System.out.println("6번문제:"+"가을");
		}else {
			System.out.println("6번문제:"+"겨울");
		}
		// 어려운 문제 1.
        // 두자리 정수가
        // 10의 자리와 1의자리가 같은지 판단
		int num = 33; //같음
		 num = 64; //다름
		int qq10 = num / 10; //10의 자리
		int qq1 = num % 10; //1의자리
		
		if(qq10 == qq1) {
			System.out.println(qq10 +"과" + qq1 + "은 같다");
		}else {
			System.out.println(qq10 +"과" + qq1 +"은 같지 않다");
		}
		

        // 어려운 문제 2.
        // 직각사각형의 한쪽 모서리 : (10, 20)
        // 다른쪽 모서리 : (90, 100)
        // 새로운 점 : xc, yc가 직각사각형에 포함 되는가?
		
		int xx1 = 10;
		int yy1 = 20;
		
		int xx2 = 90;
		int yy2 = 100;
		
		int xx3 = 30;
		int yy3 = 40;
		
		if( 
		           ((xx1 <= xx3) && (xx2 >= xx3)) 
		            &&
		           ((yy1 <= yy3) && (yy2 >= yy3))
		        ){
		            System.out.println("사각형과 충돌");
		        }else {
		            System.out.println("사격형과 충돌하지 않음");
		        }
		
		
		
		
		// random 사용법
		/*
		 * Math.random();
		 * 0 <= Math.random() < 1
		 * 
		 * 주사위 : 1 ~ 6
		 * (0 ~ 5) + 1
		 * x + 1 = y - 2
		 * x + 1 + 2 = y - 2 + 2
		 * 0 ~ 0.99999999999999
		 * 곱하기 6을 하면 5.9999999999
		 * 0 <= Math.random() < 1
		 * 0*5 <= Math.random()*5 < 1*5 // 0~4.99999
		 * 0*(5+1)<= Math.random()*(5+1) < 1*(5+1)
		 */ //0 ~ 5.9999999
		 //(int) 0~5
		 
		//랜덤뽑기 쌉가능 너도 복권을 살 수 있다.
		//Math.random으로 랜덤 뽑기 만들기
		double rand = Math.random();
		System.out.println("rand :" + rand);
		
		//주사위 돌리기 게임
		double rand2 = Math.random()*(5+1);
		int rand3 = (int)rand2; //0 ~ 5
		int rand4 = rand3 + 1; //1 ~ 6
		System.out.println("주사위 :"+ rand4);
		
		//주사위 돌리기 게임,쉽게 사용하기
		int rnd1 = (int)(Math.random() * 60);
		int rnd2 = rnd1 % 6;
		int rnd3 = rnd2 +1;
		System.out.println("돌림판 :" + rnd3);
		
		// 가위 바위 보 게임
		//   1    2   3
		int player = 1; //TODO Scanner?
		int npc = 1; //random?
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("1:가위, 2:바위, 3:보 ?");
		player = scan.nextInt();
		
		// 1~3 
		// 0~2 구해서 +1
		npc = (int)(Math.random()*3) + 1;
		System.out.println("npc : "+ npc);

		if(player == 1) {
			System.out.println("사용자 : 가위");
		}
		//내가 가위
		if(player == 1 && npc == 1) {
			System.out.println("비김");
		}else if(player == 1 && npc == 3){
			System.out.println("이김");
		}else if(player == 1 && npc == 2) {
			System.out.println("짐");
		//내가 바위	
		}else if(player == 2 && npc == 2) {
			System.out.println("비김");
		}else if(player == 2 && npc == 1){
			System.out.println("이김");
		}else if(player == 2 && npc == 3) {
			System.out.println("짐");
		}
		//내가 보
		else if(player == 3 && npc == 3) {
			System.out.println("비김");
		}else if(player == 3 && npc == 2){
			System.out.println("이김");
		}else if(player == 3 && npc == 1) {
			System.out.println("짐");
		}
		//내가 만든 가위,바위,보 실패과정		
//		double rand5 = Math.random()*(2+1);
//		int rand6 = (int)rand5; 
//		int rand7 = rand6 + 1;
//		Scanner scan = new Scanner(System.in); 
//		//이건 String으로 스캔이 가능하다
//		String qqq4 = scan.nextLine();
//		System.out.println(qqq4);
//		if(rand7==1) {
//			System.out.println("쑈부다~"+"가위");
//		}else if(rand7==2){
//			System.out.println("쑈부다~"+"바위");
//		}else if(rand7==3){
//			System.out.println("쑈부다~"+"보");
//		}
		
		
		// swap
		// 수박, 볼링공
		String str1 = "수박";
		String str2 = "볼링공";
		
		String str3 = str1;
		str1 =str2;
		str2 = str3;
		
		System.out.println(str1);
		System.out.println(str2);
		
		//
		int num2 = 1;
		switch(num2) {
			case 1:
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
				break;	
			default :
				System.out.println("1과 2가 아닙니다");
				break;
			}
		/*switch에 전달한 값과 case의 값이 일치하면 해당 실행문을 실행한다

		if, else if가 == 로만 이루어진 경우 switch를 사용할 수 있따

		즉 > _> < <_ 등은 사용할 수 없다

		비교 가능한 타입 : char, byte, short, int, String

		사용 못하는 타입 : boolean, long, float, double
		case의 값은 모두 달라야 한다.*/
		
		int month = 11;
		switch (month) {
		case 1 :
//			System.out.println("겨울");
//			break;
		case 2 :
//			System.out.println("겨울");
//			break;
		case 12 :
			System.out.println("겨울");
			break;
		case 9 :
//			System.out.println("가을");
//			break;
		case 10 :
//			System.out.println("가을");
//			break;
		case 11 :
			System.out.println("가을");
			break;
		
		}
		// 통장 잔액이 10000원 있을때
		// 출금액을 입력 받아서
		// 있는 돈보다 많이 적으면 "잔액이 부족합니다"
		// "얼마 출금했고 얼마 남았습니다"
		// 음수일 경우 "정확히 입력해주세요"
		int mon = 10000;
		int mon2 = 9000;
		if(mon2> 10000) {
			System.out.println("너의 돈 보다 많이는 못뽑아");
		}else if(mon2<-1) {
			System.out.println((mon2)+"음수로 하면 돈이 나오냐?");
		} else {
			System.out.println((mon-mon2)+"남았습니다");
		}
		
		//switch로 시도해본것 풀지는 못했음
//		int mon3 = 10000;
//		int mon4 = 7000;
//		switch(mon4) {
//			case 10000:
//			case 9000:
//			case 8000:
//			case 7000:
//			case 6000:
//			case 5000:
//			case 4000:
//			case 3000:
//			case 2000:
//			case 1000:
//				System.out.println((mon3-mon4)+"남았습니다");	
//				break;
//			case -1:
//				System.out.println("음수로 하면 돈이 나오냐?");
//				break;	
//			default :
//				System.out.println("1과 2가 아닙니다");
//				break;
//		}
		
		
		
		
}

}
