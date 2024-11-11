package poly.overriding;

public class OverridingMain {
	public static void main(String[] args) {

		// 자식 변수가 자식 인스턴스 참조
		Child child = new Child();
		System.out.println("Child -> child");
		System.out.println("value = " + child.value);
		System.out.println();
		child.method();

		//부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> parent");
		System.out.println("value = " + parent.value);
		System.out.println();
		parent.method();

		Parent poly = new Child();
		System.out.println("Parent -> child");
		System.out.println("value = " + poly.value); // 변수는 오버라이딩 x
		poly.method();

	}
}
