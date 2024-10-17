package extends1.ex3;

public class ElectricCar extends Car {
	// extends Car 에 기능을 상속받아서 자식에서 호출이 가능함
	public void charge() {
		System.out.println("충전합니다.");
	}
}
