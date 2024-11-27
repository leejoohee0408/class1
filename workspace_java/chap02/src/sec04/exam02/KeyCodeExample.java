package sec04.exam02;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExample {

	public static void main(String[] args) {
		
		int keyCode;
		
//		try {
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//			
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
		//스캔 하는법
		Scanner scanner = new Scanner(System.in);
		String inputDate = scanner.nextLine();
		System.out.println("inputData :" + inputDate);
		//스캔 한걸 2번째로 풀수있다.
		int input = scanner.nextInt();
		System.out.println("input :" + input);
		
		
	
	}

}
