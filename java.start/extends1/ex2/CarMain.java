package extends1.ex2;

public class CarMain {
	// 상속: 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 한다. 기존 클래스의 속성과 기능을 그대로 물려받는것이다
	// 상속을 이용하려면 extends 키워드를 사용하면된다 . 대상은 하나만 선택할 수 있다.
	// 부모클래스 : 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
	// 자식클래스 : 부모 클래스로부터 필드와 메서드를 상속받는 클래스
	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fileUp();
	}
}
