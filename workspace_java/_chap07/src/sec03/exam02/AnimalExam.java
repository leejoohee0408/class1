package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		
		// 추상클래스는 new 할 수 없다
//		new Animal();
		Dog dog = new Dog();
		Animal a = dog;
		a.sound();
		dog = (Dog)a;
		
		Dog dog2 = dog.clone();
		dog2.equals(dog);
		
		testSound(dog);
		
		Dog dog3 = new Dog();
		dog3.name = "마루야 죽어라";
		setName(dog3);
//		dog3 = testName(dog3);
		System.out.println(dog3.name);
		
	}
	static void testSound(Animal animal) {
		animal.sound();
	}
	
	// 얕은복사
	// 전달인자로 참조타입이 가느 경우 무조건 얕은복사로 간다
	// 전달인자로는 stack 영역의 값만 복사되어 전달된다
	static void setName(Dog dog) {
		dog.name = "마루야 찢어";
	}
	
	// 깊은 복사
	static void testName(Dog dog) {
		Dog dog2 = new Dog();
		dog2.name = dog.name;
		dog.name = "마루야 찢어";
		
		
	}
	

}
