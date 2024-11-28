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
		int q2 = 33;
		int q3 = 64;
		
		

        // 어려운 문제 2.
        // 사각형의 한쪽 모서리 : xa: 10, ya: 20
        // 다른쪽 모서리 : xb: 90, yb: 100
        // 새로운 점 : xc, yc가 직각사각형에 포함 되는가?
			
		
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
		double rand5 = Math.random()*(2+1);
		int rand6 = (int)rand5; 
		int rand7 = rand6 + 1;
		Scanner scan = new Scanner(System.in); 
		//이건 String으로 스캔이 가능하다
		String qqq4 = scan.nextLine();
		System.out.println(qqq4);
		if(rand7==1) {
			System.out.println("쑈부다~"+"가위");
		}else if(rand7==2){
			System.out.println("쑈부다~"+"바위");
		}else if(rand7==3){
			System.out.println("쑈부다~"+"보");
		}
		
		
		
		
}

}
