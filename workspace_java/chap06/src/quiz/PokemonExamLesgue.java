package quiz;

import java.util.ArrayList;

public class PokemonExamLesgue {

	// name에 null넣음	
	String name = null;
	//ArrayList라는 정해지지 않은 배열을 list에 줬다	
	ArrayList list = new ArrayList();
	//Pokemon이라는 메소드에 10개의 정해진 배열을 생성	
	Pokemon[] arrPokemon = new Pokemon[10];
	
	//지금의 메소드에 name을 String을 줘서 문자가 나오게 가능	
	PokemonExamLesgue(String name){
//		System.out.println(arrPokemon[0]);
		System.out.println("name :"+ name);
		this.name = name;
	}
	
	//이건 list에 추가할것	
	void add(Pokemon z) {
		this.list.add(z);
	}
	
	void print() {
		for(int i=0; i<list.size(); i++) {
			Pokemon p =	(Pokemon)list.get(i);
//			System.out.println(p);
			System.out.println("이름: "+p.name);
			System.out.println("타입: "+p.type);
			System.out.println();
		}
	}
	Pokemon[] getArray(){
		return arrPokemon;
	}

}
