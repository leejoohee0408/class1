package sec01.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println(i+":"+args[i]);
		}
		
		int a = 10;
		String b = "100ewf";
		try {
			a = Integer.parseInt(b);
			
			Class clazz = Class.forName("java.long.String");
			
			System.out.println("이게 출력 된다는건 위에 예외가 없다");
		} catch(NumberFormatException e) {
			System.out.println("이게 출력 된다는건 위에 예외가 있다");
			System.out.println(e);
			e.printStackTrace(); // 에러 찾는방법
			System.out.println(e.getMessage()); // 에러 찾는방법2
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("finally 무조건 실행");
		}
		
		
	}
	
}
