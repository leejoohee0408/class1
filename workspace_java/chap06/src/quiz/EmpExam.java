package quiz;

public class EmpExam {

	public static void main(String[] args) {
		
		 //	Emp이라는 메소드를 p1에 가져옴	
		 Emp p1 = new Emp();
		 p1.empname = "이주희1";
		 p1.emptype = "103";
		 p1.mgr = "101";
		 p1.sal = 2000;
		 
		 Emp p2 = new Emp();
		 p2.empname = "이주희2";
		 p2.emptype = "101";
		 p2.mgr = "102";
		 p2.sal = 1000;
		 
		 Emp p3 = new Emp();
		 p3.empname = "이주희3";
		 p3.emptype = "102";
		 p3.mgr = "103";
		 p3.sal = 3000;
		 
		 Emp p4 = new Emp();
		 p4.empname = "이주희4";
		 p4.emptype = "105";
		 p4.mgr = "104";
		 p4.sal = 4500;
		 
		 EmpList pl =	new EmpList("이름, 사원번호, 관리자, 급여");
		 pl.add(p1);
		 pl.add(p2);		 
		 pl.add(p3);		 
		 pl.add(p4);		 
		 pl.print();
		 pl.printt();
		 
		 
		 	
			
			
		

	}

}
