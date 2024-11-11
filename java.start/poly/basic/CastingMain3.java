package poly.basic;

public class CastingMain3 {
	public static void main(String[] args) {
		// UpCasting 다운캐스팅과 반대로 현재 타입을 부모 타입으로 변경하는것
		Child child = new Child();
		Parent parent1 = (Parent)child; // 업캐스팅은 생략 가능, 생략 권장
		Parent parent2 = child; // 업캐스팅

		parent1.parentMethod();
		parent2.parentMethod();

	}
}
