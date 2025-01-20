package quiz;
import java.util.ArrayList;

import quiz.Emp;



public class EmpList {


		//ArrayList라는 정해지지 않은 배열을 list에 줬다	
		ArrayList list = new ArrayList();
		
		EmpList(String name){
		System.out.println("Emp표:"+ name);
			
		}
		
		//이건 list에 추가할것	
		void add(Emp p) {
			this.list.add(p);
		}
		
		void print() {

			System.out.println("---------------------------------------------------");
			for(int i=0; i<list.size(); i++) {
				Emp p =	(Emp)list.get(i);
				System.out.print("이름: "+p.empname+"|");
				System.out.print("사원번호: "+p.emptype+"|");
				System.out.print("관리자: "+p.mgr+"|");
				System.out.print("급여: "+p.sal+"|");
				System.out.println();
				
			}
		}
		void printt() {

			System.out.println("---------------------------------------------------");
			for(int i=0; i<list.size(); i++) {
				Emp p =	(Emp)list.get(i);
				if(p.sal >= 2000) {
					System.out.println("2000이상인 직원 사원번호: "+p.emptype);
				}
			}
		}
		
		
		
}
