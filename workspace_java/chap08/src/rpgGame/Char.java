package rpgGame;

interface Char {
	/*
	 * 게임 케릭터 - 기본적인 공격과 방어능력은 있음
		[공격]
		[치료]
		[방어]
	 */
	
	void attack(); // 공격
	void therapy(); // 치료
	void defense(); // 방어
}
