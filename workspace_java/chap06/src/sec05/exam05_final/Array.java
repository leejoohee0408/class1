package sec05.exam05_final;

public class Array {

//	int[] a = new int[3];
//	Array() {
//	System.out.println(a.length);
//	
//		a.length // final 정수 변수
//	}
	
	final int length; // 배열의 크기
	int[] arr;		  // 나만의 작고 소중한 배열
	int cursor = 0;	  // 현재 위치
	
	Array(int length){
		this.length = length;
		arr = new int[length];
	}
	// [1,2]	
//	void add(int x) {
//		arr[this.cursor] = x;
//		this.cursor++;
////		arr[2] = x;
//	}
//	int get(int index) {
//		return arr[index];
//	}
	
	void add(int x) {
//		arr[2]=x;
//		if(x<arr.length) {
//			System.out.println("에러 문구 출력");
//		}
		if(cursor >= this.length) {
			System.out.println("에러 문구 출력");
		}else {
			arr[cursor] =x;
			cursor++;
		}
		
		}
	
		
	//arr에 배열을 넣으면 리턴	
	int get(int index) {
		if(index < this.length) {
			return arr[index];
			
		}else {
			System.out.println("범위를 초과했습니다");
			return Integer.MIN_VALUE;
		}
		
		
	}
	
	
	
}
