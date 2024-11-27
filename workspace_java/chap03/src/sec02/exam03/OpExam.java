package sec02.exam03;

public class OpExam {

	public static void main(String[] args) {
		//!로 참,거짓을 변경
		//not이라고 생각해라
		boolean a =false;
		System.out.println("a =" + a);
		a = !a;
		System.out.println("a =" + a);
		
		double b=7.0;
		System.out.println( b / 3 );
		//double을 0을 나누면 Infinity 에러
		//System.out.println(b / 0);
		//int를 0으로 나누면 "/by zero" 에러
		//System.out.println( 3 / 0 );
		
		int c = 983981;
		int d = 5;
		System.out.println("몫 : "+ (c / d));
		System.out.println("나머지 : "+ (c % d));

		//퀴즈
		//내가 만원이 있는데 4500짜리를 몇잔 살수 있나요?
		//그리고 얼마에 잔돈이 남나요?
		int f = 10000;
		int g = 4500;
		System.out.println("몇잔 ="+(f / g)+"잔");
		System.out.println("잔돈 ="+ (f % g)+"원내놔");
		
		//조금 어려운 문제
		//올리브영에서 전품목 15%세일중 !!
		//1.꿀홍차 (5000)을 샀을때 얼마를 내야 하나요?
		//2.꿀홍차(5000)와 립스틱(30000)을 하나씩 사면?
		int h = 5000;
		int i = 30000;
		double j = (double)h * 0.15;
		double k = (double)i * 0.15;
		double l =  h - j ;
		double m =  i - k ;
		System.out.println("올리브영에서 내야할돈 ="+ (l +m));

		
		//7234원 이 있어요
		//5000, 1000, 500, 100, 50, 10, 1원
		//각각 최대 몇개까지로 표현할 수 있나요?
		int  money1 = 7234;
		int  cnt5000 = money1/5000;
		System.out.println("5000 = "+ cnt5000 +"개");
		
		int money2 = money1 % 5000;
		int 천원 = money2 /1000;
		System.out.println("1000 :" + 천원);
		money2 = money2 % 1000;
		
		int m500 = money2 / 500;
		System.out.println("500 :" + m500);
		money2 = money2 % 500;
		
		int m100 = money2 / 500;
		System.out.println("100 :" + m100);
		money2 = money2 % 100;
		
		
		int m50 = money2 / 50;
		System.out.println("50 :" + m50);
		money2 = money2 % 50;
		
		int m10 = money2 / 10;
		System.out.println("10 :" + m10);
		money2 = money2 % 10;
		
		int m1 = money2 / 1;
		System.out.println("1 :" + m1);
		money2 = money2 % 1;		
		
//각각 구하는게 아니라 합쳤을때 7234원 이어야 한다.		
//		int op = o/p;
//		int oq = o/q;
//		int or = o/r;
//		int os = o/s;
//		int ot = o/t;
//		int ou = o/u;
//		int ov = o/v;
//		System.out.println("5000원 ="+op+"개");
//		System.out.println("1000원 ="+oq+"개");
//		System.out.println("500원 ="+or+"개");
//		System.out.println("100원 ="+os+"개");
//		System.out.println("50원 ="+ot+"개");
//		System.out.println("10원 ="+ou+"개");
//		System.out.println("1원 ="+ov+"개");
		
		
		//String에해야할"jdk"가 숫자앞에 ""으로 하면 나온다
		System.out.println("jdk"+ 3 + 3.0);
		
		//String에 있는것을 int로 삽입
		String c2 = "100";
		int c3 = Integer.parseInt(c2);
		System.out.println(c3 + 3);
		
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println( 1 == 1);
		System.out.println( 1 == 1.0);
		System.out.println( 0.1 == 1.0f);
		//소수점 이하는 정확하지 않아서
		//01을 0.0999999 또는 0.100000001로 처리할 수 있기때문에
		//같은 타입으로 변환해서 비교하자
		System.out.print("형변환 : " );
		System.out.println( (float)0.1 == 0.1f);
		System.out.println('C' < 'J'); // ''char 값으로 계산한다
//		System.out.println("ab" < "ac");  "" String 값으로 계산한다
		
		System.out.println("3 !=3 :"+(3 !=3 ));
		
		String s1 = "이주희";
		String s2 = "이주희";
		System.out.println(s1 == s2);
		//글씨 비교는 == 사용금지
		System.out.println(s1.equals(s2));
		System.out.println(!s1.equals(s2));		
		//String 변수 또는 "글씨".equals(비교값)
		//"이주희".equals(s2)
		
		int i1 = 87;
		System.out.println(i1+"은 b 학점인가?");
		//AND가 여기서는 &&이다
		System.out.println((i1 >= 80) && (i1 < 90));
		//OR이 여기서는 ||이다
		System.out.println((i1 >= 80) || (i1 < 90));
		
		System.out.println(10 | 1);
		
		int k1 = 7;
		int k2 = 15;
		int k3 = 17;
		System.out.print("k3이 가장 큰 값인가?");
		// k3가 k1보다도 크"고" k3가 k2보다도 크면
		// k3가 k2보다도 크거나 같으면
		// k3는 가장 크다
		System.out.println((k3 > k1) && (k3 > k2));
		
		int mm1 = 5;
		mm1 = mm1 + 2;//mm1 +=2;이거랑 같음
		money2 = money2 % 500; //money2 %= 500;이거랑 같음
		System.out.println(mm1);
		
		int n1 =10;
		n1 += 1 ; //n1 =1 + n1;와 같다, n1++;도 같은거다
		n1 -= 1; //n1 =n1 - 1;와 같다, n1--;도 같은거다
		
		int n2 =10;
		System.out.println("n2 : "+ (++n2));
		System.out.println("n2 : "+ (n2++));	
		// n2 == 12
		System.out.println("n2 : "+ n2);
		
		int x =1;
		int y =1;
		int result1 =++x +  10;
		int result2 =y++ +  10;
		System.out.println(result1);
		System.out.println(result2);
		
		int z = 1;				
//							1  + 3
//		System.out.println(z++ + ++z);
		int z1 = z;
		z = z + 1;
		
		z = z + 1;
		int z2 = z;
		System.out.println(z1 + z2);
		System.out.println(z);
		
		//삼항 연산자 방법
		//참이면 a, 거짓이면 b
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
		
		//3장 마무리 문제
		//150쪽 5번문제
		int var1 = 5;
		int var2 = 2;
		double var3 =var1 / var2;
		int var4 = (int) ((var3 * var1)/var2);
		System.out.println(var4);
		
		//150쪽 6번문제
		int value =356;
		System.out.println(value-(value%300));
		
		
	}

}
