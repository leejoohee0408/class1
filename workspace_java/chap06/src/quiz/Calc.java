package quiz;

import java.util.ArrayList;

public class Calc {
	
	// + - * / %
	// 각각 메소드 만들기
	
	/**
	 * compute
	 * 
	 * @param
	 * @return
	 */
	
		/**
		 * 
		 */
	
	
	
	
	/**
	 * compute 출력
	 * 
	 * int a 숫자, int cut 숫자
	 * a-cut,a+cut,a*cut,a/cut을 한다
	 * 
	 * 그걸 받아서 CalcExam에 출력한다
	 * 
	 * 
	 *  
	 */
	
	double compute(double i, String s, double ii) {
		 
        if (s.equals("+")) {
            return i + ii;
        } else if (s.equals("-")) {
            return i - ii;
        } else if (s.equals("*")) {
            return i * ii;
        } else if (s.equals("/")) {
            	return i / ii;  
            }else if (s.equals("%")){
            	 return i % ii;
            }else {
            	System.out.println("+ - * /를 써주세요");
            	 return i + ii;
            }
       
        
      
        
        
        
        
        
        
        
        
        
	}
	
	
	
	
	
}
