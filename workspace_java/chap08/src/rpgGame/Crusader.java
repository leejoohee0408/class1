package rpgGame;

public class Crusader implements Char {

	// 성전사 - 방어, 치료
	
	@Override
	public void attack() {
		System.out.println("성전사가 칼로 공격합니다");

	}

	@Override
	public void therapy() {
		System.out.println("성전사가 책으로 치유를 합니다");

	}

	@Override
	public void defense() {
		System.out.println("성전사가 책으로 공격을 막습니다");

	}

}
