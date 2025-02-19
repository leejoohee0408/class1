package rpgGame;

public class Wizard implements Char {

	// 마법사  - 공격
	
	@Override
	public void attack() {
		System.out.println("마법사가 메테오를 날립니다");

	}

	@Override
	public void therapy() {
		System.out.println("마법사는 치유마법따위 못사용합니다");

	}

	@Override
	public void defense() {
		System.out.println("마법사가 실드 마법을 사용합니다");

	}

}
