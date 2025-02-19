package rpgGame;

public class GameExam {

	public static void main(String[] args) {
		
		/*
		 *  게임Exam
			케릭터들 생성
			게임의 메소드에 케릭터 넣기
		 */
		
		
		Game game = new Game();

		Warrior warrior = new Warrior();
        Char wizard = new Wizard();
        Char priest = new Priest();
        Char crusader = new Crusader();

        game.Char3(warrior);
        System.out.println("---------------------------------");
//        game.Char2(wizard);
//        System.out.println("---------------------------------");
//        game.Char2(priest);
//        System.out.println("---------------------------------");
//        game.Char2(crusader);

	}

}
