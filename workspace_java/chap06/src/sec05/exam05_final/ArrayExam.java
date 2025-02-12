package sec05.exam05_final;

public class ArrayExam {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		a[4] =1;
		
		// Array 구현
		// 생성하고 나서
		// add()에 값을 넣으면 자동으로 현재 index에 추가
		
		// 단, 크기를 벗어나면 "에러 문구 출력"
		// 	에러 문구 출력이라고 나올려면 만약에 크기가 벗어나면 문자로	
		//	"에러 문구 출력"이라고 나오게한다
		
		// get()에 index를 넣으면 그 index의 값을 return함		
		
		// 배열의 5를 넘어가면 에러 문구가 나오게한다
		// arr[cursor]이 0에서 1씩 증가하게 했다
		// arr[]이 1씩 증가하는데 a가 [5]이상이면 에러가난다
		// 그래서 a[5]일때 에러가 나는게 아니라 에러 문구 출력이라는 문구가 나오게하고
		// 스톱한다		
		
		//arr안에있는[cursor]가Array(int length)안에있는 this.length 보다 크면
		//에러 문구 출력을 나오게 한다
		
	Array b	= new Array(3);
	b.add(20);
	b.add(30);
	b.add(40);
	b.add(50);
	System.out.println(b.get(0));
	System.out.println(b.get(1));
	System.out.println(b.get(2));
	System.out.println(b.get(100));
	
	

	}

}
