package poly.ex4;


public class AbstractMain {
	public static void main(String[] args) {
		// 추상클래스 생성 불가
		//AbstractAnimal animal = new AbstractAnimal();

		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(caw);

		MoveAnimal(cat);
		MoveAnimal(dog);
		MoveAnimal(caw);
	}
	private static void soundAnimal ( AbstractAnimal animal) {
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 종료");
	}

	private static void MoveAnimal(AbstractAnimal animal) {
		System.out.println("동물 이동 테스트 시작");
		animal.move();
		System.out.println("동물 이동 종료");

	}
}
