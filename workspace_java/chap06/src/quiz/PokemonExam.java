package quiz;

public class PokemonExam {

	public static void main(String[] args) {
	
		 //	Pokemon이라는 메소드를 p1에 가져옴	
		 Pokemon p1 = new Pokemon();
		 // p1안에있는 name에 피카츄추가		 
		 p1.name = "피카츄";
		// p1안에있는 type에 전기추가
		 p1.type = "전기";
		 
		 //Pokemon이라는 메소드를 p2에 가져옴	
		 Pokemon p2 = new Pokemon();
		// p2안에있는 name에 파이리추가	
		 p2.name = "파이리";
		// p2안에있는 type에 불추가
		 p2.type = "불";
		 
		 //	PokemonExamLesgue것을 pl에 저장
		 // 근데System.out.println("name :"+ name);	해서 문자로 넣으면 관동이 나온다	 
		 PokemonExamLesgue pl =	new PokemonExamLesgue("관동");
			pl.add(p2);
			pl.add(p1);
			pl.print();
			
			Pokemon[] a = pl.getArray();
		
	}

}
