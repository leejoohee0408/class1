package rpgGame;

class Game {

	/*
	 * 	게임
		attack(공격)
		heal(치료)
		defence(방어)
	 */
	
	public void Char2(Char char1) {
        System.out.println("게임에 캐릭터를 추가합니다.");
        char1.attack(); // 공격
        char1.therapy(); // 치료
        char1.defense(); // 방어
        
    }
	
	public void Char3(Attackskill char1) {
		System.out.println("게임에 캐릭터를 추가합니다.");
        char1.attack1(); // 공격스킬
        char1.attack2(); // 공격스킬
        
    }
	
	public void Char3(Defenseskills char1) {
		System.out.println("게임에 캐릭터를 추가합니다.");
        char1.defense1(); // 방어스킬
        char1.defense2(); // 방어스킬
        
    }
	
}
