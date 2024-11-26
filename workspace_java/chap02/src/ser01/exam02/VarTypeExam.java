package ser01.exam02;

public class VarTypeExam {

	public static void main(String[] args) {
		//byte가 127까지여서 가능
		byte b = 127;
		//byte가 127까지여서 b에 128을 넣어도 안됨
		//b = 128;
        //byte b1 = 100;
		//byte b2 =80;
		//b = b1 + b2;
		
		long l1 = 10;
		long l2 = 20L;
		//뒤에 0이 9개까지 넣을수 있고 더 하고 싶으면 옆에 L을 쓴다 
		long l3 = 1000000000;
		long l4 = 1000000000000000000L;
		
		char c1 = 'A';
		System.out.println("c1 =" + c1);
		
		char c2 = 67;
		System.out.println("c2 =" + c2);
		
		System.out.println("c2 -c1 =" + (c2 - c1));
		//영어 모든대문자와 모든소문자 차이는 32가 나온다.
		char c3 ='a';
		System.out.println("c3-c1 =" + (c3-c1));
		
		//""를 쓸려면 무조건 String를 써야한다.
		String s1 = "이주희";
		System.out.println("s1 ="+s1);
		// \를 사용하면 ""를 출력이 가능하다
		String s2 ="\"이주희\"";
		System.out.println("s2 ="+s2);
		
		// \t는 탭키
		String s3 ="번호\t이름";
		String s4 ="번호2\t이름";
		System.out.println("s3 ="+s3);
		System.out.println("s4 ="+s4);
		// \n은 한줄내림,엔터랑 똑같음 
		String s5 ="이주희\n김자바";
		System.out.println("s5 ="+s5);
		
		//print만 하면 옆으로 출력
		//println으로 하면 위아래로 출력
		System.out.print(1);
		System.out.print(2);
		System.out.println(3);
		
		//double은 소수점16번째까지는 맞는데
		//그이후꺼는 반올림이 되서 정확하진 않다
		//출력은 소수점17번째까지 나온다
		double d = 0.1234546437789457498888;
		System.out.println("d ="+d);
		//float은 소수점7번째까지는 맞는데
		//그이후꺼는 반올림이 되서 정확하진 않다
		//출력은 소수점8번째까지 나온다
		float f = 0.1234546667789457498888f;
		System.out.println("f ="+f);
		
		//true, false 참과거짓
		boolean b1 = true;
		boolean b2 = false;
		
		
		
	}

}
