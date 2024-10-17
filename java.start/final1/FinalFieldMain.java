package final1;

public class FinalFieldMain {
	public static void main(String[] args) {
		System.out.println("생성자 초기화");
		ConstructInit constructInit1 = new ConstructInit(10);
		ConstructInit constructInit2 = new ConstructInit(20);
		System.out.println(constructInit1.value);
		System.out.println(constructInit2.value);

		System.out.println("필드 초기화");
		fieldInit fieldInit1 = new fieldInit();
		fieldInit fieldInit2 = new fieldInit();
		fieldInit fieldInit3 = new fieldInit();

		System.out.println(fieldInit1.value);
		System.out.println(fieldInit2.value);
		System.out.println(fieldInit3.value);

		System.out.println("상수");
		System.out.println(fieldInit.CONST_VALUE);

	}
}
