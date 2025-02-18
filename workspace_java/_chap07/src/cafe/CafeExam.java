package cafe;

public class CafeExam {

	public static void main(String[] args) {
		//자식안에 있는 부모꺼 쓰는것
		 Employee barista = new Barista("철수", 2500000);
	        Employee baker = new Baker("영희", 2500000);
	        Employee clerk = new Clerk("민수", 2500000);
	        
	        //직접받은것
	        Welfare welfare = new Welfare("철수 영희 민수", 2500000);
	        Barista  barista1 = new Barista("철수", 2500000);
	        Baker  baker1 = new Baker("영희", 2500000);
	        Clerk clerk1 = new Clerk("민수", 2500000);
	        
	        
	        
	        // 손님 접대 
	        barista.serveCustomers();
	        baker.serveCustomers();
	        clerk.serveCustomers();
	        
	        //만들기
	        barista1.makeCoffee();
	        baker1.bakeBread();
	        
	        //관리
	        clerk1.manageStore();
	        
	        // 직원 공부 
	        barista.study();
	        baker.study();
	        clerk.study();
	        
	        //복지 월급지급
	        welfare.dnjfrmq();
	        
	        // 월급 받기
	        barista.receiveSalary();
	        baker.receiveSalary();
	        clerk.receiveSalary();
	        

	}

}
