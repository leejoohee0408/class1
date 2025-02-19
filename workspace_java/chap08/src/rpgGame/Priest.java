package rpgGame;

public class Priest implements Char {

	// 사제  - 치료
	
	@Override
	public void attack() {
		System.out.println("사제는 책으로 때립니다");

	}

	@Override
	public void therapy() {
		System.out.println("사제는 치유마법을 씁니다");

	}

	@Override
	public void defense() {
		System.out.println("봉인 마법을 씁니다");

	}

}
