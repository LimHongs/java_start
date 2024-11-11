package poly.basic;

public class CastingMain6 {
	public static void main(String[] args) {
		// instanceof 다양한 자식을 대상으로 참조 가능
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	private static void call(Parent parent) {
		parent.parentMethod();
		// Child 인스턴스인 경우 childMethod() 실행
		if(parent instanceof Child child) {
		System.out.println("Child 인스턴스 맞음");
		child.childMethod();
		}
	}
}
