package text3;

public class Text3 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println(" ");
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
		}
		
		for(int i=1; i<=3; i++) {
			System.out.println(" ");
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
				for(int j=i; j<=2*3-i; j++) {
					System.out.print("*");
				
			}
		}
		System.out.println();
		
		
		for(int q=2; q<=9; q++) {
//			System.out.println("2"+"x"+q+"="+(q*2));
			System.out.println(q+"단");
			for(int qq=1; qq<=9; qq++) {
				System.out.println(q+"x"+qq+"="+(qq*q));
			}
		}
		
		
		
		
		
		
		

	}

}
