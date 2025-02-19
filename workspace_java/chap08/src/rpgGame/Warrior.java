package rpgGame;

public class Warrior implements Char, Attackskill{

	// 전사  - 방어
	
	@Override
	public void attack() {
		System.out.println("전사가 공격을 합니다");
		

	}

	@Override
	public void therapy() {
		System.out.println("전사는 자가치유가 없습니다");
		

	}

	@Override
	public void defense() {
		System.out.println("전사가 방어를 합니다");

	}

	@Override
	public void attack1() {
		System.out.println("스킬 길로틴을 사용합니다");
		
	}

	@Override
	public void attack2() {
		System.out.println("스킬 사시미 찌르기를 사용합니다");
		
	}

}
