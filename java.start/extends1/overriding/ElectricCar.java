package extends1.overriding;

public class ElectricCar extends Car {
	@Override
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}

	// extends Car 에 기능을 상속받아서 자식에서 호출이 가능함
	public void charge() {
		System.out.println("충전합니다.");
	}
}
