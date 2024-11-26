package ser01.exam02;

public class VariabExample {

	public static void main(String[] args) {
		
		int hour = 3;//3을 변수hour로 한다
		int minute = 5;//5를 변수minute로 한다
		//변수hour와 minute값을 출력:3시간 5분
		System.out.println(hour + "시간" + minute + "분");
		//변수hour에 60을 곱하고 minute에있는 5를 더한것을
		//totalMinute로 집어넣은다
		int totalMinute = (hour*60) + minute;
		//받은것을 출력
		System.out.println("총 " + totalMinute + "분");
		//totalMinute값에 60을 곱한것을 totalSec로 넣는다
		int totalSec = totalMinute * 60;
		//totalSec로 출력
		System.out.println(totalSec);
		
		int x =10;
		int y =20;
		System.out.println("x의 값:" + x);
		System.out.println("x+y의 값 :" +(x+y));
		
		//System.out.println("j : " + j);
		int j =1;
		System.out.println("j : " + j);
		
		{
			System.out.println("j : " + j);
		}
		
		{
			//변수는 {}가 끝나면 사라진다
			int i = 0;
			System.out.println("i : " + i);
		}
		   //i는 이미 사라진 상태	
           //System.out.println("i : " + i);
		//i는 없는 상태라서 다시 선언할 수 있다
		int i =100;
	}

}
