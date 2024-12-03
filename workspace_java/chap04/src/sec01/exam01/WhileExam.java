package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			
			i++; //이게 없으면 무한으로 즐겨요가 된다
				
		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1: 커피, 2:홍차, 0: 종료");
//		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
//		if(menu == 1) {
//			System.out.println("커피 드릴께요");
//		}else if(menu == 2) {
//			System.out.println("홍차 드릴께요");
//		}else if(menu == 0) {
//			System.out.println("다음에 또 오지마세요");
//		}else {
//			System.out.println("메뉴에서 골라라");
//		}
//		
//		menu = scan.nextInt();
//		if(menu != 0) {
//			if(menu == 1) {
//				System.out.println("커피 드릴께요");
//			}else if(menu == 2) {
//				System.out.println("홍차 드릴께요");
//			}else {
//				System.out.println("메뉴에서 골라라");
//			}
//			
//			menu = scan.nextInt();
//			
//		}else {
//			System.out.println("다음에 또 오세요");
//		}
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1: 커피, 2:홍차, 0: 종료");
//		Scanner scan = new Scanner(System.in);
//		int menu = scan.nextInt();
		
//		for(; menu != 0; )	{	//while문을 for문으로 쓰려면 이렇게 해라
		//while문으로 자판기 만들기
//		while(menu != 0) {
			
//				if(menu == 1) {
//					System.out.println("커피 드릴께요");
//				}else if(menu == 2) {
//					System.out.println("홍차 드릴께요");
//				}else {
//					System.out.println("메뉴에서 골라라");
//				}
//				System.out.println("메뉴를 고르세요");
//				System.out.println("1: 커피, 2:홍차, 0: 종료");
//				menu = scan.nextInt();
				//만약 숫자말고 문자를 사용하고 싶으면 nextLine을 사용
			
//		}
//		System.out.println("다음에 또 오세요");
		// 보통 몇번 반복할지 모를때 while문을 쓰게된다
		// 보통 몇번 반복할지 알때 for문을 쓰게된다
		
		Scanner scan = new Scanner(System.in);
		String m ="";
		do {
			System.out.println("메뉴를 고르세요");
			System.out.println("1: 커피, 2:홍차, 0: 종료");
			m =	scan.nextLine();
			
			if(m.equals("1")) {
				System.out.println("커피 드릴께요");
			}else if(m.equals("2")) {
				System.out.println("홍차 드릴께요");
//			}else {
//				System.out.println("메뉴에서 골라라");
			}
			
		}while(!m.equals("x"));
		System.out.println("다음에 또 오세요");	
		
		
		
	}

}
