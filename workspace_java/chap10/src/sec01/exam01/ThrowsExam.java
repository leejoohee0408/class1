package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {
		
		try {
			test();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			try {
				try {
					test2();
				} catch (HumanException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				System.out.println("/*/*/*/*");
				e.printStackTrace();
			}
		}catch(NumberFormatException nfe) {
			if("123".equals(nfe.getMessage())) {
				System.out.println("의도한 오류로 메세지로 전달할 수 있다");
			}
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\text.txt");
			// 뭔가 처리 도중
			// 예외 발생
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resource
		// 위에것을 축소한 것
		// close() 자동 실행
		// Closeable 인터페이스가 있는 클래스만 넣을 수 있습니다.
		try(
			FileInputStream fis2 = new FileInputStream("c:\\text.txt");
		){
			System.out.println(fis2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void test() throws ClassNotFoundException, IOException  {
		Class.forName("준규 바보");
	}
	
	static void test2() throws IOException,HumanException{
		System.out.println(0);
		int a =10;
		if(a<100) {
			throw new HumanException("123");			
		}else {
			throw new IOException("456");
		}
		
	}

}
