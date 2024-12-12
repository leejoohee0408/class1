package text;

import java.util.Scanner;

public class TextExam {

	public static void main(String[] args) {
		
//		이건 키호스트이긴 한데 돈넣는거랑 잔돈이 안됨		
//		Scanner i = new Scanner(System.in);
//		String q = "";
//		
//		
//		do {
//			System.out.println("메뉴를 고르시오");
//			System.out.println("1커피, 2라떼 , 3과자, 4종료");
//			q = i.nextLine();
//			if(q.equals("1")) {
//				System.out.println("커피 나왔습니다");
//			}else if(q.equals("2")){
//				System.out.println("라떼 나왔습니다");
//			}else if(q.equals("3")) {
//				System.out.println("과자 나왔습니다");
//			}
//				
//		}while(!q.equals("4"));
//		System.out.println("종료되었습니다 감사합니다");
		
//		이건 키호스트이면서 돈을 넣고 거스름돈을 할수 있다			
		Scanner scanner = new Scanner(System.in);
        int b; // 잔액

        System.out.println("돈을 투입하세요: ");
        b = scanner.nextInt(); // 사용자가 투입한 금액
        scanner.nextLine(); // 개행 문자 처리

        for (;;) { // 무한 루프
            System.out.println("현재 잔액: " + b + "원");
            System.out.println("메뉴를 고르시오");
            System.out.println("1. 커피(3000원)  2. 라떼(4000원)  3. 종료");
            String i = scanner.nextLine();

            if (i.equals("1")) {
                if (b >= 3000) {
                    b -= 3000;
                    System.out.println("커피가 나왔습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            } else if (i.equals("2")) {
                if (b >= 4000) {
                    b -= 4000;
                    System.out.println("라떼가 나왔습니다.");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
            } else if (i.equals("3")) {
                System.out.println("종료되었습니다. 거스름돈: " + b + "원");
                break; // 반복 종료
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        
        
        
        
        
        
        
        

	}

}
