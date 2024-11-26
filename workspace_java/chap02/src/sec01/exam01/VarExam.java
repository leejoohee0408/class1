package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		
	//한줄 주석
	/* 범위 주석
	 * 
	 * 여러줄 가능
	 */

	 //이클립스 단축키
	 /*
	  * 한줄 지우기 : ctrl + d 	
	  * 한줄 복사   : ctrl + Alt + 위아래 방향키
	  * 한줄 이동   : Alt + 위아래 방향키
	  * 코드 정렬	: ctrl + shift + f
	  * 주석 단추키	: ctrl +  /
	  * 
	  */
	System.out.println("Hello world 한글");	
	//변수 value 선언
	int value = 30;//선언과 동시에 초기화
	
	//=을 기준으로 오른쪽 먼저 실행
	//value에 있는 값을 꺼내서 +10한 결과를
	//result 변수에 저장
	int result = value + 10;
	int aaa = result + 10;
	//변수 result값을 읽고 콘솔에 출력
	System.out.println(aaa); //aaa 값 가져오기
	System.out.println(value); //value 값 가져오기
	result = 100;
	System.out.println(result); //result 값을 가져오는게
								//아니라 위에꺼로 리셋
	
	}

}
