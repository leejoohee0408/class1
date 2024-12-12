package text2;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyExam {

	public static void main(String[] args) {
		
		//스캔을 만든다
		//내돈을 입력할 수 있게 한다
		//메뉴를 고를수있게 한다
		//메뉴안에 또 메뉴를 한다
		//내가 선택할 문자인 1~4번을 적을수 있게한다
		//그 선택한것의 가격을 차감해서 다시 고를 수 있게한다
		//내가한 문자말고 다른걸 하면 잘못된 입력으로 만든다
		//만약 잔액이 부족하면 돈이 부족합니다 라고 뜨게하기
		//만약 종료를 누르면 모든것이 종료되면서 주문과 잔액이 나오게 한다
		
		
		
		
		ArrayList<String> menu = new ArrayList<>(); //menu에 저장
		ArrayList<Integer> money = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
        int i; //내돈
        
        System.out.println("얼마 있으신가요?: ");
        i = s.nextInt(); //내돈 입력
        s.nextLine(); 
       
		
		for (;;) { //무한루프ㄱㄱ
			System.out.println("메뉴를 고르세요");
			System.out.println("1. 아메리카노(3000원),  2. 라떼(4000원), 3 쉐이크(5000원)  0. 종료");
			String s2 = s.nextLine();//내가 말할 번호를 입력하기 위한 것
			if (s2.equals("1")) {
				if (i >= 3000) {
					i -= 3000; //3000원 차감
					menu.add("아메리카노 3000원");//menu저장
					money.add(3000);
					System.out.println("다른거 원하시는게 있을까요?");
					String s3 = s.nextLine();
					if(s3.equals("4")) {
						if(i >= 1000) {
							i -= 1000;
							menu.add("샷추가 1000원");
							money.add(1000);
							System.out.println("4.샷추가");
						}
					}
					
				} else {
					System.out.println("돈이 부족합니다.");
				}
			} else if (s2.equals("2")) {
				if (i >= 4000) {
					i -= 4000; //4000원 차감
					menu.add("라떼 4000원"); //menu저장
					money.add(4000);
					System.out.println("다른거 원하시는게 있을까요?");
				} else {
					System.out.println("돈이 부족합니다.");
				}
			} else if (s2.equals("3")) {
				if (i >= 5000) {
					i -= 5000; //5000원 차감
					menu.add("쉐이크 5000원"); //menu저장
					money.add(5000);
					System.out.println("다른거 원하시는게 있을까요?");
				} else {
					System.out.println("돈이 부족합니다.");
				}
			
			} else if (s2.equals("0")) {
				System.out.println("주문종료");
				System.out.println("-------------영수증-------------");
				System.out.println(menu);
				int mon = 0;
				for(Integer i2 : money) { // money에 저장된 돈을 i2로 하고
										  // i2에 저장되는 것을 +로 mon에 한다
					mon += i2;
				}
				System.out.println("--------------------------------");	
				System.out.println("내야될돈 : "+mon);
				System.out.println("--------------------------------");
				System.out.println("남은돈 : " + i + "원");
				System.out.println("--------------------------------");
				break; //종료하는곳에 멈출수있게 함
			} else {
				System.out.println("메뉴에 있는걸 말씀해주세요");
			}
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
